package com.een.cn.pojo;

import java.util.List;

/**
 * 表信息
 * 
 * @author leen_pc
 *
 */
public class Table {
    
	// 表名
	private String tableName;
	
	// 表注释
	private String tableComment;
	
	// 当前表的数据量
	private int dataNum;
	
	// 字段数
	private int fieldNum;
	
	// 主键列表
	private List<Field> primaryKeys;
	
	// 外键列表
	private List<ForeginKey> foreignKeys;
	
	// 索引
	private List<String> indexs;
	
	// 对应的pojo
	private Pojo pojo;

	public Pojo getPojo() {
		return pojo;
	}

	public void setPojo(Pojo pojo) {
		this.pojo = pojo;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public int getDataNum() {
		return dataNum;
	}

	public void setDataNum(int dataNum) {
		this.dataNum = dataNum;
	}

	public int getFieldNum() {
		return fieldNum;
	}

	public void setFieldNum(int fieldNum) {
		this.fieldNum = fieldNum;
	}


	public List<Field> getPrimaryKeys() {
		return primaryKeys;
	}

	public void setPrimaryKeys(List<Field> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}

	public List<ForeginKey> getForeignKeys() {
		return foreignKeys;
	}

	public void setForeignKeys(List<ForeginKey> foreignKeys) {
		this.foreignKeys = foreignKeys;
	}

	public List<String> getIndexs() {
		return indexs;
	}

	public void setIndexs(List<String> indexs) {
		this.indexs = indexs;
	}
	
}
