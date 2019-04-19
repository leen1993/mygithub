<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_core_user</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_core_user数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/core/user/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'userId',">userId</th>
                <th data-options="field:'username',">登录名</th>
                <th data-options="field:'email',">电子邮箱</th>
                <th data-options="field:'password',">密码</th>
                <th data-options="field:'createTime',">创建时间</th>
                <th data-options="field:'loginCount',">总共登录次数</th>
                <th data-options="field:'registerIp',">注册IP</th>
                <th data-options="field:'lastLoginTime',">最后登录时间</th>
                <th data-options="field:'lastLoginIp',">最后登录IP</th>
                <th data-options="field:'currentLoginTime',">当前登录时间</th>
                <th data-options="field:'currentLoginIp',">当前登录IP</th>
                <th data-options="field:'resetKey',">找回密码KEY</th>
                <th data-options="field:'resetPwd',">重置密码</th>
                <th data-options="field:'errtime',">登入错误时间</th>
                <th data-options="field:'errcount',">登入错误次数</th>
                <th data-options="field:'sessionId',">sessionId</th>
                <th data-options="field:'errIp',">errIp</th>
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
                     <td><input class="easyui-textbox" type="text" name="userId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>登录名</td>
                     <td><input class="easyui-textbox" type="text" name="username" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>电子邮箱</td>
                     <td><input class="easyui-textbox" type="text" name="email" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>密码</td>
                     <td><input class="easyui-textbox" type="text" name="password" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>总共登录次数</td>
                     <td><input class="easyui-textbox" type="text" name="loginCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>注册IP</td>
                     <td><input class="easyui-textbox" type="text" name="registerIp" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后登录时间</td>
                     <td><input class="easyui-textbox" type="text" name="lastLoginTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后登录IP</td>
                     <td><input class="easyui-textbox" type="text" name="lastLoginIp" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前登录时间</td>
                     <td><input class="easyui-textbox" type="text" name="currentLoginTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前登录IP</td>
                     <td><input class="easyui-textbox" type="text" name="currentLoginIp" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>找回密码KEY</td>
                     <td><input class="easyui-textbox" type="text" name="resetKey" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>重置密码</td>
                     <td><input class="easyui-textbox" type="text" name="resetPwd" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登入错误时间</td>
                     <td><input class="easyui-textbox" type="text" name="errtime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登入错误次数</td>
                     <td><input class="easyui-textbox" type="text" name="errcount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="sessionId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="errIp" data-options="required:false"></td>
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
              url: "${ctx }/jc/core/user/update.do",
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
                url: "${ctx }/jc/core/user/update.do",
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

