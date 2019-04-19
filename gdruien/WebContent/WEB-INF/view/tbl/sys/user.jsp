<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_sys_user</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_sys_user数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/sys/user/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'userId',">userId</th>
                <th data-options="field:'userName',">用户名</th>
                <th data-options="field:'userPwd',">base64明文密码</th>
                <th data-options="field:'password',">密文密码</th>
                <th data-options="field:'realname',">真实姓名</th>
                <th data-options="field:'sex',">性别</th>
                <th data-options="field:'birthday',">出生日期</th>
                <th data-options="field:'address',">联系地址</th>
                <th data-options="field:'qq',">QQ</th>
                <th data-options="field:'msn',">MSN</th>
                <th data-options="field:'phone',">电话</th>
                <th data-options="field:'mobile',">手机</th>
                <th data-options="field:'email',">邮箱</th>
                <th data-options="field:'registerTime',">注册时间</th>
                <th data-options="field:'registerIp',">注册IP</th>
                <th data-options="field:'lastLoginTime',">最后登录时间</th>
                <th data-options="field:'lastLoginIp',">最后登录IP</th>
                <th data-options="field:'loginCount',">登录次数</th>
                <th data-options="field:'isAdmin',">是否管理员</th>
                <th data-options="field:'isDisabled',">是否禁用</th>
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
                     <td>用户名</td>
                     <td><input class="easyui-textbox" type="text" name="userName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>base64明文密码</td>
                     <td><input class="easyui-textbox" type="text" name="userPwd" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>密文密码</td>
                     <td><input class="easyui-textbox" type="text" name="password" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>真实姓名</td>
                     <td><input class="easyui-textbox" type="text" name="realname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>性别</td>
                     <td><input class="easyui-textbox" type="text" name="sex" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>出生日期</td>
                     <td><input class="easyui-textbox" type="text" name="birthday" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>联系地址</td>
                     <td><input class="easyui-textbox" type="text" name="address" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>QQ</td>
                     <td><input class="easyui-textbox" type="text" name="qq" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>MSN</td>
                     <td><input class="easyui-textbox" type="text" name="msn" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>电话</td>
                     <td><input class="easyui-textbox" type="text" name="phone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>手机</td>
                     <td><input class="easyui-textbox" type="text" name="mobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮箱</td>
                     <td><input class="easyui-textbox" type="text" name="email" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>注册时间</td>
                     <td><input class="easyui-textbox" type="text" name="registerTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>注册IP</td>
                     <td><input class="easyui-textbox" type="text" name="registerIp" data-options="required:true"></td>
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
                     <td>登录次数</td>
                     <td><input class="easyui-textbox" type="text" name="loginCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否管理员</td>
                     <td><input class="easyui-textbox" type="text" name="isAdmin" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否禁用</td>
                     <td><input class="easyui-textbox" type="text" name="isDisabled" data-options="required:true"></td>
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
              url: "${ctx }/tbl/sys/user/update.do",
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
                url: "${ctx }/tbl/sys/user/update.do",
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

