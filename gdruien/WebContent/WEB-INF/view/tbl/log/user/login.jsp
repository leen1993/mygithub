<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_log_user_login</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_log_user_login数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/log/user/login/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'logId',">日志流水号,自动递增</th>
                <th data-options="field:'userId',">用户ID，对应用户表主键</th>
                <th data-options="field:'logTime',">登陆时的时间</th>
                <th data-options="field:'logIp',">登陆的IP地址</th>
                <th data-options="field:'logRefer',">登录时Refer信息</th>
                <th data-options="field:'logResult',">登录结果</th>
                <th data-options="field:'logInfo',">登录明细</th>
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
                     <td>日志流水号,自动递增</td>
                     <td><input class="easyui-textbox" type="text" name="logId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>用户ID，对应用户表主键</td>
                     <td><input class="easyui-textbox" type="text" name="userId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>登陆时的时间</td>
                     <td><input class="easyui-textbox" type="text" name="logTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登陆的IP地址</td>
                     <td><input class="easyui-textbox" type="text" name="logIp" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>登录时Refer信息</td>
                     <td><input class="easyui-textbox" type="text" name="logRefer" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登录结果</td>
                     <td><input class="easyui-textbox" type="text" name="logResult" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登录明细</td>
                     <td><input class="easyui-textbox" type="text" name="logInfo" data-options="required:false"></td>
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
              url: "${ctx }/tbl/log/user/login/update.do",
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
                url: "${ctx }/tbl/log/user/login/update.do",
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

