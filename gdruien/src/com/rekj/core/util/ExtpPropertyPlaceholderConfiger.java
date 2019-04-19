package com.rekj.core.util;

import java.util.Enumeration;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.ObjectUtils;

import com.rekj.core.encrypt.EncryptUtil;

public class ExtpPropertyPlaceholderConfiger extends
		PropertyPlaceholderConfigurer {
	private String[] encryptNames = { "jdbc.password" };

	protected void convertProperties(Properties props) {
		Enumeration propertyNames = props.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String propertyName = (String) propertyNames.nextElement();
			String propertyValue = props.getProperty(propertyName);

			String convertedValue = convertPropertyValue(propertyValue);
			if (isEncryptProp(propertyName)) {
				try {
					convertedValue = EncryptUtil.decrypt(convertedValue);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (!ObjectUtils.nullSafeEquals(propertyValue, convertedValue)) {
				props.setProperty(propertyName, convertedValue);
			}
		}
	}

	private boolean isEncryptProp(String propertyName) {
		for (String name : this.encryptNames) {
			if (name.equals(propertyName)) {
				return true;
			}
		}
		return false;
	}
}
