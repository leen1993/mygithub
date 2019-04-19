package com.een.cn.create;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.een.cn.DataManager;
import com.een.cn.pojo.Field;
import com.een.cn.pojo.Pojo;
import com.een.cn.util.ConfigUtil;

@Component
public class CreateXml extends CommonCreate implements CreateFile {
    
    public void create(List<Pojo> pojos) throws IOException {
        
    	// 定制化pojo属性
    	setOwnData(pojos);
    	
    	// 主要逻辑
    	mainLogic(pojos);
    	
    }

    /**
     * 主要逻辑
     * 
     */
    public void mainLogic(List<Pojo> pojos) throws IOException {
    	 // 读取模板文件
        String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.mapper")));
        
        // 替换模板文件中的指定表意符
        StringBuffer sb = null;
        
        for (int i = 0; i < pojos.size(); i++) {
            sb = new StringBuffer(readFileToString);
            Pojo pojo = pojos.get(i);
			sb = replace(sb, FinalVariable.TABLE_NAME, pojo.getTableName());
            sb = replace(sb, FinalVariable.PACKAGE_NAME, pojo.getPackageName());
            sb = replace(sb, FinalVariable.CREATE_DATE, pojo.getCreateDate());
            sb = replace(sb, FinalVariable.AUTHOR, pojo.getAuthor());
            sb = replace(sb, FinalVariable.POJO_NAME, pojo.getPojoName());
            sb = replace(sb, FinalVariable.FULL_NAME, pojo.getFullName());
            
            if(pojo.getPrimaryKeys().size() > 0) {
              sb = replace(sb, FinalVariable.PRIMARYKEY, pojo.getPrimaryKeys().get(0).getName());
            } else {
            	sb = replace(sb, FinalVariable.PRIMARYKEY, "id");
            }
            
            // 所有字段拼接
            String fields = joinFields(pojo.getFieldList());
            sb = replace(sb, FinalVariable.FIELDS, fields);
            
            // primary拼接
            String primary = joinPrimary(pojo.getPrimaryKeys());
            sb = replace(sb, FinalVariable.PRIMARYSTR, primary);
            
            // 添加的value
            String insertValues = joinInsert(pojo.getFieldList());
            sb = replace(sb, FinalVariable.INVERT_VAL, insertValues);
            
            // 更新的value
            String updateValues = joinUpdate(pojo.getFieldList());
            sb = replace(sb, FinalVariable.UPDATE_VAL, updateValues);
            
            // 拼接动态条件
            String conditions = joinConditions(pojo.getFieldList());
            sb = replace(sb, FinalVariable.CONDITION, conditions);
            
            // 拼接resultMap
            String resultMap = joinResultMap(pojo.getFieldList());
            sb = replace(sb, FinalVariable.RESULT_MAP, resultMap);
            
            FileUtils.writeStringToFile(new File(pojo.getFilePath()), sb.toString());
        }
	}

    private String joinResultMap(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
        	Field field = fields.get(i);
        	/*
        	 * <id property="registerId" column="REGISTER_ID" jdbcType="VARCHAR" />	
			   <result property="totCost" column="tot_cost" jdbcType="VARCHAR"/>
			   <result property="triageState" column="triage_state" jdbcType="VARCHAR" />
        	 * 
        	 * */
        	if(field.isPrimaryKey()) {
        		sb.append("<id property='"+field.getName()+"' column='"+field.getDbField()+"' jdbcType='"+field.getJdbcType()+"'/>");
        	} else {
        		sb.append("<result property='"+field.getName()+"' column='"+field.getDbField()+"' jdbcType='"+field.getJdbcType()+"'/>");
        	}
        	
        	if(i < fields.size() - 1) {
        		sb.append("\r\n            ");
        	}
		}
		return sb.toString();
	}

	/**
     * 添加判断条件
     * 
     * @param fields
     * @return
     */
    private String joinConditions(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
        	Field field = fields.get(i);
        	// <if test="id != null"> </if>
        	sb.append("<if test='"+field.getName()+" != null'>and "+field.getDbField() + "=#{"+field.getName()+"}</if>");
        	if(i < fields.size() - 1) {
        		sb.append("\r\n            ");
        	}
		}
		return sb.toString();
	}

	/**
     * 更新拼接
     * 
     * see_serial_id = #{seeSerialId,jdbcType=VARCHAR},
     * @param fields
     * @return
     */
    private String joinUpdate(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
        	Field field = fields.get(i);
        	sb.append(field.getDbField() + " = #{"+ field.getName() + "}");
        	if(i < fields.size() - 1) {
        		sb.append(",\r\n            ");
        	}
		}
		return sb.toString();
	}

    /**
     * 拼接插入
     * 
     * #{scheduleTimeId, jdbcType=VARCHAR}
     * 
     * @param fields
     * @return
     */
	private String joinInsert(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
        	Field field = fields.get(i);
        	sb.append("#{"+ field.getName() + "}");
        	if(i < fields.size() - 1) {
        		sb.append(",\r\n            ");
        	}
		}
		return sb.toString();
	}

	private String joinPrimary(List<Field> primaryKeys) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < primaryKeys.size(); i++) {
    		sb.append(primaryKeys.get(i).getDbField()+"="+ "#{"+primaryKeys.get(i).getName()+"}");
    		if(i < primaryKeys.size() - 1) {
    			sb.append(" and ");
    		}
		}
    	
		return sb.toString();
	}

    /**
     * 拼接字段
     * 
     * @param fields
     * @return
     */
	private String joinFields(List<Field> fields) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < fields.size(); i++) {
    		sb.append(fields.get(i).getDbField());
    		if(i < fields.size() - 1) {
    			sb.append(", \r\n            ");
    		}
    	}
		return sb.toString();
	}

	/**
     * 替换方法
     * 
     * @param sb 替换的字符串
     * @param replaceStr 标识符
     * @param newStr 替换为
     * @return
     */
    private StringBuffer replace(StringBuffer sb, String replaceStr, String newStr) {
    	int packageNameStart = 1;
    	int packageNameEnd = 0;
    	while(true) {
            packageNameStart = sb.indexOf(replaceStr, packageNameEnd);
            if(packageNameStart == -1) break;
            packageNameEnd = packageNameStart + replaceStr.length();
            sb = sb.replace(packageNameStart, packageNameEnd, newStr);
        }
        return sb;
    }

	public void setOwnData(List<Pojo> pojos) {
		for (Pojo p : pojos) {
			setFileName(p);
			setPackageName(p, ConfigUtil.get("package.mapper"));
			setFilePath(p, ConfigUtil.get("package.mapper"));
			setFullName(p);
		}
	}

	public void setFilePath(Pojo p, String folderType) {
		super.setFilePath(p, folderType);
	}

	public void setPackageName(Pojo p, String folderType) {
		super.setPackageName(p, folderType);
	}


	public void setFileName(Pojo p) {
        p.setFileName(p.getPojoName() + ".xml");		
	}

	public void setImport(Pojo p) {
		
	}

	public void setFullName(Pojo p) {
		p.setFullName(p.getParentPackage() + "." + ConfigUtil.get("package.pojo")+ "." + p.getPojoName());
	}
    
}
