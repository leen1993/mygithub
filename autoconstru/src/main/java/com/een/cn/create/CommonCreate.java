package com.een.cn.create;

import com.een.cn.pojo.Pojo;
import com.een.cn.util.ArrayUtil;
import com.een.cn.util.ConfigUtil;
import com.een.cn.util.PojoUtil;

public class CommonCreate {
	/**
     * 设置文件存放位置
     * 
     * @param p
     */
    protected void setFilePath(Pojo p, String folderType) {
        String[] ts = p.getTableName().split("_");
        StringBuffer path = new StringBuffer("");
        String packageP = ConfigUtil.get("companyUrl").replaceAll("\\.", "\\/");
        path.append(packageP + "/");
        
        // 表名包路径部分
        for (int i = 0; i < ts.length - 1; i++) {
        	ts[i] = PojoUtil.isHoldWord(ts[i]);
            path.append(ts[i] + "/");
        }

        path.append(folderType + "/");
        path.append(p.getFileName());
        p.setFilePath(ConfigUtil.get("basePath") + path.toString());
    }

    /**
     * 设置包名
     * 
     * @param p
     */
    protected void setPackageName(Pojo p, String folderType) {
        String[] ts = p.getTableName().split("_");
        
        // 保留字校验
        for (int i = 0; i < ts.length; i++) {
        	ts[i] = PojoUtil.isHoldWord(ts[i]);
		}
        
        // 生成pojo文件的时候做这一步， 设置后端文件的父级包
        if(ConfigUtil.get("package.pojo").equals(folderType)) {
            StringBuffer sb = new StringBuffer("");
        	for(int i = 0; i < ts.length - 1; i++) {
        	  sb.append(ts[i]);
        	  if(i < ts.length - 2) {
        		  sb.append(".");
        	  }
            }
        	if(ts.length > 1) {
                p.setParentPackage(ConfigUtil.get("companyUrl")+"." + sb);
        	} else {
        		p.setParentPackage(ConfigUtil.get("companyUrl"));
        	}
        }
        
        ts[ts.length - 1] = folderType;
        p.setPackageName(ConfigUtil.get("companyUrl") + "." + ArrayUtil.join(ts, "."));
    }
    
}
