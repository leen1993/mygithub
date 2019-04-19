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
import com.een.cn.util.StringUtil;


/**
 * 创建Pojo
 * 
 * @author leen_pc
 *
 */
@Component
public class CreatePojo extends CommonCreate implements CreateFile{
    
    public void create(List<Pojo> pojos) throws IOException {
    	
    	// 设置专有属性
    	setOwnData(pojos);
    	
        // 主逻辑 替换标识符号
        mainLogic(pojos);
    }

    /**
     * 替换逻辑
     * 
     * @param pojos
     * @throws IOException
     */
	public void mainLogic(List<Pojo> pojos) throws IOException {
		String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.pojo")));
		StringBuffer sb = null;
        for (int i = 0; i < pojos.size(); i++) {
            sb = new StringBuffer(readFileToString);
            Pojo pojo = pojos.get(i);
			sb = replace(sb, FinalVariable.TABLE_NAME, pojo.getTableName());
            sb = replace(sb, FinalVariable.PACKAGE_NAME, pojo.getPackageName());
            sb = replace(sb, FinalVariable.CREATE_DATE, pojo.getCreateDate());
            sb = replace(sb, FinalVariable.AUTHOR, pojo.getAuthor());
            sb = replace(sb, FinalVariable.POJO_NAME, pojo.getPojoName());
            // 增加get、set方法
            String fields = createGetMethod(pojo.getFieldList());
            sb = replace(sb, FinalVariable.FIELDS, fields);
            FileUtils.writeStringToFile(new File(pojo.getFilePath()), sb.toString());
        }
	}
    
    private String createGetMethod(List<Field> fields) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < fields.size(); i++) {
    		sb.append("\r\n    @JsonProperty(value=\""+fields.get(i).getName()+"\") ");
    		sb.append("\r\n    private ");
			sb.append(fields.get(i).getType());
			sb.append(" " + fields.get(i).getName() + "; \r\n");
		}
    	
    	for (int i = 0; i < fields.size(); i++) {
    		sb.append("\r\n    @JsonProperty(value=\""+fields.get(i).getName()+"\") ");
    		sb.append("\r\n    public ");
			sb.append(fields.get(i).getType());
		    sb.append(" get");
			sb.append(StringUtil.makeFirstLetterUpperCase(fields.get(i).getName()));
			sb.append("() {\r\n");
			sb.append("        return this." + fields.get(i).getName() + ";");
			sb.append("\r\n    };\r\n");
		}
		
		for (int i = 0; i < fields.size(); i++) {
			sb.append("\r\n    @JsonProperty(value=\""+fields.get(i).getName()+"\") ");
			sb.append("\r\n    public ");
			sb.append(fields.get(i).getType());
			sb.append(" set");
			sb.append(StringUtil.makeFirstLetterUpperCase(fields.get(i).getName()));
			sb.append("(");
			sb.append(fields.get(i).getType());
			sb.append(" " + fields.get(i).getName());
			sb.append(") {");
			sb.append("\r\n        return this." + fields.get(i).getName() + "=" + fields.get(i).getName() + ";");
			sb.append("\r\n    };\r\n");
		}
		return sb.toString();
	}

	/**
     * 替换方法替换所有标识符
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

    /**
     * 针对实体类设置专门属性
     * 
     */
	public void setOwnData(List<Pojo> pojos) {
		for (Pojo p : pojos) {
			setFileName(p);
			setPackageName(p, ConfigUtil.get("package.pojo"));
			setFilePath(p, ConfigUtil.get("package.pojo"));
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
        p.setFileName(p.getFileName() + ".java");		
	}

	public void mainReplace() {
		
	}

	public void setImport(Pojo p) {
		
	}

	public void setFullName(Pojo p) {
		p.setFullName(p.getPackageName() + "." + p.getPojoName());
	}
    
}
