<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_order_return</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_order_return数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/order/return/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'returnId',">returnId</th>
                <th data-options="field:'code',">退款编码</th>
                <th data-options="field:'orderId',">orderId</th>
                <th data-options="field:'reasonId',">退款选项原因</th>
                <th data-options="field:'paytype',">退款支付类型</th>
                <th data-options="field:'returntype',">退款类型</th>
                <th data-options="field:'alipayid',">支付宝账号</th>
                <th data-options="field:'reason',">退款书面原因</th>
                <th data-options="field:'status',">1待审，2已审，3拒绝</th>
                <th data-options="field:'money',">退款数额</th>
                <th data-options="field:'sellermoney',">支付给卖家的钱</th>
                <th data-options="field:'createTime',">申请退款时间</th>
                <th data-options="field:'finishedTime',">退款完成时间</th>
                <th data-options="field:'shippingLogistics',">....</th>
                <th data-options="field:'invoiceNo',">....</th>
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
                     <td><input class="easyui-textbox" type="text" name="returnId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款编码</td>
                     <td><input class="easyui-textbox" type="text" name="code" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="orderId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款选项原因</td>
                     <td><input class="easyui-textbox" type="text" name="reasonId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款支付类型</td>
                     <td><input class="easyui-textbox" type="text" name="paytype" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款类型</td>
                     <td><input class="easyui-textbox" type="text" name="returntype" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>支付宝账号</td>
                     <td><input class="easyui-textbox" type="text" name="alipayid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>退款书面原因</td>
                     <td><input class="easyui-textbox" type="text" name="reason" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>1待审，2已审，3拒绝</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款数额</td>
                     <td><input class="easyui-textbox" type="text" name="money" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>支付给卖家的钱</td>
                     <td><input class="easyui-textbox" type="text" name="sellermoney" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>申请退款时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>退款完成时间</td>
                     <td><input class="easyui-textbox" type="text" name="finishedTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="shippingLogistics" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="invoiceNo" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/order/return/update.do",
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
                url: "${ctx }/jc/shop/order/return/update.do",
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

