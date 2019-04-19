package com.rekj.core.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.authentication.switchuser.SwitchUserFilter;

import com.rekj.core.util.ContextUtil;
import com.rekj.core.web.util.CookieUtil;

public class HtSwitchUserFilter extends SwitchUserFilter {
	public static final String SwitchAccount = "origSwitch";

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {}

	private void setAccount(String account, HttpServletRequest req,
			HttpServletResponse res) {
		CookieUtil.addCookie("origSwitch", account, req, res);
	}

	private void removeAccount(HttpServletRequest req, HttpServletResponse res) {
		CookieUtil.delCookie("origSwitch", req, res);
	}
}
