/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 00:57:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.expense.maintenance.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regLevelItemList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>挂号费维护</title>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t// 根据选中的节点加载右侧数据\r\n");
      out.write("\tfunction query () {\r\n");
      out.write("\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\tif (!node) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tgrid.load({reglevelId: node.id});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 刷新\r\n");
      out.write("\tfunction refresh () {\r\n");
      out.write("\t\twindow.location.reload();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 添加一个初始化的新行\r\n");
      out.write("\tfunction add () {\r\n");
      out.write("\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\tvar newRow = { \r\n");
      out.write("\t\t\t\treglevelId: node.id,\r\n");
      out.write("\t\t\t\tfixedFlag: 1,\r\n");
      out.write("\t\t\t\tageFlag: 0,\r\n");
      out.write("\t\t\t\tminage: 1,\r\n");
      out.write("\t\t\t\tmaxage: 120,\r\n");
      out.write("\t\t\t\tvalidFlag: 1,\r\n");
      out.write("\t\t\t\tsortId: 0\r\n");
      out.write("\t\t};\r\n");
      out.write("\t    grid.addRow(newRow);\r\n");
      out.write("\t    grid.beginEditCell();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 删除行\r\n");
      out.write("\tfunction remove () {\r\n");
      out.write("\t\tgrid.cancelEdit();\r\n");
      out.write("        var row = grid.getSelected();\r\n");
      out.write("        if (row) {\r\n");
      out.write("        \tgrid.removeRow(row);\r\n");
      out.write("        }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 将项目编码下拉框选择的项目赋值给当前编辑行\r\n");
      out.write("\tfunction onItemChanged (e) {\r\n");
      out.write("\t\tvar currentRow = grid.getSelected();\r\n");
      out.write("\t\tvar itemSelected = e.selected;\r\n");
      out.write("\t\tif (!currentRow || !itemSelected) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar date = {\r\n");
      out.write("\t\t\tnondrugName: itemSelected.itemName,\r\n");
      out.write("\t\t\tnondrugId: itemSelected.itemId\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tgrid.updateRow(currentRow,date);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 保存挂号费维护信息\r\n");
      out.write(" \tfunction save () {\r\n");
      out.write("\t\tgrid.validate();\r\n");
      out.write("\t\tif (grid.isValid() == false) {\r\n");
      out.write("\t\t    top.mini.alert(\"请校验输入单元格内容\");\r\n");
      out.write("\t\t    var error = grid.getCellErrors()[0];\r\n");
      out.write("\t\t    grid.beginEditCell(error.record, error.column);\r\n");
      out.write("\t\t    return;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar data = grid.getChanges();\r\n");
      out.write("\t\tif(data.length <= 0) {\r\n");
      out.write("\t\t\ttop.mini.showTips({content: \"没有数据变化\", state: \"warning\", x: \"center\", y: \"center\", timeout: 2000});\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tvar json = mini.encode(data);\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/maintenance/register/regLevelItem/save.do\";\r\n");
      out.write("\t\t$.post(url, {data: json}, function(r) {\r\n");
      out.write("\t\t\tif (r == \"ok\") {\r\n");
      out.write("\t\t\t\ttop.mini.alert(\"保存成功！\");\r\n");
      out.write("\t\t\t\tgrid.reload();\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\ttop.mini.error(r);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write(" \t// 退出\r\n");
      out.write(" \tfunction exit () {\r\n");
      out.write(" \t\tvar currentTab = top.tabs.activeIndex;\r\n");
      out.write(" \t\tvar tabs = top.tabs;\r\n");
      out.write(" \t\ttabs.removeTab(currentTab);\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write("\t// 单元格值提交前事件\r\n");
      out.write(" \tfunction cellcommitedit(e) {\r\n");
      out.write(" \t\tif(e.field == \"minage\" || e.field == \"maxage\") {\r\n");
      out.write("\t\t\tif(!/^\\d+$/.test(e.value)) {\r\n");
      out.write("\t\t\t\ttop.mini.showTips({content: \"请输入大于0的数值！\", state: \"warning\", x: \"center\", y: \"center\", timeout: 2000});\r\n");
      out.write("\t\t\t\te.cancel = true; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write(" \t\tif(e.field == \"qty\") {\r\n");
      out.write("\t\t\tif(!/^\\d+$/.test(e.value)) {\r\n");
      out.write("\t\t\t\ttop.mini.showTips({content: \"请输入大于0的数值！\", state: \"warning\", x: \"center\", y: \"center\", timeout: 2000});\r\n");
      out.write("\t\t\t\te.cancel = true; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write(" \t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 显示隐藏\r\n");
      out.write("\tfunction show() {\r\n");
      out.write("\t\t$(\".toolbar\").show();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"mini-toolbar toolbar\" style=\"background:#fafafa;display:none;\" borderStyle=\"border-top:0px;border-left:0px;border-right:0px;\">\r\n");
      out.write("        <table style=\"width:100%;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-refresh\" onclick=\"refresh\">刷新</a>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-file-o\" onclick=\"add\">新增</a>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-remove\" onclick=\"remove\">删除</a>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-save\" onclick=\"save\">保存</a>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-window-close\" onclick=\"exit\">退出</a>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t    \t</tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mini-fit\">\r\n");
      out.write("    \t<div class=\"mini-splitter\" style=\"width:100%;height:100%;\" allowResize=\"false\" handlerSize=\"6\" borderStyle=\"border:0;\">\r\n");
      out.write("\t   \t\t<div size=\"250px;\" showCollapseButton=\"false\">\r\n");
      out.write("\t   \t\t\t<div class=\"mini-toolbar\" style=\"width:100%;\" borderStyle=\"border-left:0;border-bottom:solid 1px #c5c5c5;\">\r\n");
      out.write("\t   \t\t\t\t<span style=\"font-size:14px;\">挂号级别</span>\r\n");
      out.write("\t   \t\t\t</div>\r\n");
      out.write("\t   \t\t\t<div class=\"mini-fit\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"tree\" class=\"mini-tree\" style=\"width:100%; height:100%; margin:0; padding:2px;\" value=\"0\"\r\n");
      out.write("\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/maintenance/register/regLevel/getKVs.do\" onnodeselect=\"query\">\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t   \t\t</div>\r\n");
      out.write("\t   \t\t<div showCollapseButton=\"false\">\r\n");
      out.write("\t\t   \t\t<div id=\"grid\" class=\"mini-datagrid\" borderStyle=\"border-top:0;border-left:0;border-right:0;border-bottom:0\"\r\n");
      out.write("\t\t   \t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/expense/maintenance/register/regLevelItem/getRegLevelItemList.do\" showPager=\"false\" oncellcommitedit=\"cellcommitedit\"\r\n");
      out.write("\t\t   \t\t\tstyle=\"width:100%;height:100%;\" allowCellSelect=\"true\" allowCellEdit=\"true\" editNextOnEnterKey=\"true\" multiSelect=\"true\"\r\n");
      out.write("\t\t   \t\t\tallowCellValid=\"true\" cellEditAction=\"celldblclick\" editNextOnEnterKey=\"true\">\r\n");
      out.write("\t\t   \t\t\t<div property=\"columns\">\r\n");
      out.write("\t\t   \t\t\t\t<div type=\"indexcolumn\"></div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"reglevelitemlistId\" visible=\"false\">挂号费对应项目流水号(隐藏)\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"reglevelId\" visible=\"false\">挂号级别(隐藏)\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"nondrugId\" visible=\"false\">非药品编码(隐藏)\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"tag.userDefineCode\" headerAlign=\"center\" align=\"center\" vtype=\"required\">项目编码\r\n");
      out.write("\t\t   \t\t\t\t\t<div property=\"editor\" class=\"mini-autocomplete\" headerAlign=\"center\" align=\"center\" popupWidth=\"1000\" onvaluechanged=\"onItemChanged\"\r\n");
      out.write("\t\t   \t\t\t\t\t\tvalueFromSelect=\"true\" textField=\"itemNo\" valueField=\"itemNo\"\r\n");
      out.write("\t\t\t\t\t\t        url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/basedata/datamanager/nondrug/getByItemType.do?itemType=2\">     \r\n");
      out.write("\t\t\t\t\t\t        <div property=\"columns\">\r\n");
      out.write("\t\t\t\t\t\t            <div field=\"itemId\" width=\"0\">系统编码(隐藏)</div>\r\n");
      out.write("\t\t\t\t\t\t            <div field=\"itemNo\" headerAlign=\"center\" align=\"center\">编码</div>\r\n");
      out.write("\t\t\t\t\t\t            <div field=\"itemName\" headerAlign=\"center\" align=\"center\">名称</div>\r\n");
      out.write("\t\t\t\t\t\t            <div field=\"itemPrice\" headerAlign=\"center\" align=\"center\">单价</div>\r\n");
      out.write("\t\t\t\t\t\t            <div field=\"ordDosageUnit\" headerAlign=\"center\" align=\"center\">单位</div>\r\n");
      out.write("\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"nondrugName\" headerAlign=\"center\" align=\"center\" vtype=\"required\" readOnly=\"true\">项目名称\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"qty\" headerAlign=\"center\"  align=\"center\" vtype=\"required;float\">数量\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"fixedFlag\" type=\"checkboxcolumn\" align=\"center\"  headerAlign=\"center\" trueValue=\"1\" falseValue=\"0\">固定收取\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"ageFlag\" type=\"checkboxcolumn\" headerAlign=\"center\" align=\"center\" trueValue=\"1\" falseValue=\"0\">年龄相关\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div field=\"minage\" headerAlign=\"center\" align=\"center\" vtype=\"float\">最小年龄\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" headerAlign=\"center\" align=\"center\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div field=\"maxage\" headerAlign=\"center\" align=\"center\" vtype=\"float\">最大年龄\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" headerAlign=\"center\" align=\"center\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"validFlag\" type=\"checkboxcolumn\" headerAlign=\"center\" align=\"center\" trueValue=\"1\" falseValue=\"0\">有效性\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"sortId\" headerAlign=\"center\" align=\"center\" vtype=\"float\">序号\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" headerAlign=\"center\" align=\"center\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!--\r\n");
      out.write("\t\t   \t\t\t\t<div field=\"operId\" headerAlign=\"center\" align=\"center\">操作员\r\n");
      out.write("\t\t   \t\t\t\t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write(" \t\t   \t\t\t\t<div field=\"operTime\" headerAlign=\"center\" align=\"center\" dateFormat=\"yyyy-MM-dd HH:mm:ss\">操作日期\r\n");
      out.write("\t\t   \t\t\t\t\t<input class=\"mini-datepicker\" style=\"width:100%;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t   \t\t\t</div>\r\n");
      out.write("\t\t   \t\t</div>\t\r\n");
      out.write("\t   \t\t</div>\r\n");
      out.write("\t   \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tmini.parse();\r\n");
      out.write("\t\tvar grid = mini.get(\"grid\")\r\n");
      out.write("\t\tvar tree = mini.get(\"tree\")\r\n");
      out.write("\t\tgrid.load({reglevelId : 0});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tshow();\r\n");
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
