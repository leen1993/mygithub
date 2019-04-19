package com.rekj.core.web.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class MultipleAuthenticationLoginEntry implements AuthenticationEntryPoint {
	
	private String defaultLoginUrl = "/login.jsp";
	
	private List<DirectUrlResolver> directUrlResolvers = new ArrayList();

	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		String ctxPath = request.getContextPath();
		for (DirectUrlResolver directUrlResolver : this.directUrlResolvers) {
			if (directUrlResolver.support(request)) {
				String loginUrl = directUrlResolver.directUrl();
				response.sendRedirect(ctxPath + loginUrl);
				return;
			}
		}

//		String type = request.getHeader("X-Requested-With");
//		if ("XMLHttpRequest".equalsIgnoreCase(type)) {
//			response.setHeader("sessionstatus", "timeout");
//			return;
//		}
//		response.sendRedirect(ctxPath + this.defaultLoginUrl);
		
		String html = "<script>"
				+ " if (top.handleTimeout) { "
				+ "    top.handleTimeout(window)"
				+ "} else { "
				+ "	   top.location.href = '" + ctxPath + this.defaultLoginUrl + "';"
				+ "} "
				+ "</script>";
		
		// fixed quickly relogin
		String type = request.getHeader("X-Requested-With");
		if ("XMLHttpRequest".equalsIgnoreCase(type)) {
			response.setHeader("sessionstatus", "timeout");
			return;
		}
		response.setHeader("sessionstatus", "timeout");
		response.getWriter().write(html);
		response.getWriter().flush();
	}

	public void setDefaultLoginUrl(String defaultLoginUrl) {
		this.defaultLoginUrl = defaultLoginUrl;
	}

	public void setDirectUrlResolvers(List<DirectUrlResolver> directUrlResolvers) {
		this.directUrlResolvers = directUrlResolvers;
	}
}
