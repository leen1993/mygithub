<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_category</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_category数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/category/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'categoryId',">categoryId</th>
                <th data-options="field:'websiteId',">站点ID</th>
                <th data-options="field:'ptypeId',">类型ID</th>
                <th data-options="field:'parentId',">父类别ID</th>
                <th data-options="field:'name',">名称</th>
                <th data-options="field:'path',">访问路径</th>
                <th data-options="field:'lft',">树左边</th>
                <th data-options="field:'rgt',">树右边</th>
                <th data-options="field:'priority',">排列顺序</th>
                <th data-options="field:'keywords',">页面关键字</th>
                <th data-options="field:'description',">页面描述</th>
                <th data-options="field:'tplChannel',">栏目页模板</th>
                <th data-options="field:'tplContent',">内容页模板</th>
                <th data-options="field:'imagePath',">图片路径</th>
                <th data-options="field:'title',">页面标题</th>
                <th data-options="field:'isColorsize',">是否需要尺寸和样式</th>
            </tr>
        </thead>
    </table>
    <div id="tb" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="add()" plain="true">增加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="del()" plain="true">删除</a>
        </div>
    </div>
    
    <!-- 弹窗对内容进行编辑  -->
    <div id="w" class="easyui-window" title="更新" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:500px;height:350px;padding:10px;">
          <form id="ff" method="post">
            <input class="easyui-hidden" type="hidden" name="state_value"/> 
            <table cellpadding="5">
                
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="categoryId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>类型ID</td>
                     <td><input class="easyui-textbox" type="text" name="ptypeId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>父类别ID</td>
                     <td><input class="easyui-textbox" type="text" name="parentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>名称</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>访问路径</td>
                     <td><input class="easyui-textbox" type="text" name="path" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>树左边</td>
                     <td><input class="easyui-textbox" type="text" name="lft" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>树右边</td>
                     <td><input class="easyui-textbox" type="text" name="rgt" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>排列顺序</td>
                     <td><input class="easyui-textbox" type="text" name="priority" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>页面关键字</td>
                     <td><input class="easyui-textbox" type="text" name="keywords" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>页面描述</td>
                     <td><input class="easyui-textbox" type="text" name="description" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>栏目页模板</td>
                     <td><input class="easyui-textbox" type="text" name="tplChannel" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>内容页模板</td>
                     <td><input class="easyui-textbox" type="text" name="tplContent" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>图片路径</td>
                     <td><input class="easyui-textbox" type="text" name="imagePath" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>页面标题</td>
                     <td><input class="easyui-textbox" type="text" name="title" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否需要尺寸和样式</td>
                     <td><input class="easyui-textbox" type="text" name="isColorsize" data-options="required:false"></td>
                </tr>
                <tr>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
                    </td>
                </tr>
            </table>
        </form>
    </div>
 <script>
      $(function () {
         $("#dg_id").datagrid({
              //双击事件进行修改
              onDblClickRow: function (index, row) {
                  row.state_value = "update";
                  $('#ff').form('load', row);
                  $('#w').window('open');
              }
         });
      })
   
      // 提交表单
     function submitForm() { 
          var pass = $("#ff").form('enableValidation').form('validate');
          if(!pass) {
              alert("表单数据不符合规范！");
              return;
          }
          $.ajax({
              type: "POST",
              url: "${ctx }/jc/shop/category/update.do",
              data: $('#ff').serialize(),
              success: function (result) {
                  if(result > 0) {
                      $('#w').window('close');
                      $('#dg_id').datagrid('load', {});
                  }  else {
                      alert(result);
                  }
              },
              error : function(result) {
                  alert(result);
              }
          });
      }
      
      // 删除
      function del() {
        var row = $('#dg_id').datagrid('getSelected');
        row.state_value = "delete";
        if (row){
            $.ajax({
                type: "POST",
                url: "${ctx }/jc/shop/category/update.do",
                data: row,
                success: function (result) {
                    if(result > 0) {
                        $('#w').window('close');
                        $('#dg_id').datagrid('load', {});
                    } else {
                        alert(result);
                    }
                },
                error : function(result) {
                    alert(result);
                }
            });
        }
      }
      
      // 添加按钮
      function add() {
          $('#ff').form('clear');
          $('#ff').form('load', {
              state_value:"add",
              id:"0"
          });
          
          $('#w').window('open');
      }
      
      function clearForm(){
            $('#ff').form('clear');
      }
   </script>
    
</body>
</html>

