package com.rekj.core.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.rekj.core.util.ContextUtil;
import com.rekj.core.web.util.RequestUtil;

/**
 * 登录成功后,执行安全过滤
 * 
 * @author      jack
 * @date        2017年4月20日 下午7:13:44
 */
public class AopFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
	
	}

	public void destroy() {
	}
}
