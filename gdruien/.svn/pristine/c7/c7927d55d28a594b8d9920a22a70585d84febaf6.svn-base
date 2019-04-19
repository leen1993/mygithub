<%@page
	import="org.springframework.security.authentication.AuthenticationServiceException"%>
<%@page
	import="org.springframework.security.authentication.AccountExpiredException"%>
<%@page
	import="org.springframework.security.authentication.DisabledException"%>
<%@page
	import="org.springframework.security.authentication.LockedException"%>
<%@page
	import="org.springframework.security.authentication.BadCredentialsException"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.rekj.core.util.AppUtil"%>
<%@page import="java.util.Properties"%>
<%@ page pageEncoding="UTF-8"%>
<%@page import="org.springframework.security.web.WebAttributes"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<link rel="icon" href="${ctx}/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${ctx}/favicon.ico" type="image/x-icon" />
<head>
<title>医院信息系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<meta name="renderer" content="webkit" />
<script type="text/javascript" src="${ctx}/scripts/jquery-1.9.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${ctx}/styles/login/login.css"></link>
<%
	Properties configProperties=(Properties)AppUtil.getBean("configproperties");
	String validCodeEnabled=configProperties.getProperty("validCodeEnabled");
%>
<script type="text/javascript">
	if(top != this) { //当这个窗口出现在iframe里，表示其目前已经timeout，需要把外面的框架窗口也重定向登录页面
		try {
			$("body").css("display", "none");
			$("body").hide();
		} catch(e) {
		}
		top.location = '${ctx}/login.jsp';
	}
	
	$(function() {
		$('body').keydown(function(event){
			if(event.keyCode == 13) {
				$('#formLogin').submit();
			}
		});
	});
</script>
</head>
<body>
	<form id="formLogin" action="${ctx}/login.do" method="post"
		autocomplete="off">
		<div class="main_login">
			<div class="content_login">
				<div class="column">
					<div class="login-title">
						松山湖<span
							style="font-size: 8px; font-weight: bolder; position: relative; bottom: 10px;"></span>基金管理系统
					</div>
				</div>
				<div class="login-input login-input-username">
					<input tabindex="1" value="admin" name="account"
						class="login-username" type="text" placeholder="用户名" title="用户名">
				</div>
				<div class="login-input login-input-password">
					<input tabindex="2" type="password" placeholder="密码" title="密码"
						name="password" value="0" />
				</div>
				<div class="confirm">
					<a class="login_btn" href="javascript:void(0);" hidefocus="true"
						onclick="document.getElementById('formLogin').submit();">登&nbsp;&nbsp;&nbsp;&nbsp;录</a>
					<input type="checkbox" style="display: none;"
						name="_spring_security_remember_me" value="1" /> <span
						style="display: none;">系统记住我</span>
				</div>
				<%
			Object loginError = (Object)session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
			if(loginError != null ) {
				String msg = "";
				if(loginError instanceof BadCredentialsException) {
					msg="密码输入错误";
				} else if (loginError instanceof AuthenticationServiceException) {
					AuthenticationServiceException ex = (AuthenticationServiceException)loginError;
					msg = ex.getMessage();
				} else {
					msg = loginError.toString();
				}
			%>
				<div class="confirm">
					<span style="color: #ff0000;"><%=msg %></span>
				</div>
				<% } %>
			</div>
		</div>
	</form>
	<div class="copy">
		<span><img src="${ctx}/styles/login/images/logo.png"
			width="50px" style="vertical-align: middle; margin-right: 10px;" /></span>
		<span>Copyright © 2019  广东瑞恩科技有限公司版权所有</span>
	</div>
</body>
</html>
