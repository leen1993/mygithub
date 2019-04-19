package com.rekj.core.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMvcServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1L;

	protected void noHandlerFound(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uri = request.getRequestURI();
		String ctx = request.getContextPath();
		uri = uri.replace(".do", "");
		if (!StringUtils.isEmpty(ctx)) {
			uri = uri.substring(ctx.length());
		}
		
		String jspPath = uri + ".jsp";
		this.logger.debug("NO URI:" + request.getRequestURI() + ", and forward to /WEB-INF/view" + jspPath);
		request.getRequestDispatcher("/WEB-INF/view" + jspPath).forward(request, response);
	}
}
