/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-15 07:28:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.medical.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operationReportWork_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/E:/workspace.hisnew/hisbase/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/workspace.hisnew/hisbase/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1525761782870L));
    _jspx_dependants.put("/commons/include/html_doctype.html", Long.valueOf(1525761798654L));
    _jspx_dependants.put("/commons/include/form.jsp", Long.valueOf(1525761798651L));
    _jspx_dependants.put("jar:file:/E:/workspace.hisnew/hisbase/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>手术工作量汇总表</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\" /> -->\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/styles/default/css/web.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/boot.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/commons/dynamic.jsp\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/plugins/misc/jquery.form.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/core.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.report {\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.report td {\r\n");
      out.write("\t\tborder:1px solid #ccc;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.title {\r\n");
      out.write("\t\tfont-size:30px;\r\n");
      out.write("\t\tfont-weight:bold;\r\n");
      out.write("\t\theight:45px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.subheading {\r\n");
      out.write("\t\ttext-align:right;\r\n");
      out.write("\t\tcolor:blue;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\th1 {\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.dateline {\r\n");
      out.write("\t\theight:30px;\r\n");
      out.write("\t\tline-height:30px;\r\n");
      out.write("\t\ttext-indent: 10px;\r\n");
      out.write("\t\tborder-top:1px solid #ccc;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction query() {\r\n");
      out.write("\t\tvar st = mini.get(\"#startDate\").getValue();\r\n");
      out.write("\t\tvar en = mini.get(\"#endDate\").getValue()\r\n");
      out.write("\t\tvar startDate = mini.formatDate(st, \"yyyy-MM-dd\");\r\n");
      out.write("\t\tvar endDate = mini.formatDate(en, \"yyyy-MM-dd\");\r\n");
      out.write("\t\tconsole.log(startDate);\r\n");
      out.write("\t\tconsole.log(endDate);\r\n");
      out.write("\t\tgrid.load({\r\n");
      out.write("\t\t\tstartDate: startDate,\r\n");
      out.write("\t\t\tendDate: endDate\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 设置日期为今天\r\n");
      out.write("\tfunction setToday() {\r\n");
      out.write("\t\tvar date = new Date();\r\n");
      out.write("\t\tvar startStr = date.getFullYear() + \"-\" + date.getMonth() + \"-\"+ (date.getDate()-1);\r\n");
      out.write("\t\tvar endStr = date.getFullYear() + \"-\" + date.getMonth() + \"-\"+ date.getDate();\r\n");
      out.write("\t\tmini.get(\"#startDate\").setValue(mini.parseDate(startStr));\r\n");
      out.write("\t\tmini.get(\"#endDate\").setValue(mini.parseDate(endStr));\r\n");
      out.write("\t\t$(\".date\").html(startStr+\"至\"+endStr);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 当日期值改变时\r\n");
      out.write("\tfunction  onvaluechanged(e) {\r\n");
      out.write("\t\tvar start = mini.get(\"startDate\").getValue();\r\n");
      out.write("\t\tvar end = mini.get(\"endDate\").getValue();\r\n");
      out.write("\t\t$(\".date\").html(mini.formatDate(start, \"yyyy-MM-dd\") +\"至\"+ mini.formatDate(end, \"yyyy-MM-dd\"));\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"mini-toolbar\">\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-refresh\" onclick=\"query\">刷新</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-print\">打印</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-sign-out\">导出</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-print\">全部打印</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-print\">选页打印</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-sign-out\">明细导出</a>\r\n");
      out.write("\t    <a class=\"mini-button\" iconCls=\"fa fa-print\">明细打印</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mini-toolbar\">\r\n");
      out.write("\t\t    开始时间：<input class=\"mini-datepicker\" onvaluechanged=\"onvaluechanged\" id=\"startDate\"/>\r\n");
      out.write("\t\t    结束时间：<input class=\"mini-datepicker\" onvaluechanged=\"onvaluechanged\" id=\"endDate\"/>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<h1>手术工作量汇总表</h1>\r\n");
      out.write("\t<div class=\"dateline\">\r\n");
      out.write("\t\t\t<span style=\"font-weight:bold;\">统计日期:</span>\r\n");
      out.write("\t\t\t<span class=\"date\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t<div class=\"mini-fit\">\r\n");
      out.write("\t\t<div id=\"grid\" class=\"mini-datagrid\" style=\"width:100%;height:100%\" showPager=\"true\" \r\n");
      out.write("\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/medical/report/operationReport/workData.do\">\r\n");
      out.write("\t        <div property=\"columns\">\r\n");
      out.write("\t            <div filed=\"\" align=\"center\" headerAlign=\"center\">执行科室</div>\r\n");
      out.write("\t            <div filed=\"\" align=\"center\" headerAlign=\"center\">手术次数</div>\r\n");
      out.write("\t            <div filed=\"\" align=\"center\" headerAlign=\"center\">手术医生人数</div>\r\n");
      out.write("\t            <div filed=\"\" align=\"center\" headerAlign=\"center\">总额</div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tmini.parse();\r\n");
      out.write("\t\tvar grid = mini.get(\"grid\");\r\n");
      out.write("\t\tsetToday();\r\n");
      out.write("\t\tquery();\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /commons/include/form.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /commons/include/form.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/commons/include/form.jsp(5,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /commons/include/form.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx_rpt");
      // /commons/include/form.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/commons/include/form.jsp(6,0) '${reportContextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${reportContextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }
}
