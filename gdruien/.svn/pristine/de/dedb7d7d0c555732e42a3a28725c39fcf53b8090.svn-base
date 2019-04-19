package com.rekj.core.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserSessionListener implements HttpSessionAttributeListener {
	protected Logger logger = LoggerFactory.getLogger(UserSessionListener.class);

	public void attributeAdded(HttpSessionBindingEvent event) {
		// SysUser user = ContextUtil.getCurrentUser();
		// if (user == null) {
		// HttpServletRequest request = RequestUtil.getHttpServletRequest();
		// HttpServletResponse response = RequestUtil.getHttpServletResponse();
		// String type = request.getHeader("X-Requested-With");
		// if ("XMLHttpRequest".equalsIgnoreCase(type)) {
		// response.setHeader("sessionstatus", "timeout");
		// }
		// }

		// SysUser user = ContextUtil.getCurrentUser();
		// if ("SPRING_SECURITY_LAST_USERNAME".equals(event.getName())) {
		// // SysUser user = ContextUtil.getCurrentUser();
		// if (user == null) {
		// return;
		// }
		//
		// String userId = user.getUserId();
		// if (!AppUtil.getOnlineUsers().containsKey(userId)) {
		// OnlineUser onlineUser = new OnlineUser();
		// onlineUser.setUserId(user.getUserId());
		// onlineUser.setUsername(user.getUsername());
		// SysOrg org = ContextUtil.getCurrentOrg();
		// if (org != null) {
		// onlineUser.setOrgId(org.getOrgId());
		// onlineUser.setOrgName(org.getOrgName());
		// }
		//
		// AppUtil.getOnlineUsers().put(user.getUserId(), onlineUser);
		// }
		// }
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		// if ("SPRING_SECURITY_LAST_USERNAME".equals(event.getName())) {
		// SysUser user = ContextUtil.getCurrentUser();
		//
		// if (user != null)
		// AppUtil.getOnlineUsers().remove(user.getUserId());
		// }
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		// this.logger.info(event.getName());
	}
}
