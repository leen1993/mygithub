/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 01:36:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.medical.outpatient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class outOrderOpLisResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/commons/include/get.jsp", Long.valueOf(1525827802831L));
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>门诊工作站-检验报告</title>\n");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/boot.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/commons/dynamic.jsp\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/plugins/template/jquery.tmpl.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/styles/default/css/web.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\t.patientInfo {\n");
      out.write("\t\tcolor:#006aad;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mini-toolbar {\n");
      out.write("\t    background: #fff;\n");
      out.write("\t    border-top: 0px;\n");
      out.write("\t    border-bottom: solid 0px #ccc;\n");
      out.write("\t    padding: 6px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mini-splitter .mini-splitter-pane1 {\n");
      out.write("    \tborder:0px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mini-splitter {\n");
      out.write("\t\tmargin:3px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t// 查询历史就诊\n");
      out.write("\tfunction queryHistory() {\n");
      out.write("\t\tgrid0.load({\n");
      out.write("\t\t\tpatientId : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.patientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t// 查询左下检查项目树\n");
      out.write("\tfunction queryLis(e) {\n");
      out.write("\t\tgrid1.load({\n");
      out.write("\t\t\tregisterId: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.registerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t});\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t// 查询\n");
      out.write("\tfunction onactivechanged(e) {\n");
      out.write("\t\tif(e.index == 0) {\n");
      out.write("\t\t\tqueryHistory();\n");
      out.write("\t\t} else if (e.index == 1) {\n");
      out.write("\t\t\tqueryLis();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction show() {\n");
      out.write("\t\t$(\".hideBegin\").show();\n");
      out.write("\t\t$(\".toolbar\").show();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"mini-toolbar toolbar\" style=\"display:none;border:1;margin:0;font-size:12px;\" borderStyle=\"border-top:0;\">\n");
      out.write("\t      <span style=\"fons-size:12px;font-weight:bold; \">检验项目过滤 ：</span>　<input class=\"mini-textbox\" style=\"width:200px;\"/>\n");
      out.write("\t   <span class=\"separator\"></span>\n");
      out.write("\t   <a class=\"mini-button\" iconCls=\"icon-node\" onclick=\"addRow\">查看报告</a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 左侧 表格-->\n");
      out.write("\t<div class=\"mini-fit\">\n");
      out.write("\t\t<div class=\"mini-splitter\" style=\"width: 98%; height: 98%;\">\n");
      out.write("\t\t\t<div size=\"30%;\" showCollapseButton=\"false\">\n");
      out.write("\t\t\t\t<div id=\"tabs\" class=\"mini-tabs\" style=\"width:100%; height:100%;\" onactivechanged=\"onactivechanged\">\n");
      out.write("\t\t\t\t\t<div class=\"mini-fit\" title=\"历史就诊\">\n");
      out.write("\t\t\t\t\t\t<div id=\"grid0\" class=\"mini-datagrid\" showpager=\"false\" onrowclick=\"onrowclick\" borderStyle=\"border:0;border-top:1px solid #ccc; border-left:1px solid #ccc;\" style=\"width:100%;height:100%;\"\n");
      out.write("\t\t\t\t\t\t\tmultiSelect=\"false\"\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/medical/outpatient/opExpRegister/getHistoryRecord.do\" >\n");
      out.write("\t\t\t\t\t\t\t<div property=\"columns\">\n");
      out.write("\t\t\t\t\t\t\t\t<div type=\"indexColumn\" width=\"50\" headerAlign=\"center\" align=\"center\">序号</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"patientName\" width=\"60\" headerAlign=\"center\" align=\"center\">姓名</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeDoctId\" type=\"comboboxColumn\" width=\"100\" headerAlign=\"center\" align=\"center\">看诊医生\n");
      out.write("\t\t\t\t\t\t\t\t\t<input property=\"editor\" class=\"mini-combobox\"  url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysUser/getKVs.do\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeTime\" width=\"120\" headerAlign=\"center\" align=\"center\" dateFormat=\"yyyy-MM-dd HH:mm:ss\">看诊时间</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeDeptId\" type=\"comboboxcolumn\" width=\"120\" headerAlign=\"center\" align=\"center\">看诊科室\n");
      out.write("\t\t\t\t\t\t\t\t\t<input property=\"editor\" allowInput=\"true\" valueFromSelect=\"true\" class=\"mini-combobox\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysOrg/getKVs.do\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div title=\"检验项目\" class=\"mini-fit\">\n");
      out.write("\t\t\t\t\t\t<div id=\"grid1\" class=\"mini-datagrid\" style=\"width:100%; height:100%\" showPager=\"false\" borderStyle=\"border:0;border-top:1px solid #ccc; border-left:1px solid #ccc;\" multiSelect=\"false\" \n");
      out.write("\t\t\t\t\t\t\t url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/outpatient/opLisApply/getAll.do\" onrowdblclick=\"grid1dClick\">\n");
      out.write("\t\t\t\t\t\t\t<div property=\"columns\">\n");
      out.write("\t\t\t\t\t\t\t\t<div type=\"indexColumn\" width=\"50\" headerAlign=\"center\" align=\"center\">序号</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"checkcontent\" width=\"150\" headerAlign=\"center\" align=\"center\">项目名称</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"tag.sampleId\" width=\"80\" headerAlign=\"center\" align=\"center\" type=\"comboboxColumn\">样本\n");
      out.write("\t\t\t\t\t\t\t\t\t<input property=\"editor\" class=\"mini-combobox\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysDict/getKVs.do?dictType=BD_SAMPLETYPE\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"reportOperTime\" width=\"60\" headerAlign=\"center\" align=\"center\">报告时间</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"applyOperTime\" width=\"100\" headerAlign=\"center\" dateFormat=\"yyyy-MM-dd\" align=\"center\">申请时间</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 右侧表格 -->\n");
      out.write("\t\t\t<div showCollapseButton=\"false\">\n");
      out.write("\t\t\t\t<div id=\"filterGroupclassify\" class=\"hideBegin\" style=\"display:none; height: 25px;font-size:15px;font-weight:bold;border-bottom: 1px solid #ccc;padding:5px 0 5px 5px;\">\n");
      out.write("\t\t\t\t\t检验结果\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mini-fit\">\n");
      out.write("\t\t\t\t\t<div id=\"grid3\" class=\"mini-datagrid\" showPager=\"true\" borderStyle=\"border:0;\" allowDrag=\"true\" allowDrop=\"false\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 100%; height: 100%;\" contextMenu=\"#gridMenu\" \n");
      out.write("\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/medical/outpatient/outOrder/getOutOrderList.do?registerId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.registerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t\t\t\tshowTreeIcon=\"true\" showPager=\"true\" multiSelect=\"true\" allowCellValid=\"true\" allowCellEdit=\"true\" allowCellSelect=\"true\"\n");
      out.write("\t\t\t\t\t\teditNextOnEnterKey=\"true\" oncellbeginedit=\"oncellbeginedit\" onDrawGroup=\"onDrawGroup\">\n");
      out.write("\t\t\t\t\t   <div property=\"columns\">\n");
      out.write("\t\t\t\t\t\t\t<div field=\"patientName\" width=\"60\" headerAlign=\"center\" align=\"center\">结果名称</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"patientName\" width=\"60\" headerAlign=\"center\" align=\"center\">值</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"range\" width=\"60\" headerAlign=\"center\" align=\"center\">参考范围</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"unit\" width=\"60\" headerAlign=\"center\" align=\"center\">单位</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"mark\" width=\"60\" headerAlign=\"center\" align=\"center\">标记</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"result\" width=\"60\" headerAlign=\"center\" align=\"center\">结果</div>\n");
      out.write("\t\t\t\t\t\t\t<div field=\"memo\" width=\"60\" headerAlign=\"center\" align=\"center\">备注</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tmini.parse();\n");
      out.write("\t\tvar grid0 = mini.get(\"#grid0\");\n");
      out.write("\t\tvar grid1 = mini.get(\"grid1\");\n");
      out.write("\t\tvar grid2 = mini.get(\"grid3\");\n");
      out.write("\t\tqueryHistory();\t\n");
      out.write("\t\tqueryOps();\n");
      out.write("\t\tshow();\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
      // /commons/include/get.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /commons/include/get.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/commons/include/get.jsp(5,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
      // /commons/include/get.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("emr");
      // /commons/include/get.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/commons/include/get.jsp(6,0) '${emrContextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${emrContextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
