<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>process_item</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>process_item数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/process/item/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'processId',">所属流程ID</th>
                <th data-options="field:'name',">步骤名</th>
                <th data-options="field:'autoSelect',">自动选择规则：1选择默认人员，2选择部门主管，3选择上级部门主管，4选择一级部门主管，5自动关联指定角色，6自动关联指定职位</th>
                <th data-options="field:'operatorId',">operatorId</th>
                <th data-options="field:'operatorName',">根据自动选择规则：选择1规则时，该字段为用户姓名，英文逗号隔开；选择5，6规则时，该字段为多个角色或职位名，英文逗号隔开；选择7规则时，该字段为空。</th>
                <th data-options="field:'changeOperator',">修改下一步骤经办人：0不允许，1允许，默认0</th>
                <th data-options="field:'reject',">允许回退：1允许，0不允许</th>
                <th data-options="field:'sort',">排序，越小越靠前，默认0</th>
                <th data-options="field:'unitPrice',">审批起始单价</th>
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
                     <td>所属流程ID</td>
                     <td><input class="easyui-textbox" type="text" name="processId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>步骤名</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>自动选择规则：1选择默认人员，2选择部门主管，3选择上级部门主管，4选择一级部门主管，5自动关联指定角色，6自动关联指定职位</td>
                     <td><input class="easyui-textbox" type="text" name="autoSelect" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="operatorId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>根据自动选择规则：选择1规则时，该字段为用户姓名，英文逗号隔开；选择5，6规则时，该字段为多个角色或职位名，英文逗号隔开；选择7规则时，该字段为空。</td>
                     <td><input class="easyui-textbox" type="text" name="operatorName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>修改下一步骤经办人：0不允许，1允许，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="changeOperator" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>允许回退：1允许，0不允许</td>
                     <td><input class="easyui-textbox" type="text" name="reject" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>排序，越小越靠前，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="sort" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批起始单价</td>
                     <td><input class="easyui-textbox" type="text" name="unitPrice" data-options="required:false"></td>
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
              url: "${ctx }/process/item/update.do",
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
                url: "${ctx }/process/item/update.do",
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

