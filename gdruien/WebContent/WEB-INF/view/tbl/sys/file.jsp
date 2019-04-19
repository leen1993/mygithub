<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_sys_file</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_sys_file数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/sys/file/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'fileId',">文件ID</th>
                <th data-options="field:'fileNname',">fileNname</th>
                <th data-options="field:'fileUrl',">上传文件的路径</th>
                <th data-options="field:'fileOname',">原始文件名称</th>
                <th data-options="field:'fileSuffix',">fileSuffix</th>
                <th data-options="field:'fileSize',">文件大小，默认以KB为单位</th>
                <th data-options="field:'fileIsvalid',">文件是否已经被删除</th>
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
                     <td>文件ID</td>
                     <td><input class="easyui-textbox" type="text" name="fileId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="fileNname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>上传文件的路径</td>
                     <td><input class="easyui-textbox" type="text" name="fileUrl" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>原始文件名称</td>
                     <td><input class="easyui-textbox" type="text" name="fileOname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="fileSuffix" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>文件大小，默认以KB为单位</td>
                     <td><input class="easyui-textbox" type="text" name="fileSize" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>文件是否已经被删除</td>
                     <td><input class="easyui-textbox" type="text" name="fileIsvalid" data-options="required:true"></td>
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
              url: "${ctx }/tbl/sys/file/update.do",
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
                url: "${ctx }/tbl/sys/file/update.do",
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

