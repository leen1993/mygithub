<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_order_item</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_order_item数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/order/item/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'orderitemId',">orderitemId</th>
                <th data-options="field:'orderId',">orderId</th>
                <th data-options="field:'websiteId',">websiteId</th>
                <th data-options="field:'productId',">productId</th>
                <th data-options="field:'productfashId',">商品款式外键（wangzewu）</th>
                <th data-options="field:'count',">数量</th>
                <th data-options="field:'salePrice',">销售价</th>
                <th data-options="field:'memberPrice',">会员价</th>
                <th data-options="field:'costPrice',">成本价</th>
                <th data-options="field:'finalPrice',">成交价</th>
                <th data-options="field:'seckillprice',">秒杀价</th>
                <th data-options="field:'status',">..</th>
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
                     <td><input class="easyui-textbox" type="text" name="orderitemId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="orderId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="productId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品款式外键（wangzewu）</td>
                     <td><input class="easyui-textbox" type="text" name="productfashId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>数量</td>
                     <td><input class="easyui-textbox" type="text" name="count" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>销售价</td>
                     <td><input class="easyui-textbox" type="text" name="salePrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员价</td>
                     <td><input class="easyui-textbox" type="text" name="memberPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>成本价</td>
                     <td><input class="easyui-textbox" type="text" name="costPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>成交价</td>
                     <td><input class="easyui-textbox" type="text" name="finalPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>秒杀价</td>
                     <td><input class="easyui-textbox" type="text" name="seckillprice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..</td>
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
              url: "${ctx }/jc/shop/order/item/update.do",
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
                url: "${ctx }/jc/shop/order/item/update.do",
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

