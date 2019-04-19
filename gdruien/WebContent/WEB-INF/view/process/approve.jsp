<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>process_approve</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>process_approve数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/process/approve/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'processItemId',">process_itme_id</th>
                <th data-options="field:'name',">审批步骤名</th>
                <th data-options="field:'type',">审批类型：1申购，2采购，3报废</th>
                <th data-options="field:'detailId',">审批表数据ID（来自不同的表，根据type字段判断，可能是申购，采购或报废，等）</th>
                <th data-options="field:'operatorUid',">审批人ID</th>
                <th data-options="field:'createTime',">创建时间</th>
                <th data-options="field:'approveTime',">审批时间</th>
                <th data-options="field:'result',">审批结果：0不通过，1通过</th>
                <th data-options="field:'comment',">审批意见</th>
                <th data-options="field:'lasted',">审批时长（approve_time减create_time）</th>
                <th data-options="field:'status',">审批状态：0待审批，1审批中，2审批完成</th>
                <th data-options="field:'changeOperator',">修改下一步骤经办人：0不允许，1允许，默认0</th>
                <th data-options="field:'reject',">允许回退：1允许，0不允许，默认0</th>
                <th data-options="field:'attachmentIds',">附件ID，英文逗号隔开</th>
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
                     <td>process_itme_id</td>
                     <td><input class="easyui-textbox" type="text" name="processItemId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批步骤名</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批类型：1申购，2采购，3报废</td>
                     <td><input class="easyui-textbox" type="text" name="type" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批表数据ID（来自不同的表，根据type字段判断，可能是申购，采购或报废，等）</td>
                     <td><input class="easyui-textbox" type="text" name="detailId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批人ID</td>
                     <td><input class="easyui-textbox" type="text" name="operatorUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批时间</td>
                     <td><input class="easyui-textbox" type="text" name="approveTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>审批结果：0不通过，1通过</td>
                     <td><input class="easyui-textbox" type="text" name="result" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批意见</td>
                     <td><input class="easyui-textbox" type="text" name="comment" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批时长（approve_time减create_time）</td>
                     <td><input class="easyui-textbox" type="text" name="lasted" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批状态：0待审批，1审批中，2审批完成</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>修改下一步骤经办人：0不允许，1允许，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="changeOperator" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>允许回退：1允许，0不允许，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="reject" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>附件ID，英文逗号隔开</td>
                     <td><input class="easyui-textbox" type="text" name="attachmentIds" data-options="required:false"></td>
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
              url: "${ctx }/process/approve/update.do",
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
                url: "${ctx }/process/approve/update.do",
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

