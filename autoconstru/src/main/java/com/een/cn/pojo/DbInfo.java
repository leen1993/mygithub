package com.een.cn.pojo;

import java.util.List;

/**
 * 数据库实体
 * 
 * @author leen_pc
 *
 */
public class DbInfo {
    
	private String dbName;
	
	// 表数量
	private int tableNum;
	
	// 表信息
	private List<Table> tables;
	
	public String getDbName() {
		return dbName;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}
