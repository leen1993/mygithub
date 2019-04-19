<%@page
	import="com.rekj.core.web.util.RequestUtil,
				org.springframework.security.access.AccessDeniedException"
	pageEncoding="UTF-8" isErrorPage="true"%>
<%
	AccessDeniedException ex = (AccessDeniedException) request.getAttribute("ex");
	String basePath = request.getContextPath();
%>
<html>
<head>
<%@include file="/commons/include/get.jsp"%>
<title>拒绝访问</title>
<style type="text/css">
</style>
</head>
<body>
	<div
		style="width: 100%; position: absolute; top: 20%; text-align: center; vertical-align: middle;">
		<img src="<%=basePath%>/styles/default/images/alert.png"
			height="262px" />
		<!-- 		<div style="color: rgb(255, 187, 14);">对不起，您暂时没有权限！</div> -->
		<div style="color: #FF5F02; font-size: 14px; font-family: '微软雅黑';">
			<%=ex.getMessage()%>
		</div>
	</div>
</body>
</html>