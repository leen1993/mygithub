<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="ctx_rpt" value="${reportContextPath}" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" /> -->

<link href="${ctx}/styles/default/css/web.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="${ctx}/scripts/boot.js"></script>
<script type="text/javascript" src="${ctx}/commons/dynamic.jsp"></script>
<script type="text/javascript"
	src="${ctx}/scripts/plugins/misc/jquery.form.js"></script>
<%-- <script type="text/javascript" src="${ctx}/scripts/plugins/validate/jquery.validate.min.js"></script>
<script type="text/javascript" src="${ctx}/scripts/plugins/validate/additional-methods.min.js"></script>
<script type="text/javascript" src="${ctx}/scripts/plugins/validate/jquery.validate.ext.js"></script> --%>
<%-- <script type="text/javascript" src="${ctx}/scripts/utils/json2.js"></script> --%>
<script type="text/javascript" src="${ctx}/scripts/core.js"></script>


