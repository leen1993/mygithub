/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-11 07:25:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rekj.core.web.controller.BaseController;

public final class dynamic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rekj.core.web.controller.BaseController");
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("var __ctx='");
      out.print(request.getContextPath());
      out.write("';\r\n");
      out.write("var __jsessionId='");
      out.print(session.getId() );
      out.write("';\n");
      out.write("\r\n");
      out.write("function forbidBackSpace(e) {\r\n");
      out.write("\ttry {\r\n");
      out.write("\t    var ev = e || window.event; //获取event对象   \r\n");
      out.write("\t    var obj = ev.target || ev.srcElement; //获取事件源   \r\n");
      out.write("\t    var t = obj.type || obj.getAttribute('type'); //获取事件源类型   \r\n");
      out.write("\t    //获取作为判断条件的事件类型   \r\n");
      out.write("\t    var vReadOnly = obj.readOnly;  \r\n");
      out.write("\t    var vDisabled = obj.disabled;  \r\n");
      out.write("\t    //处理undefined值情况   \r\n");
      out.write("\t    vReadOnly = (vReadOnly == undefined) ? false : vReadOnly;  \r\n");
      out.write("\t    vDisabled = (vDisabled == undefined) ? true : vDisabled;  \r\n");
      out.write("\t    //当敲Backspace键时，事件源类型为密码或单行、多行文本的，   \r\n");
      out.write("\t    //并且readOnly属性为true或disabled属性为true的，则退格键失效   \r\n");
      out.write("\t    var flag1 = ev.keyCode == 8 && (t == \"password\" || t == \"text\" || t == \"textarea\") && (vReadOnly == true || vDisabled == true);  \r\n");
      out.write("\t    //当敲Backspace键时，事件源类型非密码或单行、多行文本的，则退格键失效   \r\n");
      out.write("\t    var flag2 = ev.keyCode == 8 && t != \"password\" && t != \"text\" && t != \"textarea\";  \r\n");
      out.write("\t    //判断   \r\n");
      out.write("\t    if (flag2 || flag1) return false;  \r\n");
      out.write("\t} catch (error) {\r\n");
      out.write("\t}\r\n");
      out.write("}  \r\n");
      out.write("//禁止后退键 作用于Firefox、Opera  \r\n");
      out.write("document.onkeypress = forbidBackSpace;  \r\n");
      out.write("//禁止后退键  作用于IE、Chrome  \r\n");
      out.write("document.onkeydown = forbidBackSpace;");
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
}
