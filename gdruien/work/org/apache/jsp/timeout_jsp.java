/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 03:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.BadCredentialsException;
import java.util.Enumeration;
import com.rekj.core.util.AppUtil;
import java.util.Properties;
import org.springframework.security.web.WebAttributes;

public final class timeout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/workspace.hisnew/hisbase/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1525761782870L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.springframework.security.authentication.BadCredentialsException");
    _jspx_imports_classes.add("java.util.Properties");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("org.springframework.security.authentication.AuthenticationServiceException");
    _jspx_imports_classes.add("org.springframework.security.authentication.LockedException");
    _jspx_imports_classes.add("org.springframework.security.authentication.DisabledException");
    _jspx_imports_classes.add("com.rekj.core.util.AppUtil");
    _jspx_imports_classes.add("org.springframework.security.web.WebAttributes");
    _jspx_imports_classes.add("org.springframework.security.authentication.AccountExpiredException");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/favicon.ico\" type=\"image/x-icon\" /> \r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/favicon.ico\" type=\"image/x-icon\" />  \r\n");
      out.write("<head>\r\n");
      out.write("<title>重新登录</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/jquery-1.9.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/plugins/misc/jquery.form.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/styles/login/login.css\"></link>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.confirm {\r\n");
      out.write("\t    position: relative;\r\n");
      out.write("\t    border-radius: 2px;\r\n");
      out.write("\t    padding: 0;\r\n");
      out.write("\t    -webkit-border-radius: 2px;\r\n");
      out.write("\t    -moz-border-radius: 2px;\r\n");
      out.write("\t    border :0px;\r\n");
      out.write("\t    text-align: center;\r\n");
      out.write("\t    margin: 0 auto;\r\n");
      out.write("\t    margin-top: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('body').keydown(function(event) {\r\n");
      out.write("\t\t\tif(event.keyCode == 13) {\r\n");
      out.write("\t\t\t\tdoLogin();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#formLogin\").ajaxForm({success : function(r) {\r\n");
      out.write("\t\t\tif (r == \"ok\") {\r\n");
      out.write("\t\t\t\t if (window.CloseOwnerWindow) {\r\n");
      out.write("\t\t\t\t\t window.CloseOwnerWindow(\"ok\");\r\n");
      out.write("\t\t\t\t } else {\r\n");
      out.write("\t\t\t\t\t window.close();\r\n");
      out.write("\t\t\t\t } \r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\ttop.mini.alert(r);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doLogin() {\r\n");
      out.write("\t\t$(\"#formLogin\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction setData(data) {\r\n");
      out.write("\t\t$(\"#username\").val(data.username+\"/\"+data.account);\r\n");
      out.write("\t\t$(\"#account\").val(data.account);\r\n");
      out.write("\t\t$(\"#userId\").val(data.userId);\r\n");
      out.write("\t\t$(\"#roleId\").val(data.roleId);\r\n");
      out.write("\t\t$(\"#orgId\").val(data.orgId);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow:hidden;background: url(styles/login/images/bg_login.jpg) repeat;\">\r\n");
      out.write("<form id=\"formLogin\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login.do\" method=\"post\" autocomplete=\"off\">\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("\t\t<div class=\"login-title\" style=\"color:#d87070\">系统超时,请重新登录</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"login-input login-input-username\">\r\n");
      out.write("        <input id=\"username\" readonly=\"true\" name=\"username\" class=\"login-username\" type=\"text\" placeholder=\"账户名称\" title=\"账户名称\">\r\n");
      out.write("        <input type=\"hidden\" id=\"userId\" name=\"userId\"></input>\r\n");
      out.write("        <input type=\"hidden\" id=\"account\" name=\"account\"></input>\r\n");
      out.write("        <input type=\"hidden\" id=\"orgId\" name=\"orgId\"></input>\r\n");
      out.write("        <input type=\"hidden\" id=\"roleId\" name=\"roleId\"></input>\r\n");
      out.write("        <input type=\"hidden\" id=\"loginType\" name=\"loginType\" value=\"timeout\"></input>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"login-input login-input-password\">\r\n");
      out.write("\t\t<input tabindex=\"1\" type=\"password\" id=\"password\" placeholder=\"密码\" title=\"密码\" name=\"password\" value=\"0\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"confirm\">\r\n");
      out.write("\t\t<a class=\"login_btn\" href=\"javascript:void(0);\" hidefocus=\"true\" onclick=\"doLogin();\">登&nbsp;&nbsp;&nbsp;&nbsp;录</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
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
      // /timeout.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /timeout.jsp(12,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/timeout.jsp(12,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
}
