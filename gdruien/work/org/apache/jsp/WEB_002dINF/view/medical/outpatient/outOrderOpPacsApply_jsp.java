/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 01:36:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.medical.outpatient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class outOrderOpPacsApply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>门诊工作站-检查报告</title>\n");
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
      out.write("\t.mini-splitter-border {\n");
      out.write("\t    border: 0;\n");
      out.write("\t    position: relative;\n");
      out.write("\t    overflow: hidden;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#form1 {\n");
      out.write("\t\tbackground:#E0EEEE;\n");
      out.write("\t}\t\n");
      out.write("\t\n");
      out.write("\t.form_table {\n");
      out.write("\t\twidth:90%;\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.form_table td{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.title {\n");
      out.write("\t\tfont-size:20px;\n");
      out.write("\t\tfont-weight: bold;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tpadding: 5px 0 0 0; \n");
      out.write("\t}\t\n");
      out.write("\t\n");
      out.write("\t.fieldTitle {\n");
      out.write("\t\tfont-weight: bold; \n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tp {\n");
      out.write("\t\tmargin:5px 0 0 0;\n");
      out.write("\t\tpadding:0;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mini-tabs-body-top {\n");
      out.write("\t\tborder: 0;\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mini-splitter {\n");
      out.write("\t\tmargin:3px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/scripts/print.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t//查询历史就诊\n");
      out.write("\t\tfunction queryHistory() {\n");
      out.write("\t\t\tgrid.load({\n");
      out.write("\t\t\t\tpatientId : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.patientId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// 查询检查项目\n");
      out.write("\t\tfunction queryPacs() {\n");
      out.write("\t\t\ttree.load(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/outpatient/opPacsApply/getTree.do?registerId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.registerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// 显示信息\n");
      out.write("\t\tfunction showPacsInfo(e) {\n");
      out.write("\t\t\tform.setData(e.row);\n");
      out.write("\t\t\tform2.setData(e.row);\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// 保存\n");
      out.write("\t\tfunction save() {\n");
      out.write("\t\t\tvar formdata = form.getData();\n");
      out.write("\t\t\tformdata.tag = {checkPart: formdata.checkPart, explain: formdata.explain }; \n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/outpatient/opPacsApply/save.do\",\n");
      out.write("\t\t\t\tdata: {data: mini.encode(formdata)},\n");
      out.write("\t\t\t\tasync: false ,\n");
      out.write("\t\t\t\tsuccess: function(r) {\n");
      out.write("\t\t\t\t\tif(r == \"ok\") {\n");
      out.write("\t\t\t\t\t\ttop.mini.alert(\"保存成功!\");\n");
      out.write("\t\t\t\t\t\tqueryPacs();\n");
      out.write("\t\t\t\t\t\tform.setData({});\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\ttop.mini.error(r, \"提示\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// 打印\n");
      out.write("\t\tfunction print() {\n");
      out.write("\t\t\tvar checkPartSelects = mini.get(\"cbl1\").l1Oo;\n");
      out.write("\t\t\tvar checkPartstr = \"\";\n");
      out.write("\t\t\tfor(var i = 0; i < checkPartSelects.length; i++) {\n");
      out.write("\t\t\t\tcheckPartstr +=checkPartSelects[i].text;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcheckPart.setValue(checkPartstr);\n");
      out.write("\t\t\t$(\"#printData\").show();\n");
      out.write("\t\t\tPrint(\"#printData\");\n");
      out.write("\t\t\t$(\"#printData\").hide();\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// OP_PACS_APPLYEXTEND     -- 检查申请单扩展表\n");
      out.write("\t\t// OP_PACS_APPLYDETAIL    -- 检查申请单明细表\n");
      out.write("\t\t// OP_PACS_APPLY -- 检查申请单表(门诊)\n");
      out.write("\t\t// OP_MED_ORDER -- 医嘱\n");
      out.write("\t\t// 查询\n");
      out.write("\t\tfunction onactivechanged(e) {\n");
      out.write("\t\t\tif(e.index == 0) {\n");
      out.write("\t\t\t\tqueryHistory();\n");
      out.write("\t\t\t} else if (e.index == 1) {\n");
      out.write("\t\t\t\tqueryPacs();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction show() {\n");
      out.write("\t\t\t$(\".hideBegin\").show();\n");
      out.write("\t\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- 左侧 表格-->\n");
      out.write("\t<div class=\"mini-fit\">\n");
      out.write("\t\t<div class=\"mini-splitter hideBegin\" style=\"display:none;width:98%; height:98%;border:0;\">\n");
      out.write("\t\t\t<div size=\"25%;\" showCollapseButton=\"false\">\n");
      out.write("\t\t\t\t<div id=\"tabs\" class=\"mini-tabs\" style=\"width:100%; height:100%;margin:5px 0 0 0;\" onactivechanged=\"onactivechanged\">\n");
      out.write("\t\t\t\t\t<div class=\"mini-fit\" title=\"历史就诊\">\n");
      out.write("\t\t\t\t\t\t<div id=\"grid1\" class=\"mini-datagrid\" showPager=\"true\" pageSize=\"15\" borderStyle=\"border:1;\" sortMode=\"client\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width:100%;height:100%;\" multiSelect=\"false\"onrowclick=\"queryOps\"\n");
      out.write("\t\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/medical/outpatient/opExpRegister/getHistoryRecord.do\">\n");
      out.write("\t\t\t\t\t\t\t<div property=\"columns\">\n");
      out.write("\t\t\t\t\t\t\t\t<div type=\"indexColumn\" width=\"50\" headerAlign=\"center\" align=\"center\">序号</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"patientName\" width=\"60\" headerAlign=\"center\" align=\"center\">姓名</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeDoctId\" type=\"comboboxColumn\" width=\"60\" headerAlign=\"center\" align=\"center\">看诊医生\n");
      out.write("\t\t\t\t\t\t\t\t\t<input property=\"editor\" class=\"mini-combobox\"  url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysUser/getKVs.do\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeTime\" width=\"120\" headerAlign=\"center\" align=\"center\" dateFormat=\"yyyy-MM-dd HH:mm:ss\">看诊时间</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div field=\"seeDeptId\" width=\"60\" headerAlign=\"center\" align=\"center\">看诊科室</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<div title=\"电子申请单\" class=\"mini-fit\">\n");
      out.write("\t\t\t\t\t\t<ul id=\"tree1\" class=\"mini-tree\" idField=\"applyId\" textField=\"itemName\" resultAsTree=\"false\" onnodeclick=\"showPacsInfo\"\n");
      out.write("\t\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/outpatient/opPacsApply/getTree.do?registerId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.registerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- 右侧表格 -->\n");
      out.write("\t\t\t<div showCollapseButton=\"false\" style=\"overflow:scroll;\">\n");
      out.write("\t\t\t\t\t<div >\n");
      out.write("\t\t\t\t\t\t<div class=\"mini-toolbar\" style=\"width:50%;\" borderStyle=\"border-left:0;border-right:0;border-top:0;border-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"mini-button\" iconCls=\"fa fa-save\" onclick=\"save\">保存</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"mini-button\" iconCls=\"fa fa-window-print\" onclick=\"print\">打印</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t \t<div id=\"form1\" style=\"width:700px;height:900px;margin:20px auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"mini-hidden\" name=\"applyId\"/>\n");
      out.write("\t\t\t\t\t\t\t<table class=\"form_table\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr style=\"height:60px;\"><td class=\"title\" colspan=\"3\">电子申请单</td></tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"text-align:left;padding:0 0 0 25px; \">申请日期： <input class=\"mini-datepicker\" name=\"applyOperTime\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>费用类别 : 检查费</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"emergencyFlag\" class=\"mini-radiobuttonlist\" value=\"0\" data=\"[{id: 0, text:'普通'}, {id: 1, text: '急'}]\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t<fieldset id=\"fd1\" style=\"width:80%;margin:0 auto;\">\n");
      out.write("\t\t\t\t\t\t\t\t<legend><span class=\"fieldTitle\">患者信息</span></legend>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"fieldset-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>姓名：<input class=\"mini-textbox\" width=\"150\" readOnly=\"true\" name=\"patientName\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>性别：<input class=\"mini-combobox\"  width=\"150\" name=\"sexId\" readOnly=\"true\" data=\"[{id:'1', text:'男'}, {id:'0', text:'女'}]\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>年龄：<input class=\"mini-textbox\" width=\"100\" readOnly=\"true\" name=\"age\"/> 岁</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>科室：<input class=\"mini-combobox\" width=\"150\" readOnly=\"true\" name=\"applyDept\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysOrg/getKVs.do\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>病号：<input class=\"mini-textbox\" width=\"150\" readOnly=\"true\" name=\"patientId\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t电话：<input name=\"phone\" class=\"mini-textbox\" emptyText=\"请输入联系方式\" width=\"150\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t通讯地址 ：<input name=\"address\" class=\"mini-textbox\" emptyText=\"请输入通讯地址\" width=\"300\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<fieldset id=\"fd1\" style=\"width:80%;margin:0 auto;\">\n");
      out.write("\t\t\t\t\t\t\t\t<legend><span class=\"fieldTitle\">临床诊断</span></legend>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"fieldset-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>检查部位</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"cbl1\" class=\"mini-checkboxlist\" name=\"checkPart\" repeatItems=\"7\" repeatLayout=\"table\" textField=\"text\" valueField=\"id\"  \n");
      out.write("\t\t\t\t\t\t\t\t\t    url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysDict/getKVs.do?dictType=BD_CHECKPART\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>检查部位说明</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"explain\" style=\"width:100%;height:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>病史及体格检查</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"historyPhysicalExams\" style=\"width:100%;height:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>其他辅助检查</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"otherLabExams\" style=\"width:100%;height:100%;border:0;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>检查理由</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"extendInfo\" style=\"width:100%;height:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>临床诊断</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"mainDiagnose\" style=\"width:100%;height:100%;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>检查项目</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"mini-textarea\" name=\"itemName\" style=\"width:100%;height:100%;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 结束 -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"printData\" style=\"display:none;\" >\n");
      out.write("\t\t<div id=\"form2\" style=\"width:700px;height:800px;margin:20px auto;\">\n");
      out.write("\t\t\t<input class=\"mini-hidden\" name=\"applyId\"/>\n");
      out.write("\t\t\t<table class=\"form_table\">\n");
      out.write("\t\t\t\t<tr style=\"height:60px;\"><td class=\"title\" colspan=\"3\">电子申请单</td></tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td style=\"text-align:left;padding:0 0 0 25px; \">申请日期： <input class=\"mini-datepicker\" name=\"applyOperTime\"/></td>\n");
      out.write("\t\t\t\t\t<td>费用类别 : 检查费</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input name=\"emergencyFlag\" class=\"mini-radiobuttonlist\" value=\"0\" data=\"[{id: 0, text:'普通'}, {id: 1, text: '急'}]\"/>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t<fieldset id=\"fd1\" style=\"width:85%;margin:0 auto;\">\n");
      out.write("\t\t\t\t<legend><span class=\"fieldTitle\">患者信息</span></legend>\n");
      out.write("\t\t\t\t<div class=\"fieldset-body\">\n");
      out.write("\t\t\t\t\t<table width=\"100%;\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>姓名：<input class=\"mini-textbox\" width=\"150\" borderStyle=\"border:0;\" name=\"patientName\"/></td>\n");
      out.write("\t\t\t\t\t\t\t<td>性别：<input class=\"mini-combobox\"  width=\"150\" borderStyle=\"border:0;\" name=\"sexId\" data=\"[{id:'1', text:'男'}, {id:'0', text:'女'}]\"/></td>\n");
      out.write("\t\t\t\t\t\t\t<td>年龄：<input class=\"mini-textbox\" width=\"100\" borderStyle=\"border:0;\" name=\"age\"/> 岁</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>科室：<input class=\"mini-combobox\" width=\"150\" borderStyle=\"border:0;\" name=\"applyDept\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysOrg/getKVs.do\"/></td>\n");
      out.write("\t\t\t\t\t\t\t<td>病号：<input class=\"mini-textbox\" width=\"150\" borderStyle=\"border:0;\" name=\"patientId\"/></td>\n");
      out.write("\t\t\t\t\t\t\t<td ></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t电话：<input name=\"phone\" class=\"mini-textbox\" borderStyle=\"border:0;\" emptyText=\"请输入联系方式\" width=\"150\"/>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t通讯地址 ：<input name=\"address\" class=\"mini-textbox\" borderStyle=\"border:0;\" emptyText=\"请输入通讯地址\" width=\"300\"/>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</fieldset>\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<fieldset id=\"fd1\" style=\"width:85%;margin:0 auto;\">\n");
      out.write("\t\t\t\t<legend><span class=\"fieldTitle\">临床诊断</span></legend>\n");
      out.write("\t\t\t\t<div class=\"fieldset-body\">\n");
      out.write("\t\t\t\t\t<p>检查部位</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" id=\"checkPart\" name=\"checkPart\" borderStyle=\"border:0;\" style=\"width:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t<p>病史及体格检查</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" name=\"historyPhysicalExams\" borderStyle=\"border:0;\" style=\"width:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t<p>其他辅助检查</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" name=\"otherLabExams\" borderStyle=\"border:0;\" style=\"width:100%;border:0;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t<p>检查理由</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" name=\"extendInfo\" borderStyle=\"border:0;\" style=\"width:100%;background:#E0EEEE;\"/>\n");
      out.write("\t\t\t\t\t<p>临床诊断</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" name=\"mainDiagnose\" borderStyle=\"border:0;\" style=\"width:100%;background:#E0EEEE\"/>\n");
      out.write("\t\t\t\t\t<p>检查项目</p>\n");
      out.write("\t\t\t\t\t<input class=\"mini-textarea\" name=\"itemName\" borderStyle=\"border:0;\" style=\"width:100%;background:#E0EEEE\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</fieldset>\t\t\t\t\t\n");
      out.write("\t  \t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tmini.parse();\n");
      out.write("\t\tvar grid = mini.get(\"grid1\");\n");
      out.write("\t\tvar grid1 = mini.get(\"grid2\");\n");
      out.write("\t\tvar tree = mini.get(\"tree1\");\n");
      out.write("\t\tvar form = new mini.Form(\"form1\");\n");
      out.write("\t\tvar form2 = new mini.Form(\"form2\");\n");
      out.write("\t\tvar checkPart = mini.get(\"checkPart\");\n");
      out.write("\t\tqueryPacs();\n");
      out.write("\t\tqueryHistory();\n");
      out.write("\t\tshow();\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
