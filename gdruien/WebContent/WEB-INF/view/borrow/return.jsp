<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>borrow_return</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>borrow_return数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/borrow/return/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">主键ID</th>
                <th data-options="field:'serialNum',">借用单号（自动生成）</th>
                <th data-options="field:'equipmentId',">设备ID</th>
                <th data-options="field:'originDepartmentId',">借出科室ID</th>
                <th data-options="field:'borrowDepartmentId',">借入科室ID</th>
                <th data-options="field:'createUid',">申请人ID</th>
                <th data-options="field:'createTime',">申请时间</th>
                <th data-options="field:'estimateReturnTime',">预计归还时间</th>
                <th data-options="field:'realReturnTime',">实际归还时间</th>
                <th data-options="field:'transferTime',">转科时间</th>
                <th data-options="field:'reason',">借用原因</th>
                <th data-options="field:'status',">状态：0待审批，1审批中，2审批不通过，3审批通过，4已归还，5已撤销 </th>
                <th data-options="field:'currentOperatorUid',">当前审批人ID</th>
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
                     <td>主键ID</td>
                     <td><input class="easyui-textbox" type="text" name="id" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>借用单号（自动生成）</td>
                     <td><input class="easyui-textbox" type="text" name="serialNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>借出科室ID</td>
                     <td><input class="easyui-textbox" type="text" name="originDepartmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>借入科室ID</td>
                     <td><input class="easyui-textbox" type="text" name="borrowDepartmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>申请人ID</td>
                     <td><input class="easyui-textbox" type="text" name="createUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>申请时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>预计归还时间</td>
                     <td><input class="easyui-textbox" type="text" name="estimateReturnTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>实际归还时间</td>
                     <td><input class="easyui-textbox" type="text" name="realReturnTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>转科时间</td>
                     <td><input class="easyui-textbox" type="text" name="transferTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>借用原因</td>
                     <td><input class="easyui-textbox" type="text" name="reason" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>状态：0待审批，1审批中，2审批不通过，3审批通过，4已归还，5已撤销 </td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前审批人ID</td>
                     <td><input class="easyui-textbox" type="text" name="currentOperatorUid" data-options="required:false"></td>
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
              url: "${ctx }/borrow/return/update.do",
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
                url: "${ctx }/borrow/return/update.do",
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

