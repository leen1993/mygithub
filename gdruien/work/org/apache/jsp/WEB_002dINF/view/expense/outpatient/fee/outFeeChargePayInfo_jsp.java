/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 06:56:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.expense.outpatient.fee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class outFeeChargePayInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>收费</title>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write(".addStyle {\r\n");
      out.write("/* \tbackground:#e2eff8; */\r\n");
      out.write("\tbackground:#539ece;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t// 按F8确认收费\r\n");
      out.write("\tdocument.onkeydown=function() {\r\n");
      out.write("\t\t if(event.keyCode==119) {\r\n");
      out.write("\t\t\t checkPayment();\r\n");
      out.write("\t\t }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 确定\r\n");
      out.write("\tfunction sure() {\r\n");
      out.write("\t\tvar data = form1.getData();\r\n");
      out.write("\t\tdata.type = \"ok\";\r\n");
      out.write("\t\tvar paymentList = grid.getList();\r\n");
      out.write("\t\tdata.paymentList = mini.encode(paymentList);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tgoodbye(data);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 检查支付方式与对应金额\r\n");
      out.write("\tfunction checkPayment() {\r\n");
      out.write("\t\tvar totCost = mini.get(\"receivable\").getValue(); \r\n");
      out.write("\t\tvar rows = grid.getList();\r\n");
      out.write("\t\tvar cost = 0;\r\n");
      out.write("\t\tfor(var i= 0;i<rows.length;i++) {\r\n");
      out.write("\t\t\tif(rows[i].actualCost > 0) {\r\n");
      out.write("\t\t\t\tcost += parseFloat(rows[i].actualCost);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif( parseFloat(totCost) != cost.toFixed(2) ) {\r\n");
      out.write("\t\t\tmini.showTips({content:\"金额填写错误\",state:\"warning\",x:\"center\",y:\"center\",timeout:3000});\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsure();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 取消\r\n");
      out.write("\tfunction cancel() {\r\n");
      out.write("\t\tvar data = form1.getData();\r\n");
      out.write("\t\tdata.type = \"cancel\";\r\n");
      out.write("\t\tgoodbye(data);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 根据实收计算找零\r\n");
      out.write("\tfunction getChange () {\r\n");
      out.write("\t\treceived.validate();\r\n");
      out.write("        if (received.isValid() == false) {\r\n");
      out.write("        \tmini.showTips({content:\"必须是数字\",state:\"warning\",x:\"center\",y:\"center\",timeout:3000});\r\n");
      out.write("        \treturn;\r\n");
      out.write("        }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 根据现金计算\r\n");
      out.write("\t\tvar cash = grid.getRow(0).actualCost;\r\n");
      out.write("\t\tif(!cash || cash == 0) {\r\n");
      out.write("\t\t\tchange.setValue( (received.value).toFixed(2) );\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tchange.setValue( (received.value - cash).toFixed(2) );\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 聚焦确认按钮\r\n");
      out.write("\t\t$(\"#submit\").addClass('addStyle');\r\n");
      out.write("\t\t$(\"#submit\").focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//grid初始化事件\r\n");
      out.write("\tfunction setRow(e) {\r\n");
      out.write("\t\tvar cost = mini.get(\"receivable\").getValue();\r\n");
      out.write("\t\tvar paymentId = mini.get(\"payment\").getValue();\r\n");
      out.write("\t\tif (paymentId) {\r\n");
      out.write("\t\t\tvar row = grid.findRow(function(item){\r\n");
      out.write("\t\t\t\tif (item.id==paymentId) return true;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\trow.actualCost = cost;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\te.data[0].actualCost = cost;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor (var i= 0;i<e.data.length;i++) {\r\n");
      out.write("\t\t\te.data[i].paymentId = e.data[i].id;\r\n");
      out.write("\t\t\te.data[i].paymentName = e.data[i].text;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tgrid.loadData(e.data);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treceived.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 单元格编辑后事件\r\n");
      out.write("\tfunction cellendedit (e) {\r\n");
      out.write("\t\tif (e.field == \"actualCost\") {\r\n");
      out.write("\t\t\tvar reg = /^[0-9]+.?[0-9]*$/; \r\n");
      out.write("\t\t\tif (e.value <= 0 || !reg.test(e.value)) {\r\n");
      out.write("\t\t\t\tgrid.updateRow(e.row,{actualCost: null});\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tgrid.updateRow(e.row,{actualCost: parseFloat(e.value).toFixed(2)});\r\n");
      out.write("\t\t\t\tgetCostAuto(e);\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 输入金额符合字符规范时\r\n");
      out.write("\tfunction getCostAuto(e) {\r\n");
      out.write("\t\tif(e.row.paymentId != \"CA\") {\r\n");
      out.write("\t\t\tcountCash(e);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 计算金额并自动填写\r\n");
      out.write("\tfunction countCash(e) {\r\n");
      out.write("\t\tvar totCost = mini.get(\"receivable\").getValue();\r\n");
      out.write("\t\tvar rows = grid.getList();\r\n");
      out.write("\t\tvar cost = 0;\r\n");
      out.write("\t\tfor(var i= 1;i<rows.length;i++) {\r\n");
      out.write("\t\t\tif(rows[i].actualCost > 0 && rows[i].paymentId != \"CA\") {\r\n");
      out.write("\t\t\t\tcost += parseFloat(rows[i].actualCost);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif( parseFloat(totCost) >= cost.toFixed(2) ) {\r\n");
      out.write("\t\t\tgrid.updateRow(rows[0] , {actualCost: (parseFloat(totCost) - cost).toFixed(2)});\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tif( parseFloat(totCost) < cost.toFixed(2) ) {\r\n");
      out.write("\t\t\tmini.showTips({content:\"输入金额过大\",state:\"warning\",x:\"center\",y:\"center\",timeout:3000});\r\n");
      out.write("\t\t\tgrid.updateRow(e.row,{actualCost: null});\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 确定按钮失去焦点时，去除背景色\r\n");
      out.write("\tfunction removeColor() {\r\n");
      out.write("\t\t$(\"#submit\").removeClass('addStyle');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onclick=\"removeColor()\">\r\n");
      out.write("\t<div class=\"mini-toolbar\" style=\"background:#fafafa; font-size:30px;\" \r\n");
      out.write("\t\tborderStyle=\"border-top:solid 0px #006aad;border-left:0px;border-right:0px;border-bottom:solid 1px #c5c5c5;\">\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.patientName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('、');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${register.sexCode==1?'男':'女'}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('、');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${medicalTypeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mini-toolbar\" style=\"background:#fafafa; font-size:20px;\" \r\n");
      out.write("\t\tborderStyle=\"border-top:solid 0px #c5c5c5;border-left:0px;border-right:0px;border-bottom:solid 1px #c5c5c5;\">\r\n");
      out.write("\t\t总金额：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("、个人支付：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ownpayCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("、记账(基金)：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pubpayCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mini-toolbar\" style=\"background:#fafafa;\" \r\n");
      out.write("\t\tborderStyle=\"border-top:solid 0px #c5c5c5;border-left:0px;border-right:0px;border-bottom:solid 1px #c5c5c5;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr style=\"font-size:15px;\">\r\n");
      out.write("\t\t\t\t<td style=\"color:red; font-weight:bold;\">应收：</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"receivable\" class=\"mini-textbox\" readOnly=\"true\" inputStyle=\"color:red; font-weight:bold;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td>实收：</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"received\" class=\"mini-textbox\" onenter=\"getChange\" vtype=\"float\" selectOnFocus=\"true\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td>找零：</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"change\" class=\"mini-textbox\" readOnly=\"true\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mini-fit\" id=\"form1\">\r\n");
      out.write("\t\t<input id =\"payment\" name=\"paymentId\" class=\"mini-hidden\"/>\r\n");
      out.write("\t\t<div id=\"grid1\" class=\"mini-datagrid\" style=\"width:100%;height:100%\" onload=\"setRow\" onselect=\"\" \r\n");
      out.write("\t\t\tshowPager=\"false\" allowCellEdit=\"true\" allowCellSelect=\"true\" borderStyle=\"border:0;\" oncellendedit=\"cellendedit\" \r\n");
      out.write("\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysDict/getKVs.do?dictTypes=BD_PAYMENT\">\r\n");
      out.write("\t\t\t<div property=\"columns\">\r\n");
      out.write("\t       \t\t<div type=\"indexcolumn\"></div>\r\n");
      out.write("\t       \t\t<div field=\"paymentId\" visible=\"false\">支付方式ID</div>\r\n");
      out.write("\t       \t\t<div field=\"paymentName\" headerAlign=\"center\" align=\"center\">支付方式</div>\r\n");
      out.write("\t       \t\t<div field=\"actualCost\" name=\"actualCost\" headerAlign=\"center\" align=\"center\">金额 \r\n");
      out.write("\t       \t\t\t<input property=\"editor\" class=\"mini-textbox\"/>\r\n");
      out.write("\t       \t\t</div>\r\n");
      out.write("\t       \t\t<div field=\"transactionNo\" headerAlign=\"center\" align=\"center\">支付/交易号</div>\r\n");
      out.write("\t       \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"mini-toolbar\" style=\"background:#fafafa;\" \r\n");
      out.write("\t\tborderStyle=\"border-top:solid 1px #006aad;border-left:0px;border-right:0px;border-bottom:0px;\">\r\n");
      out.write("        <table style=\"width:100%;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("            \t<td style=\"color:red; font-size:20px;\">\r\n");
      out.write("            \t\t<span id=\"receiptNo\">发票号：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invoice.invoiceNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            \t</td>\r\n");
      out.write("            \t<td>\r\n");
      out.write("            \t\t<!-- <a class=\"mini-button\" iconCls=\"\" onclick=\"countCash\">计算现金</a> -->\r\n");
      out.write("            \t</td>\r\n");
      out.write("\t            <td style=\"text-align: right;\">\r\n");
      out.write("\t            \t<a id=\"submit\" class=\"mini-button\" iconCls=\"fa fa-check\" onclick=\"checkPayment\">确定（F8）</a>\r\n");
      out.write("\t            \t<a class=\"mini-button\" iconCls=\"fa fa-window-close\" onclick=\"cancel\">取消</a>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t    \t</tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div> \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\tmini.parse();\r\n");
      out.write("\t\tvar receivable = mini.get(\"receivable\");\r\n");
      out.write("\t\tvar received = mini.get(\"received\");\r\n");
      out.write("\t\tvar change = mini.get(\"change\");\r\n");
      out.write("\t\tvar form1 = new mini.Form(\"#form1\");\r\n");
      out.write("\t\tvar paymentId = mini.get(\"paymentId\");\r\n");
      out.write("\t\tvar grid = mini.get(\"grid1\");\r\n");
      out.write("\t\tgrid.load();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 页面初始化时获取显示发票号时异常\r\n");
      out.write("\t\tvar state = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invoice.state}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\tif(state != \"ok\") {\r\n");
      out.write("\t\t\tmini.alert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invoice.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\r\n");
      out.write("\t\t}\r\n");
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
