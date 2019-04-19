package com.een.cn.util;

import java.sql.JDBCType;

/**
 * 类型转换器
 * 
 * @author leen_pc
 *
 */
public class TypeConvert {
    
	/**
	 * 将java类型转成 短类型
	 * 
	 * @param javaType
	 * @return
	 */
	public static String javaTypeConvert(String javaType) {
        if(javaType.contains("Long")) {
        	return "long";
        } 
        
        if(javaType.contains("String")) {
        	return "String";
        } 
        if(javaType.contains("Integer")) {
        	return "int";
        } 
        if(javaType.contains("Boolean")) {
        	return "boolean";
        } 
        if(javaType.contains("Timestamp")) {
        	return "Date";
        } 
        
        if(javaType.contains("Byte")) {
        	return "int";
        } 
        
        if(javaType.contains("Short")) {
        	return "int";
        }
        
		return javaType; 
	}
	
	
    /**
     * 
     * @param javaType
     * @return
     */
	public static String jdbcTypeConvert(String columnType) { 
		//<result property="FLD_NUMBER" column="FLD_NUMBER"  javaType="double" jdbcType="NUMERIC"/>
//	  <result property="FLD_VARCHAR" column="FLD_VARCHAR" javaType="string" jdbcType="VARCHAR"/>
//	  <result property="FLD_DATE" column="FLD_DATE" javaType="java.sql.Date" jdbcType="DATE"/>
//	  <result property="FLD_INTEGER" column="FLD_INTEGER"  javaType="int" jdbcType="INTEGER"/>
//	  <result property="FLD_DOUBLE" column="FLD_DOUBLE"  javaType="double" jdbcType="DOUBLE"/>
//	  <result property="FLD_LONG" column="FLD_LONG"  javaType="long" jdbcType="INTEGER"/>
//	  <result property="FLD_CHAR" column="FLD_CHAR"  javaType="string" jdbcType="CHAR"/>
//	  <result property="FLD_BLOB" column="FLD_BLOB"  javaType="[B" jdbcType="BLOB" />
//	  <result property="FLD_CLOB" column="FLD_CLOB"  javaType="string" jdbcType="CLOB"/>
//	  <result property="FLD_FLOAT" column="FLD_FLOAT"  javaType="float" jdbcType="FLOAT"/>
//	  <result property="FLD_TIMESTAMP" column="FLD_TIMESTAMP"  javaType="java.sql.Timestamp" jdbcType="TIMESTAMP"/>}
		//ARRAY, BIT, TINYINT, SMALLINT, INTEGER, BIGINT, FLOAT, REAL, DOUBLE, NUMERIC, DECIMAL, CHAR, VARCHAR, LONGVARCHAR, DATE, TIME, TIMESTAMP, BINARY, VARBINARY, LONGVARBINARY, NULL, OTHER, BLOB, CLOB, BOOLEAN, CURSOR, UNDEFINED, NVARCHAR, NCHAR, NCLOB, STRUCT, JAVA_OBJECT, DISTINCT, REF, DATALINK, ROWID, LONGNVARCHAR, SQLXML, DATETIMEOFFSET;

		if("INT".equals(columnType)) {
			return JDBCType.INTEGER.getName();
		} 
		if("INT UNSIGNED".equals(columnType)) {
			return JDBCType.INTEGER.getName();
		}
		
		if("DATETIME".equals(columnType)) {
			return JDBCType.DATE.getName();
		} 
		
		if("MEDIUMBLOB".equals(columnType)) {
			return JDBCType.LONGVARBINARY.getName();
		}
        
		return columnType; 
	
	}
}
