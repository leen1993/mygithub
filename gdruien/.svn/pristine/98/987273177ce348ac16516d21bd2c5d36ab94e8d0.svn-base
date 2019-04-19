<%@page language="java" pageEncoding="UTF-8"%>
<%@page import="com.rekj.core.web.controller.BaseController"%>
<%@page import="com.rekj.core.web.ResultMessage"%>
<%
ResultMessage _obj_=(ResultMessage)session.getAttribute(BaseController.Message);
if(_obj_!=null){
	session.removeAttribute(BaseController.Message);
%>
<script type="text/javascript">
$(function() {
	var message = '<%=_obj_.getMessage()%>';
	<%
	  if(_obj_.getResult() == ResultMessage.OK) {
	%>
		top.mini.showMessageBox({title: "信息",    
		    message: String,
		    buttons: ["ok"],
		    iconCls: "mini-messagebox-info",
		    html: '<p><font color="green">'+message+'</font></p>'});
	<%}
	  else{
		if(!"".equals(_obj_.getCause())){
	%>
		top.mini.showMessageBox({title: "错误",    
		    message: String,
		    buttons: ["ok"],
		    iconCls: "mini-messagebox-error",
		    html: '<p><font color="red">'+message+'</font></p>'});
		<%}else{%>
		top.mini.showMessageBox({title: "警告",
		    message: String,
		    buttons: ["ok"],
		    iconCls: "mini-messagebox-warn",
		    html: '<p><font color="red">'+message+'</font></p>'});
	<%   }
	   }%>
});
</script>
<%
} %>



