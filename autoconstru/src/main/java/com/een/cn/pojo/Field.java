package com.een.cn.pojo;

import java.util.List;

/**
 * 字段属性
 * 
 * @author leen_pc
 *
 */
public class Field {
    
	/**类字段名*/
	private String name;
	
	/**字段类型*/
	private String type;
	
	/**jdbcType*/
	private String jdbcType;
	
	/**字段长度*/
	private int length;
	
	/**是否为主键*/
	private boolean primaryKey;
	
	/**外键*/
	private List<ForeginKey> foreginKeys;
	
	/**是否可为空*/
	private boolean required;
	
	/**是否自增*/
	private boolean inc;
	
	/**注释内容*/
	private String annotation;
	
	/**数据库字段*/
	private String dbField;

	public List<ForeginKey> getForeginKeys() {
		return foreginKeys;
	}

	public void setForeginKeys(List<ForeginKey> foreginKeys) {
		this.foreginKeys = foreginKeys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean getRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isInc() {
		return inc;
	}

	public void setInc(boolean inc) {
		this.inc = inc;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getDbField() {
		return dbField;
	}

	public void setDbField(String dbField) {
		this.dbField = dbField;
	}

	public String getJdbcType() {
		return jdbcType;
	}

	public void setJdbcType(String jdbcType) {
		this.jdbcType = jdbcType;
	}

}
