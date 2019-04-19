<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>contract</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>contract数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/contract/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'contractNum',">合同编号</th>
                <th data-options="field:'contractName',">合同名</th>
                <th data-options="field:'supplierId',">供应商ID</th>
                <th data-options="field:'partyAPerson',">甲方负责人</th>
                <th data-options="field:'supplierPerson',">乙方联系人</th>
                <th data-options="field:'supplierPhone',">乙方联系电话</th>
                <th data-options="field:'contractTime',">合同签订时间</th>
                <th data-options="field:'expireTime',">合同到期时间</th>
                <th data-options="field:'createTime',">创建时间</th>
                <th data-options="field:'createUid',">创建人ID</th>
                <th data-options="field:'archiveNum',">档案号</th>
                <th data-options="field:'contractAmount',">合同金额</th>
                <th data-options="field:'remindTime',">提醒时间</th>
                <th data-options="field:'contractContent',">合同内容</th>
                <th data-options="field:'remark',">备注</th>
                <th data-options="field:'attachment',">附件ID列表，英文逗号隔开</th>
                <th data-options="field:'purchaseDetailIds',">标的：采购明细ID，英文逗号隔开</th>
                <th data-options="field:'editUid',">最后编辑人ID</th>
                <th data-options="field:'editTime',">最后编辑时间</th>
                <th data-options="field:'status',">状态：1无关联合同，2有关联登记的合同，默认1</th>
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
                     <td>合同编号</td>
                     <td><input class="easyui-textbox" type="text" name="contractNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同名</td>
                     <td><input class="easyui-textbox" type="text" name="contractName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商ID</td>
                     <td><input class="easyui-textbox" type="text" name="supplierId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>甲方负责人</td>
                     <td><input class="easyui-textbox" type="text" name="partyAPerson" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>乙方联系人</td>
                     <td><input class="easyui-textbox" type="text" name="supplierPerson" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>乙方联系电话</td>
                     <td><input class="easyui-textbox" type="text" name="supplierPhone" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>合同签订时间</td>
                     <td><input class="easyui-textbox" type="text" name="contractTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同到期时间</td>
                     <td><input class="easyui-textbox" type="text" name="expireTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建人ID</td>
                     <td><input class="easyui-textbox" type="text" name="createUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>档案号</td>
                     <td><input class="easyui-textbox" type="text" name="archiveNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同金额</td>
                     <td><input class="easyui-textbox" type="text" name="contractAmount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>提醒时间</td>
                     <td><input class="easyui-textbox" type="text" name="remindTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同内容</td>
                     <td><input class="easyui-textbox" type="text" name="contractContent" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>备注</td>
                     <td><input class="easyui-textbox" type="text" name="remark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>附件ID列表，英文逗号隔开</td>
                     <td><input class="easyui-textbox" type="text" name="attachment" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>标的：采购明细ID，英文逗号隔开</td>
                     <td><input class="easyui-textbox" type="text" name="purchaseDetailIds" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后编辑人ID</td>
                     <td><input class="easyui-textbox" type="text" name="editUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后编辑时间</td>
                     <td><input class="easyui-textbox" type="text" name="editTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>状态：1无关联合同，2有关联登记的合同，默认1</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
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
              url: "${ctx }/contract/update.do",
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
                url: "${ctx }/contract/update.do",
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

