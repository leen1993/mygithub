/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2018-05-14 02:45:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.platform.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rekj.platform.model.system.SysResource;

public final class sysResourceList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rekj.platform.model.system.SysResource");
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

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>菜单资源管理</title>\r\n");
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
      out.write("\r\n");
      out.write("\t// 过滤功能组(不请求后台)\r\n");
      out.write("\tfunction filterGroup(e) {\r\n");
      out.write("\t\tvar key = mini.get(\"groupName\").getValue();\r\n");
      out.write("        if (key == \"请输入功能组名称\"||key == \"\") {\r\n");
      out.write("            tree.clearFilter();\r\n");
      out.write("        } else {\r\n");
      out.write("            key = key.toLowerCase();                \r\n");
      out.write("            tree.filter(function (node) {\r\n");
      out.write("                var text = node.groupName ? node.groupName.toLowerCase() : \"\";\r\n");
      out.write("                if (text.indexOf(key) != -1) {\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 查询资源菜单\r\n");
      out.write("\tfunction queryResource(e) {\r\n");
      out.write("\t\tvar groupNode = tree.getSelectedNode();console.log(groupNode);\r\n");
      out.write("\t\tif (groupNode) {\r\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysResource/getByGroup.do?groupId=\"+groupNode.groupId;\r\n");
      out.write("\t\t\t// grid.load(url);\r\n");
      out.write("\t\t\tgrid.load({groupId:groupNode.groupId});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 删除菜单\r\n");
      out.write("\tfunction delResource() {\r\n");
      out.write("\t\tgrid.cancelEdit();\r\n");
      out.write("        var row = grid.getSelected();\r\n");
      out.write("        if (row) {\r\n");
      out.write("            grid.removeNode(row);\r\n");
      out.write("        }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 添加菜单\r\n");
      out.write("\tfunction addResource(root) {\r\n");
      out.write("\t\tvar groupNode = tree.getSelectedNode();\r\n");
      out.write("\t\tif (!groupNode) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (root) {\r\n");
      out.write("\t\t\tvar row = {};\r\n");
      out.write("\t\t\trow.groupId = groupNode.groupId;\r\n");
      out.write("\t\t\tgrid.addNode(row);\r\n");
      out.write("\t\t\tgrid.beginEditCell(row, \"resName\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar rowParent = grid.getSelected();\r\n");
      out.write("\t\t\tif (!rowParent.resId) {\r\n");
      out.write("\t\t\t\tmini.showTips({\r\n");
      out.write("\t\t\t\t\tcontent: \"请先保存, 后添加节点\",    \r\n");
      out.write("\t\t\t\t    state: \"info\",      \r\n");
      out.write("\t\t\t\t    x: \"center\",          \r\n");
      out.write("\t\t\t\t    y: \"center\",      \r\n");
      out.write("\t\t\t\t    timeout: 2000\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (rowParent) {\r\n");
      out.write("\t\t\t\tvar row = {};\r\n");
      out.write("\t\t\t\trow.parentId = rowParent.resId;\r\n");
      out.write("\t\t\t\trow.groupId = groupNode.groupId;\r\n");
      out.write("\t\t        grid.addNode(row, \"add\", rowParent);\r\n");
      out.write("\t\t        grid.beginEditCell(row, \"resName\");\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 编辑菜单\r\n");
      out.write("\tfunction editResource() {\r\n");
      out.write("\t\tvar row = grid.getSelected();\r\n");
      out.write("        if (row) {\r\n");
      out.write("            grid.beginEditCell(row, \"resName\");\r\n");
      out.write("        }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 添加角色\r\n");
      out.write("\tfunction addGroup(root) {\r\n");
      out.write("\t\tvar newNode = {\r\n");
      out.write("\t\t\tgroupId : \"\",\r\n");
      out.write("\t\t\tgroupName : \"[新功能组]\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (root === true) {\r\n");
      out.write("\t\t\t// 添加一级功能组\r\n");
      out.write("\t\t\ttree.addNode(newNode);\r\n");
      out.write("\t\t\ttree.selectNode(newNode);\r\n");
      out.write("\t\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\t\ttree.scrollIntoView(node);\r\n");
      out.write("\t\t\ttree.beginEdit(node);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t// 添加功能组\r\n");
      out.write("\t\t\ttree.addNode(newNode, \"add\", tree.getSelectedNode());\r\n");
      out.write("\t\t\ttree.selectNode(newNode);\r\n");
      out.write("\t\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\t\ttree.scrollIntoView(node);\r\n");
      out.write("\t\t\ttree.beginEdit(node);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 编辑功能组\r\n");
      out.write("\tfunction editGroup() {\r\n");
      out.write("\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\tif (node) {\r\n");
      out.write("\t\t\ttree.beginEdit(node);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 删除功能组\r\n");
      out.write("\tfunction delGroup() {\r\n");
      out.write("        var node = tree.getSelectedNode();\r\n");
      out.write("        if (!node) {\r\n");
      out.write("        \treturn;\r\n");
      out.write("        }\r\n");
      out.write("        var list = [];\r\n");
      out.write("\t\tgroupIds = \"\";\r\n");
      out.write("\t\tlist.push(node);\r\n");
      out.write("\t\tvar children = getChildren(node);\r\n");
      out.write("\t\tlist = list.concat(children);\r\n");
      out.write("\t\tfor (var i = 0; i < list.length; i++) {\r\n");
      out.write("\t\t\tif (i == list.length - 1) {\r\n");
      out.write("\t\t\t\tgroupIds += list[i].groupId;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tgroupIds += list[i].groupId + \",\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("        \r\n");
      out.write("        var fn = function(r) {\r\n");
      out.write("        \tif (r == \"ok\") {\r\n");
      out.write("        \t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysGroup/del.do\";\r\n");
      out.write("        \t\t$.post(url, {groupIds : groupIds}, function (r) {\r\n");
      out.write("        \t\t\tif (r == \"ok\") {\r\n");
      out.write("        \t\t\t\ttree.removeNode(node);\r\n");
      out.write("        \t\t\t} else {\r\n");
      out.write("        \t\t\t\ttop.mini.error(r);\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t});\r\n");
      out.write("        \t}\r\n");
      out.write("        }\r\n");
      out.write("        top.mini.confirm(\"确定删除选中功能组?\", \"确认\", fn);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//获取功能子节点\r\n");
      out.write("\tfunction getChildren (group) {\r\n");
      out.write("\t\tvar list = [];\r\n");
      out.write("\t\tif (group.children) {\r\n");
      out.write("\t\t\tlist = list.concat(group.children);\r\n");
      out.write("\t\t\tvar children = group.children;\r\n");
      out.write("\t\t\tfor (var i = 0; i < children.length; i++) {\r\n");
      out.write("\t\t\t\tif (children[i].children) {\r\n");
      out.write("\t\t\t\t\tvar inChildren = getChildren(children[i]);\r\n");
      out.write("\t\t\t\t\tlist = list.concat(inChildren);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn list;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 显示角色上下文菜单\r\n");
      out.write("\tfunction onGroupMenu(e) {\r\n");
      out.write("\t\tvar menu = e.sender;\r\n");
      out.write("\t    var node = tree.getSelectedNode();\r\n");
      out.write("\t    if (!node) {\r\n");
      out.write("\t        e.cancel = true;\r\n");
      out.write("\t        return;\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 显示资源上下文菜单\r\n");
      out.write("\tfunction onResourceMenu(e) {\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 编辑group节点完成,触发后端保存\r\n");
      out.write("\tfunction onGroupEndEdit(e) {\r\n");
      out.write("\t\tvar node = e.node;\r\n");
      out.write("\t\tvar sender = e.sender;\r\n");
      out.write("\t\tif (!node.groupName || node.groupName == \"[新功能组]\") {\r\n");
      out.write("\t\t\tnode.groupName == \"[新功能组]\"\r\n");
      out.write("\t\t\tsender.updateNode(node, {groupName:\"[新功能组]\"});\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysGroup/save.do\";\r\n");
      out.write("\t\tvar data = node;\r\n");
      out.write("\t\tvar fn = function (r) {\r\n");
      out.write("\t\t\tvar result = $.decode(r);\r\n");
      out.write("\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\tsender.updateNode(node, result.tag);\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\ttop.mini.error(result.message);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$.post(url, data, fn);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 检测是否 允许拖动\r\n");
      out.write("\tfunction ongivefeedback(e) {\r\n");
      out.write("\t\tif (e.sender != e.from) {\r\n");
      out.write("\t\t\te.effect = \"no\";\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar targetId = e.dropNode.groupId;\r\n");
      out.write("\t\tvar dragId = e.dragNode.groupId;\r\n");
      out.write("\t\tif (!targetId || !dragId) {\r\n");
      out.write("\t\t\te.cancel = true;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (e.dragAction == \"before\" || e.dragAction == \"after\") {\r\n");
      out.write("\t\t\tif (e.dropNode.parentId == e.dragNode.parentId) {\r\n");
      out.write("\t\t\t\te.cancel = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else if (e.dragAction == \"add\") {\r\n");
      out.write("\t\t\tif (e.dropNode.groupId == e.dragNode.groupId) {\r\n");
      out.write("\t\t\t\te.cancel = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 检测是否 允许拖动\r\n");
      out.write("\tfunction onbeforedrop(e) {\r\n");
      out.write("\t\tvar targetId = e.dropNode.groupId;\r\n");
      out.write("\t\tvar dragId = e.dragNode.groupId;\r\n");
      out.write("\t\tif (!targetId || !dragId) {\r\n");
      out.write("\t\t\te.cancel = true;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (e.dragAction == \"before\" || e.dragAction == \"after\") {\r\n");
      out.write("\t\t\tif (e.dropNode.parentId == e.dragNode.parentId) {\r\n");
      out.write("\t\t\t\te.cancel = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else if (e.dragAction == \"add\") {\r\n");
      out.write("\t\t\tif (e.dropNode.groupId == e.dragNode.groupId) {\r\n");
      out.write("\t\t\t\te.cancel = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// 拖拽角色节点更改parent或排序\r\n");
      out.write("\tfunction ondrop(e) {\r\n");
      out.write("\t\tvar targetId = e.dropNode.groupId;\r\n");
      out.write("\t\tvar dragId = e.dragNode.groupId;\r\n");
      out.write("\t\tif (!targetId || !dragId) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysGroup/move.do\";\r\n");
      out.write("\t\tvar params = {\r\n");
      out.write("\t\t\ttargetId : targetId,\r\n");
      out.write("\t\t\tdragId : dragId,\r\n");
      out.write("\t\t\tmoveType: e.dragAction \r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$.post(url, params);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 保存编辑资源\r\n");
      out.write("\tfunction save() {\r\n");
      out.write("\t\tgrid.validate();\r\n");
      out.write("\t\tif (grid.isValid() == false) {\r\n");
      out.write("\t\t    top.mini.alert(\"请校验输入单元格内容\");\r\n");
      out.write("\t\t    var error = grid.getCellErrors()[0];\r\n");
      out.write("\t\t    grid.beginEditCell(error.record, error.column);\r\n");
      out.write("\t\t    return;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar data = grid.getChanges();\r\n");
      out.write("\t\tvar json = mini.encode(data);\r\n");
      out.write("\t\tvar node = tree.getSelectedNode();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (node) {\r\n");
      out.write("\t\t\tvar groupId = node.groupId; \r\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysResource/save.do\";\r\n");
      out.write("\t\t\tvar fn = function(r) {\r\n");
      out.write("\t\t\t\tif (r == \"ok\") {\r\n");
      out.write("\t\t\t\t \tqueryResource();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\ttop.mini.error(r);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.post(url, {data: json, groupId: groupId}, fn);\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"mini-toolbar\" borderStyle=\"border-top:0;border-right:0;border-left:0;border-bottom:1;\"\r\n");
      out.write("\t    <table>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t         \t<td>\r\n");
      out.write("\t         \t\t<a class=\"mini-button\" iconCls=\"fa fa-plus\" onclick=\"addGroup(true)\">添加一级功能组</a>\r\n");
      out.write("\t         \t\t<a class=\"mini-button\" iconCls=\"fa fa-plus\" onclick=\"addResource(true)\">添加一级菜单</a>\r\n");
      out.write("\t         \t\t<a class=\"mini-button\" iconCls=\"fa fa-save\" onclick=\"save()\"><span title=\"对菜单进行的增加,删除,修改操作执行批量保存,不提交,数据将不能保存!\">保存菜单</span></a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"treeMenu\" class=\"mini-contextmenu\" style=\"display:none;\" \r\n");
      out.write("\t\t\t\t\t\tonbeforeopen=\"onGroupMenu\">\r\n");
      out.write("\t\t\t\t\t    <li name=\"addGroupRoot\" iconCls=\"fa fa-plus\" onclick=\"addGroup(true)\">添加一级功能组</li>\r\n");
      out.write("\t\t\t\t\t    <li name=\"addGroup\" iconCls=\"fa fa-plus\" onclick=\"addGroup()\">添加功能组</li>\r\n");
      out.write("\t\t\t\t\t\t<li name=\"editGroup\" iconCls=\"fa fa-pencil-square-o\" onclick=\"editGroup()\">编辑功能组</li>\r\n");
      out.write("\t\t\t\t\t\t<li name=\"delGroup\" iconCls=\"fa fa-trash-o\" onclick=\"delGroup()\">删除功能组</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul id=\"gridMenu\" class=\"mini-contextmenu\" style=\"display:none;\" \r\n");
      out.write("\t\t\t\t\t\tonbeforeopen=\"onResourceMenu\">\r\n");
      out.write("\t\t\t\t\t\t<li name=\"addResourceRoot\" iconCls=\"fa fa-plus\" onclick=\"addResource(true)\">添加一级菜单</li>\r\n");
      out.write("\t\t\t\t\t    <li name=\"addResource\" iconCls=\"fa fa-plus\" onclick=\"addResource()\">添加子菜单</li>\r\n");
      out.write("\t\t\t\t\t    <li name=\"editResource\" iconCls=\"fa fa-pencil-square-o\" onclick=\"editResource()\">编辑菜单</li>\r\n");
      out.write("\t\t\t\t\t\t<li name=\"delResource\" iconCls=\"fa fa-trash-o\" onclick=\"delResource()\">删除菜单</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t         \t</td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mini-fit\">\r\n");
      out.write("\t\t<div class=\"mini-splitter\" style=\"width:100%;height:100%;\" allowResize=\"false\" handlerSize=\"6\" borderStyle=\"border-top:0;\">\r\n");
      out.write("    \t\t<div size=\"230px;\" showCollapseButton=\"false\">\r\n");
      out.write("\t\t\t\t<div style=\"height:25px;\">\r\n");
      out.write("\t\t\t    \t<input id=\"groupName\" class=\"mini-textbox\" borderStyle=\"border-left:0px;border-right:0px;border-top:0px;\" \r\n");
      out.write("\t\t\t    \t\temptyText=\"请输入功能组名称\" style=\"width:100%\" onenter=\"filterGroup()\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("    \t\t\t<div class=\"mini-fit\">\r\n");
      out.write("\t\t\t    \t<ul id=\"tree1\" expandOnLoad=\"1\" resultAsTree=\"false\" checkRecursive=\"false\" \r\n");
      out.write("\t\t\t    \t\tclass=\"mini-tree\" contextMenu=\"#treeMenu\"\r\n");
      out.write("\t\t\t    \t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysGroup/getAll.do\" showArrow=\"true\"\r\n");
      out.write("\t\t\t\t\t\tshowTreeIcon=\"true\"  showCheckBox=\"false\" \r\n");
      out.write("\t\t\t\t\t\ttextField=\"groupName\" idField=\"groupId\" parentField=\"parentId\" expandOnNodeClick=\"false\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:100%;height:100%;margin:0;padding:2px;\" onnodeselect=\"queryResource\"\r\n");
      out.write("\t\t\t\t\t\tallowLeafDropIn=\"true\" allowDrag=\"true\" allowDrop=\"true\"\r\n");
      out.write("\t\t\t\t\t\tondrop=\"ondrop\" onbeforedrop=\"onbeforedrop\" ongivefeedback=\"ongivefeedback\" onendedit=\"onGroupEndEdit\">\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<div showCollapseButton=\"false\">\r\n");
      out.write("    \t\t\t<div class=\"mini-fit\">\r\n");
      out.write("\t\t\t    \t<div id=\"grid1\" class=\"mini-treegrid\" showPager=\"false\" borderStyle=\"border:0;\" \r\n");
      out.write("\t\t\t    \t\tshowTreeIcon=\"true\" idField=\"resId\" parentField=\"parentId\"\r\n");
      out.write("\t\t\t    \t\tstyle=\"width:100%;height:100%;\" treeColumn=\"resName\" expandOnLoad=\"1\" resultAsTree=\"false\" \r\n");
      out.write("\t\t\t        \turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/platform/system/sysResource/getByRoleAndGroup.do\" \r\n");
      out.write("\t\t\t        \tallowCellEdit=\"true\" allowCellSelect=\"true\" editNextOnEnterKey=\"true\"\r\n");
      out.write("\t\t\t        \tallowDrag=\"true\" allowDrop=\"true\" multiSelect=\"false\" allowCellValid=\"true\"\r\n");
      out.write("\t\t\t        \tcellEditAction11=\"celldblclick\" ongivefeedback=\"ongivefeedback\" contextMenu=\"#gridMenu\">\r\n");
      out.write("\t\t\t\t\t\t <div property=\"columns\">\r\n");
      out.write("\t\t\t\t\t\t \t<div type=\"indexcolumn\"></div>\r\n");
      out.write("\t\t\t\t\t\t \t<div name=\"resName\" field=\"resName\" vtype=\"required\" width=\"90\" headerAlign=\"center\">菜单名称\r\n");
      out.write("\t\t\t\t\t\t \t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\" />\r\n");
      out.write("\t\t\t\t\t\t \t</div>\r\n");
      out.write("\t\t\t\t\t\t \t<div type=\"checkboxcolumn\" field=\"validFlag\" vtype=\"required\" trueValue=\"1\" falseValue=\"0\" width=\"60\" headerAlign=\"center\">是否有效</div>\r\n");
      out.write("\t\t\t\t\t\t \t<div field=\"defaultUrl\" width=\"170\" headerAlign=\"center\">URL\r\n");
      out.write("\t\t\t\t\t\t \t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\" />\r\n");
      out.write("\t\t\t\t\t\t \t</div>\r\n");
      out.write("\t\t\t\t\t\t \t<div field=\"icon\" width=\"90\" headerAlign=\"center\">图标(iconCls)\r\n");
      out.write("\t\t\t\t\t\t \t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\" />\r\n");
      out.write("\t\t\t\t\t\t \t</div>\r\n");
      out.write("\t\t\t\t\t\t \t<div field=\"sortId\" width=\"90\" vtype=\"int\" headerAlign=\"center\" >排序\r\n");
      out.write("\t\t\t\t\t\t \t\t<input property=\"editor\" class=\"mini-textbox\" style=\"width:100%;\" />\r\n");
      out.write("\t\t\t\t\t\t \t</div>\r\n");
      out.write("\t       \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tmini.parse();\r\n");
      out.write("\t\tvar tree = mini.get(\"tree1\");\r\n");
      out.write("\t\tvar grid = mini.get(\"grid1\");\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
