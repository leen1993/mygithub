package com.rekj.core.web.security;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.rekj.core.util.StringUtil;

/**
 * URL安全访问限制
 * 
 * @author      jack
 * @date        2017年5月11日 下午4:31:13
 */
public class GenericSecurityMetadataSource implements
		FilterInvocationSecurityMetadataSource, BeanPostProcessor {
	private HashSet<String> anonymousUrls = new HashSet();

	boolean isInit = false;

	public void setAnonymousUrls(HashSet<String> anonymousUrls) {
		this.anonymousUrls = anonymousUrls;
	}


	public boolean supports(Class<?> clazz) {
		return true;
	}

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	private static String removeCtx(String url, String contextPath) {
		url = url.trim();
		if (StringUtil.isEmpty(contextPath))
			return url;
		if (StringUtil.isEmpty(url))
			return "";
		if (url.startsWith(contextPath)) {
			url = url.replaceFirst(contextPath, "");
		}
		return url;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}


	@Override
	public Collection<ConfigAttribute> getAttributes(Object arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
}
