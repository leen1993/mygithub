package com.rekj.core.db;

public class DbContextHolder {
	protected static final ThreadLocal<String> contextHolder = new ThreadLocal();
	
	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDbType() {
		String str = (String) contextHolder.get();
		if ((null == str) || ("".equals(str)))
			str = "";
		return str;
	}

	public static void clear() {
		contextHolder.remove();
	}
}
