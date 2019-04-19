package com.rekj.core.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ServerListener implements ServletContextListener {
	private Log logger = LogFactory.getLog(ServerListener.class);

	public void contextDestroyed(ServletContextEvent event) {
	}

	public void contextInitialized(ServletContextEvent event) {
		this.logger.debug("[contextInitialized]开始初始化");
	}
}
