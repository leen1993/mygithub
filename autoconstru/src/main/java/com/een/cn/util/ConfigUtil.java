package com.een.cn.util;

import java.util.Properties;

public class ConfigUtil {
	
	public static String get(String propertyKey) {
		Properties properties = (Properties) AppUtil
				.getBean("configproperties");
		return properties.getProperty(propertyKey);
	}
	
	public static boolean getBoolean(String propertyKey) {
		Properties properties = (Properties) AppUtil
				.getBean("configproperties");
		return Boolean.parseBoolean(properties.getProperty(propertyKey));
	}
	
	
}
