package com.een.cn.create;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.een.cn.DataManager;
import com.een.cn.pojo.Field;
import com.een.cn.pojo.Pojo;
import com.een.cn.util.ConfigUtil;
import com.een.cn.util.StringUtil;

@Component
public class CreateService extends CommonCreate implements CreateFile {
    
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
		String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.service")));
		StringBuffer sb = null;
        for (int i = 0; i < pojos.size(); i++) {
            sb = new StringBuffer(readFileToString);
            Pojo pojo = pojos.get(i);
			sb = replace(sb, FinalVariable.TABLE_NAME, pojo.getTableName());
            sb = replace(sb, FinalVariable.PACKAGE_NAME, pojo.getPackageName());
            sb = replace(sb, FinalVariable.CREATE_DATE, pojo.getCreateDate());
            sb = replace(sb, FinalVariable.AUTHOR, pojo.getAuthor());
            sb = replace(sb, FinalVariable.POJO_NAME, pojo.getPojoName());
            // 设置import
            String imports = joinImports(pojo.getImportClasses());
            sb = replace(sb, FinalVariable.IMPORT, imports);
            sb = replace(sb, FinalVariable.DOWNCASE_FIRST_POJO_NAME, StringUtil.makeFirstLetterLowerCase(pojo.getPojoName()));
            FileUtils.writeStringToFile(new File(pojo.getFilePath()), sb.toString());
        }
	}

	/**
	 * 设置import
	 * 
	 * @param importClasses
	 * @return
	 */
	private String joinImports(List<String> importClasses) {
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < importClasses.size(); i++) {
    		sb.append(importClasses.get(i));
    		sb.append("\r\n");
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
     * 设置专门属性
     * 
     */
	public void setOwnData(List<Pojo> pojos) {
		for (Pojo p : pojos) {
			setFileName(p);
			setPackageName(p, ConfigUtil.get("package.service"));
			setFilePath(p, ConfigUtil.get("package.service"));
			setImport(p);
			setFullName(p);
		}
	}

	/**
	 * 动态属性在这里设置
	 * 
	 */
	public void setImport(Pojo p) {
 		StringBuffer sb = new StringBuffer("");
 		List<String> imports = new ArrayList<String>();
 		imports.add("import "+ p.getParentPackage() + "."+ ConfigUtil.get("package.pojo") +"."+ p.getPojoName() +";");
 		imports.add("import "+ p.getParentPackage() + "."+ ConfigUtil.get("package.dao") +"."+ p.getPojoName() +"Dao;");
 		p.setImportClasses(imports);
	}
    

	public void setFilePath(Pojo p, String folderType) {
		super.setFilePath(p, folderType);
	}

	public void setPackageName(Pojo p, String folderType) {
		super.setPackageName(p, folderType);
	}

	public void setFileName(Pojo p) {
        p.setFileName(p.getPojoName() + "Service.java");		
	}

	public void setFullName(Pojo p) {
		p.setFullName(p.getPackageName() + "." + p.getPojoName() + "Service");
	}


}
