<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%
	String basePath=request.getContextPath();
	String contentType = request.getHeader("Content-Type"); 
	if (contentType != null && contentType.contains("application/x-www-form-urlencoded")) {
		response.getWriter().print("{success:0,message:'服务访问错误,请检查系统日志,定位错误!'}");
	} else {
%>
<html>
<head>
<%@include file="/commons/include/get.jsp"%>
<title>页面出错了</title>
<style type="text/css">
.STYLE10 {
	font-family: "黑体";
	font-size: 20px;
}
</style>
<script type="text/javascript">
				function showErrorMsg(){
					var url="<%=basePath%>/platform/system/sysErrorLog/geterror.do";
					var param={id:${errorCode}};
					$.post(url,param,function(data){
						var obj = $.parseJSON(data);
						top.mini.showMessageBox({title: "错误信息",    
						    message: String,
						    buttons: ["ok"],
						    iconCls: "mini-messagebox-error",
						    html: '<p><font color="red">'+"错误码："+${errorCode}+'\n'+obj.error +'</font></p>'});
						
					}); 
				}
			</script>
</head>
<body>

	<table border="0" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td><img src="${ctx}/styles/default/images/error/error_top.jpg" /></td>
		</tr>
		<tr>
			<td height="200" align="center" valign="top"
				background="${ctx}/styles/default/images/error/error_bg.jpg">
				<table width="80%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="66%" valign="top" align="center">
							<table width="100%">
								<tr height="25">
									<td><span class="STYLE10">出错了,请联系管理员!</span></td>
								</tr>
								<tr height="70">
									<td>错误码：<a class="link" href="#" onclick="showErrorMsg()">${errorCode}</a>
									</td>
								</tr>
							</table>

						</td>
				</table>
			</td>
		</tr>
		<tr>
			<td><img
				src="${ctx}/styles/default/images/error/error_bootom.jpg" /></td>
		</tr>
	</table>
</body>
</html>
<%
}
%>
