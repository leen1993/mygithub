package com.rekj.core.table;

import org.springframework.beans.factory.FactoryBean;

import com.rekj.core.mybatis.Dialect;
import com.rekj.core.mybatis.dialect.MySQLDialect;
import com.rekj.core.mybatis.dialect.OracleDialect;
import com.rekj.core.mybatis.dialect.SQLServerDialect;

public class DialectFactoryBean implements FactoryBean<Dialect> {
	private Dialect dialect;
	private String dbType = "";

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public Dialect getObject() throws Exception {
		this.dialect = getDialect(this.dbType);
		return this.dialect;
	}
	
//	public static Dialect getDialect(ProxoolDataSource dataSource) throws Exception {
//		if (dataSource == null || StringUtils.isEmpty(dataSource.getAlias())) {
//			return new SQLServerDialect();
//		}
//		
//		String alias = dataSource.getAlias();
//		if (alias.contains("sqlserver")) {
//			return new SQLServerDialect();
//		} else if (alias.contains("oracle")) {
//			return new OracleDialect();
//		} else if (alias.contains("mysql")) {
//			return new MySQLDialect();
//		} else {
//			throw new Exception("没有设置合适的数据库类型");
//		}
//	}

	public static Dialect getDialect(String dbType) throws Exception {
		Dialect dialect = null;
		if (dbType.equals("sqlserver"))
			dialect = new SQLServerDialect();
		else if (dbType.equals("oracle"))
			dialect = new OracleDialect();
		else if (dbType.equals("mysql"))
			dialect = new MySQLDialect();
		else {
			throw new Exception("没有设置合适的数据库类型");
		}
		return dialect;
	}

	public static Dialect getDialectByDriverClassName(String driverClassName)
			throws Exception {
		Dialect dialect = null;
		if (driverClassName.contains("oracle"))
			dialect = new OracleDialect();
		else if (driverClassName.equals("mysql"))
			dialect = new MySQLDialect();
		else if (driverClassName.equals("h2"))
			throw new Exception("没有设置合适的数据库类型");
	
		return dialect;
	}

	public Class<?> getObjectType() {
		return Dialect.class;
	}

	public boolean isSingleton() {
		return true;
	}
}
