package com.rekj.core.util;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

public class DynamicLoadBean implements ApplicationContextAware {
	private ConfigurableApplicationContext applicationContext = null;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = ((ConfigurableApplicationContext) applicationContext);
	}

	public ConfigurableApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	public void loadBean(String configLocationString) {
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(
				(BeanDefinitionRegistry) getApplicationContext()
						.getBeanFactory());
		beanDefinitionReader.setResourceLoader(getApplicationContext());
		beanDefinitionReader.setEntityResolver(new ResourceEntityResolver(
				getApplicationContext()));
		try {
			String[] configLocations = { configLocationString };
			for (int i = 0; i < configLocations.length; i++)
				beanDefinitionReader
						.loadBeanDefinitions(getApplicationContext()
								.getResources(configLocations[i]));
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
