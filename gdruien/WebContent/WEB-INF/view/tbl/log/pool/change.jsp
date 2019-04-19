<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_log_pool_change</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_log_pool_change数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/log/pool/change/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'logId',">变动流水ID</th>
                <th data-options="field:'cgType',">变动类型。1.购彩，2.派奖，3，返点，4.撤单，5.重置，6提款</th>
                <th data-options="field:'cgMoney',">变动金额</th>
                <th data-options="field:'plLeft',">奖池剩余金额</th>
                <th data-options="field:'cgTime',">变动时间</th>
                <th data-options="field:'cgId',">变动具体单号</th>
                <th data-options="field:'cgInfo',">变动备注</th>
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
                     <td>变动流水ID</td>
                     <td><input class="easyui-textbox" type="text" name="logId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>变动类型。1.购彩，2.派奖，3，返点，4.撤单，5.重置，6提款</td>
                     <td><input class="easyui-textbox" type="text" name="cgType" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>变动金额</td>
                     <td><input class="easyui-textbox" type="text" name="cgMoney" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>奖池剩余金额</td>
                     <td><input class="easyui-textbox" type="text" name="plLeft" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>变动时间</td>
                     <td><input class="easyui-textbox" type="text" name="cgTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>变动具体单号</td>
                     <td><input class="easyui-textbox" type="text" name="cgId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>变动备注</td>
                     <td><input class="easyui-textbox" type="text" name="cgInfo" data-options="required:false"></td>
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
              url: "${ctx }/tbl/log/pool/change/update.do",
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
                url: "${ctx }/tbl/log/pool/change/update.do",
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

