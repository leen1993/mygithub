package com.rekj.core.web.listener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

import com.rekj.core.util.AppUtil;

public class StartupListner extends ContextLoaderListener {
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		AppUtil.init(event.getServletContext());
	}
}
