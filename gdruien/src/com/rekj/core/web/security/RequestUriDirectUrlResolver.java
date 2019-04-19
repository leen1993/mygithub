package com.rekj.core.web.security;

import javax.servlet.http.HttpServletRequest;

public class RequestUriDirectUrlResolver extends AbstractDirectUrlResolver {
	public boolean support(HttpServletRequest request) {
		String requestURI = request.getRequestURI();
		return requestURI.contains(this.pattern);
	}
}
