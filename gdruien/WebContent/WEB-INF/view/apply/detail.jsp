<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>apply_detail</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>apply_detail数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/apply/detail/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'applyId',">申购表ID</th>
                <th data-options="field:'equipmentCodeId',">设备信息编码ID</th>
                <th data-options="field:'title',">申购标题</th>
                <th data-options="field:'name',">设备名</th>
                <th data-options="field:'currentOperatorUid',">当前审批人ID</th>
                <th data-options="field:'unitId',">单位ID</th>
                <th data-options="field:'spec',">规格</th>
                <th data-options="field:'factory',">生产厂家</th>
                <th data-options="field:'price',">预计单价</th>
                <th data-options="field:'amount',">数量</th>
                <th data-options="field:'buyCateId',">购置类别ID</th>
                <th data-options="field:'imported',">是否进口：1进口的，0国产</th>
                <th data-options="field:'status',">状态：0待论证，1待审批，2审批中，3审批不通过，4审批通过，5采购审批中，6采购审批不通过，7招标中，8招标结束，9已签合同，10已验收，11已登记（单个设备），12已入库</th>
                <th data-options="field:'isImport',">是否导入采购：0未导入，1已导入，默认0</th>
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
                     <td>申购表ID</td>
                     <td><input class="easyui-textbox" type="text" name="applyId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备信息编码ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentCodeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>申购标题</td>
                     <td><input class="easyui-textbox" type="text" name="title" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备名</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前审批人ID</td>
                     <td><input class="easyui-textbox" type="text" name="currentOperatorUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>单位ID</td>
                     <td><input class="easyui-textbox" type="text" name="unitId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>规格</td>
                     <td><input class="easyui-textbox" type="text" name="spec" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>生产厂家</td>
                     <td><input class="easyui-textbox" type="text" name="factory" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>预计单价</td>
                     <td><input class="easyui-textbox" type="text" name="price" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>数量</td>
                     <td><input class="easyui-textbox" type="text" name="amount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>购置类别ID</td>
                     <td><input class="easyui-textbox" type="text" name="buyCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否进口：1进口的，0国产</td>
                     <td><input class="easyui-textbox" type="text" name="imported" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>状态：0待论证，1待审批，2审批中，3审批不通过，4审批通过，5采购审批中，6采购审批不通过，7招标中，8招标结束，9已签合同，10已验收，11已登记（单个设备），12已入库</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否导入采购：0未导入，1已导入，默认0</td>
                     <td><input class="easyui-textbox" type="text" name="isImport" data-options="required:true"></td>
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
              url: "${ctx }/apply/detail/update.do",
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
                url: "${ctx }/apply/detail/update.do",
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

