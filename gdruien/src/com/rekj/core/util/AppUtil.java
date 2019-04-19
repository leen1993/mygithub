package com.rekj.core.util;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	private static ServletContext servletContext;
	// private static Map<String, OnlineUser> onlineUsers = new LinkedHashMap();

	public static void init(ServletContext _servletContext) {
		servletContext = _servletContext;
	}

	public void setApplicationContext(ApplicationContext contex) throws BeansException {
		applicationContext = contex;
	}

	public static ApplicationContext getContext() {
		return applicationContext;
	}

	public static ServletContext getServletContext() throws Exception {
		return servletContext;
	}

	public static String toURI(String ctx, String url) {
		if (StringUtils.isEmpty(url)) {
			return "";
		}

		String value = url;
		int i = 0;
		boolean flag = false;
		for (i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (c == '/' || c == '\\') {
				flag = true;
			} else {
				break;
			}
		}

		if (flag) {
			if (i > 1) {
				value = "/" + value.substring(i);
			}
		} else {
			value = "/" + value;
		}

		if (!StringUtils.isEmpty(ctx)) {
			value = ctx + value;
		}
		return value;
	}

	public static Object getBean(Class cls) {
		return applicationContext.getBean(cls);
	}

	public static Object getBean(String beanId) {
		return applicationContext.getBean(beanId);
	}

	public static String getAppAbsolutePath() {
		return servletContext.getRealPath("/");
	}

	public static String getRealPath(String path) {
		return servletContext.getRealPath(path);
	}

	// public static Map<String, OnlineUser> getOnlineUsers() {
	// return onlineUsers;
	// }

	public static String getClasspath() {
		String classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String rootPath = "";

		if ("\\".equals(File.separator)) {
			rootPath = classPath.substring(1);
			rootPath = rootPath.replace("/", "\\");
		}

		if ("/".equals(File.separator)) {
			rootPath = classPath.substring(1);
			rootPath = rootPath.replace("\\", "/");
		}
		return rootPath;
	}

}
