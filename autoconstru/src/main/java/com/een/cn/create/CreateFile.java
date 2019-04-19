package com.een.cn.create;

import java.io.IOException;
import java.util.List;

import com.een.cn.DataManager;
import com.een.cn.pojo.Pojo;

public interface CreateFile {
    
	/**入口方法*/
	public void create(List<Pojo> pojos) throws IOException;
	
	/**主逻辑*/
	public void mainLogic(List<Pojo> pojos) throws IOException;
	
	/**类进来之后一定要实现设置数据的方法*/
	public void setOwnData(List<Pojo> pojos);
	
	/**设置文件路径*/
	public void setFilePath(Pojo p, String folderType);
	
	/**设置包名*/
	public void setPackageName(Pojo p, String folderType);
	
	/**设置文件名*/
	public void setFileName(Pojo p);
	
	/**这是依赖包 import*/
	public void setImport(Pojo p);
	
	/**设置全名*/
	public void setFullName(Pojo p);
}
