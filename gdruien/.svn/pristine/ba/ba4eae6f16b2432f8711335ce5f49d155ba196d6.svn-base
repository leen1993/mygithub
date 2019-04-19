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
<title>重新登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<script type="text/javascript" src="${ctx}/scripts/jquery-1.9.min.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/plugins/misc/jquery.form.js"></script>
<link rel="stylesheet" type="text/css"
	href="${ctx}/styles/login/login.css"></link>

<style type="text/css">
.confirm {
	position: relative;
	border-radius: 2px;
	padding: 0;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 0px;
	text-align: center;
	margin: 0 auto;
	margin-top: 10px;
}
</style>
<script type="text/javascript">
	$(function() {
		$('body').keydown(function(event) {
			if(event.keyCode == 13) {
				doLogin();
			}
		});
		
		$("#formLogin").ajaxForm({success : function(r) {
			if (r == "ok") {
				 if (window.CloseOwnerWindow) {
					 window.CloseOwnerWindow("ok");
				 } else {
					 window.close();
				 } 
			} else {
				top.mini.alert(r);
			}
		}});
	});
	
	function doLogin() {
		$("#formLogin").submit();
	}
	
	function setData(data) {
		$("#username").val(data.username+"/"+data.account);
		$("#account").val(data.account);
		$("#userId").val(data.userId);
		$("#roleId").val(data.roleId);
		$("#orgId").val(data.orgId);
	}
	
</script>
</head>
<body
	style="overflow: hidden; background: url(styles/login/images/bg_login.jpg) repeat;">
	<form id="formLogin" action="${ctx}/login.do" method="post"
		autocomplete="off">
		<div class="column">
			<div class="login-title" style="color: #d87070">系统超时,请重新登录</div>
		</div>
		<div class="login-input login-input-username">
			<input id="username" readonly="true" name="username"
				class="login-username" type="text" placeholder="账户名称" title="账户名称">
			<input type="hidden" id="userId" name="userId"></input> <input
				type="hidden" id="account" name="account"></input> <input
				type="hidden" id="orgId" name="orgId"></input> <input type="hidden"
				id="roleId" name="roleId"></input> <input type="hidden"
				id="loginType" name="loginType" value="timeout"></input>
		</div>
		<div class="login-input login-input-password">
			<input tabindex="1" type="password" id="password" placeholder="密码"
				title="密码" name="password" value="0" />
		</div>
		<div class="confirm">
			<a class="login_btn" href="javascript:void(0);" hidefocus="true"
				onclick="doLogin();">登&nbsp;&nbsp;&nbsp;&nbsp;录</a>
		</div>
	</form>
</body>
</html>
