<%@page import="com.rekj.core.web.util.RequestUtil" isErrorPage="true"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getContextPath();
%>

<%@include file="/commons/include/get.jsp"%>
<html>
<head>
<title>您访问的页面不存在</title>
<style type="text/css">
<!--
.STYLE10 {
	font-family: "微软雅黑";
	font-size: 36px;
}

-->
.link {
	border: 1px solid #999999;
	border-radius: 3px 3px 3px 3px;
	cursor: pointer;
	line-height: 23px;
	padding: 1px 7px 7px 8px;
	text-align: center;
}
</style>
</head>
<body>
	<div
		style="width: 100%; position: absolute; top: 20%; text-align: center; vertical-align: middle;">
		<%-- <img src="<%=basePath%>/styles/default/images/alert.png" height="262px" /> --%>
		<div style="color:rgb(255,187,14);">对不起，您输入了一个错误的地址！</div> 
	</div>
</body>
</html>