<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_product_fashion</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_product_fashion数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/product/fashion/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'fashionId',">fashionId</th>
                <th data-options="field:'productId',">productId</th>
                <th data-options="field:'stockCount',">库存</th>
                <th data-options="field:'onSale',">onSale</th>
                <th data-options="field:'createTime',">createTime</th>
                <th data-options="field:'marketPrice',">市场价</th>
                <th data-options="field:'salePrice',">销售价</th>
                <th data-options="field:'costPrice',">成本价</th>
                <th data-options="field:'fashionStyle',">fashionStyle</th>
                <th data-options="field:'saleCount',">销量</th>
                <th data-options="field:'productCode',">商品编号</th>
                <th data-options="field:'lackremind',">是否提醒库存预警（作废）</th>
                <th data-options="field:'fashionPic',">fashionPic</th>
                <th data-options="field:'fashionColor',">商品款式颜色</th>
                <th data-options="field:'fashionSize',">商品款式尺码</th>
                <th data-options="field:'isDefault',">是否问默认显示款式</th>
                <th data-options="field:'nature',">nature</th>
                <th data-options="field:'attitude',">attitude</th>
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
                     <td><input class="easyui-textbox" type="text" name="fashionId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="productId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>库存</td>
                     <td><input class="easyui-textbox" type="text" name="stockCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="onSale" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>市场价</td>
                     <td><input class="easyui-textbox" type="text" name="marketPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>销售价</td>
                     <td><input class="easyui-textbox" type="text" name="salePrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>成本价</td>
                     <td><input class="easyui-textbox" type="text" name="costPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="fashionStyle" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>销量</td>
                     <td><input class="easyui-textbox" type="text" name="saleCount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品编号</td>
                     <td><input class="easyui-textbox" type="text" name="productCode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否提醒库存预警（作废）</td>
                     <td><input class="easyui-textbox" type="text" name="lackremind" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="fashionPic" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品款式颜色</td>
                     <td><input class="easyui-textbox" type="text" name="fashionColor" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品款式尺码</td>
                     <td><input class="easyui-textbox" type="text" name="fashionSize" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否问默认显示款式</td>
                     <td><input class="easyui-textbox" type="text" name="isDefault" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="nature" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="attitude" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/product/fashion/update.do",
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
                url: "${ctx }/jc/shop/product/fashion/update.do",
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

