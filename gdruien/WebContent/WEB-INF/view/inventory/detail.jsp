<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>inventory_detail</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>inventory_detail数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/inventory/detail/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'inventoryId',">盘点建账表ID</th>
                <th data-options="field:'equipmentId',">设备ID</th>
                <th data-options="field:'status',">0未盘点，1已盘点</th>
                <th data-options="field:'equipmentStatus',">设备状态：1正常，0异常</th>
                <th data-options="field:'equipmentPlace',">设备存放地点：1正常，0异常</th>
                <th data-options="field:'equipmentDepartment',">所属科室：1正常，0异常</th>
                <th data-options="field:'remark',">备注</th>
                <th data-options="field:'netWorth',">设备当前净值</th>
                <th data-options="field:'operatorUid',">盘点人ID</th>
                <th data-options="field:'operatorTime',">盘点时间</th>
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
                     <td>盘点建账表ID</td>
                     <td><input class="easyui-textbox" type="text" name="inventoryId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>0未盘点，1已盘点</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>设备状态：1正常，0异常</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentStatus" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备存放地点：1正常，0异常</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentPlace" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>所属科室：1正常，0异常</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentDepartment" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>备注</td>
                     <td><input class="easyui-textbox" type="text" name="remark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备当前净值</td>
                     <td><input class="easyui-textbox" type="text" name="netWorth" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>盘点人ID</td>
                     <td><input class="easyui-textbox" type="text" name="operatorUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>盘点时间</td>
                     <td><input class="easyui-textbox" type="text" name="operatorTime" data-options="required:false"></td>
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
              url: "${ctx }/inventory/detail/update.do",
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
                url: "${ctx }/inventory/detail/update.do",
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

