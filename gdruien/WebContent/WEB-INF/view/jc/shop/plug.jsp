<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_plug</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_plug数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/plug/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'plugId',">plugId</th>
                <th data-options="field:'name',">....</th>
                <th data-options="field:'path',">....</th>
                <th data-options="field:'description',">..</th>
                <th data-options="field:'author',">..</th>
                <th data-options="field:'uploadTime',">....</th>
                <th data-options="field:'installTime',">....</th>
                <th data-options="field:'uninstallTime',">....</th>
                <th data-options="field:'fileConflict',">........</th>
                <th data-options="field:'isUsed',">....(0...,1...)</th>
                <th data-options="field:'plugPerms',">.....,.........</th>
                <th data-options="field:'plugRepair',">.......(0 ..... 1...)</th>
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
                     <td><input class="easyui-textbox" type="text" name="plugId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="path" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>..</td>
                     <td><input class="easyui-textbox" type="text" name="description" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..</td>
                     <td><input class="easyui-textbox" type="text" name="author" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="uploadTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="installTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="uninstallTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fileConflict" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>....(0...,1...)</td>
                     <td><input class="easyui-textbox" type="text" name="isUsed" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>.....,.........</td>
                     <td><input class="easyui-textbox" type="text" name="plugPerms" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.......(0 ..... 1...)</td>
                     <td><input class="easyui-textbox" type="text" name="plugRepair" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/plug/update.do",
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
                url: "${ctx }/jc/shop/plug/update.do",
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
