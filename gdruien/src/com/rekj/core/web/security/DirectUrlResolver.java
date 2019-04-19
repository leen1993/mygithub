package com.rekj.core.web.security;

import javax.servlet.http.HttpServletRequest;

public abstract interface DirectUrlResolver {
	public abstract boolean support(HttpServletRequest paramHttpServletRequest);

	public abstract String directUrl();
}
