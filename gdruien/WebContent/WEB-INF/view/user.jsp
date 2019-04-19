<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>user</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>user数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/user/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'username',">用户名,工号</th>
                <th data-options="field:'password',">密码</th>
                <th data-options="field:'name',">姓名</th>
                <th data-options="field:'jobNum',">jobNum</th>
                <th data-options="field:'authGroupId',">角色ID</th>
                <th data-options="field:'departmentId',">部门ID</th>
                <th data-options="field:'positionId',">职位ID</th>
                <th data-options="field:'sort',">排序，越大越靠前</th>
                <th data-options="field:'birthday',">生日</th>
                <th data-options="field:'email',">Email</th>
                <th data-options="field:'mobile',">手机号</th>
                <th data-options="field:'sex',">性别（1男0女）</th>
                <th data-options="field:'status',">状态（1正常，0禁止登陆，2删除</th>
                <th data-options="field:'remark',">备注</th>
                <th data-options="field:'createTime',">添加时间</th>
                <th data-options="field:'uid',">添加者ID</th>
                <th data-options="field:'editTime',">最后编辑时间</th>
                <th data-options="field:'authList',">用户权限ID列表，英文逗号隔开</th>
                <th data-options="field:'engineer',">是否是工程师，1是，0不是，默认0</th>
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
                     <td><input class="easyui-textbox" type="text" name="id" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>用户名,工号</td>
                     <td><input class="easyui-textbox" type="text" name="username" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>密码</td>
                     <td><input class="easyui-textbox" type="text" name="password" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>姓名</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="jobNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>角色ID</td>
                     <td><input class="easyui-textbox" type="text" name="authGroupId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>部门ID</td>
                     <td><input class="easyui-textbox" type="text" name="departmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>职位ID</td>
                     <td><input class="easyui-textbox" type="text" name="positionId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>排序，越大越靠前</td>
                     <td><input class="easyui-textbox" type="text" name="sort" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>生日</td>
                     <td><input class="easyui-textbox" type="text" name="birthday" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>Email</td>
                     <td><input class="easyui-textbox" type="text" name="email" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>手机号</td>
                     <td><input class="easyui-textbox" type="text" name="mobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>性别（1男0女）</td>
                     <td><input class="easyui-textbox" type="text" name="sex" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>状态（1正常，0禁止登陆，2删除</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>备注</td>
                     <td><input class="easyui-textbox" type="text" name="remark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>添加时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>添加者ID</td>
                     <td><input class="easyui-textbox" type="text" name="uid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后编辑时间</td>
                     <td><input class="easyui-textbox" type="text" name="editTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>用户权限ID列表，英文逗号隔开</td>
                     <td><input class="easyui-textbox" type="text" name="authList" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否是工程师，1是，0不是，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="engineer" data-options="required:false"></td>
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
              url: "${ctx }/user/update.do",
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
                url: "${ctx }/user/update.do",
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

