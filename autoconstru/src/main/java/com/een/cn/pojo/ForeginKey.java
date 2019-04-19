package com.een.cn.pojo;

/**
 * 外键实体
 * 
 * @author leen_pc
 *
 */
public class ForeginKey {
    
	// 外键名字
	private String fkName;
	
	// 主关键字
	private String pktableName;
	
	// 主关键字列名
	private String pkcolumnName;
	
	// 外关键字
	private String fktableName;
	
	// 外关键字列名
	private String fkcolumnName;

	public String getFkName() {
		return fkName;
	}

	public void setFkName(String fkName) {
		this.fkName = fkName;
	}

	public String getPktableName() {
		return pktableName;
	}

	public void setPktableName(String pktableName) {
		this.pktableName = pktableName;
	}

	public String getPkcolumnName() {
		return pkcolumnName;
	}

	public void setPkcolumnName(String pkcolumnName) {
		this.pkcolumnName = pkcolumnName;
	}

	public String getFktableName() {
		return fktableName;
	}

	public void setFktableName(String fktableName) {
		this.fktableName = fktableName;
	}

	public String getFkcolumnName() {
		return fkcolumnName;
	}

	public void setFkcolumnName(String fkcolumnName) {
		this.fkcolumnName = fkcolumnName;
	}
	
}
