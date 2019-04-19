package com.rekj.core.util;

import java.util.Properties;

public class AppConfigUtil {
	
	public static String get(String propertyKey) {
		Properties properties = (Properties) AppUtil
				.getBean("configproperties");
		return properties.getProperty(propertyKey);
	}
}
