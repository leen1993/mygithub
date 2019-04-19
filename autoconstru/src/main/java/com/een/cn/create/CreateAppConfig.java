package com.een.cn.create;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.een.cn.util.ConfigUtil;

@Component
public class CreateAppConfig {
    
    public void create() throws IOException {
        mainLogic();
    }

    /**
     * 替换逻辑
     * 
     * @param pojos
     * @throws IOException
     */
	public void mainLogic() throws IOException {
		String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.appConfig")));
		StringBuffer sb = null;
        sb = new StringBuffer(readFileToString);
		sb = replace(sb, FinalVariable.DATABASE_DRIVER, ConfigUtil.get("db.driverClass"));
		sb = replace(sb, FinalVariable.DATABASE_URL, ConfigUtil.get("db.url"));
		sb = replace(sb, FinalVariable.DATABASE_USERNAME, ConfigUtil.get("db.user"));
		sb = replace(sb, FinalVariable.DATABASE_PASSWORD, ConfigUtil.get("db.password"));
        String fileName = sb.substring(1, sb.indexOf("#", 2));
        FileUtils.writeStringToFile(new File(fileName), sb.toString());
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




}
