<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_order</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_order数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/order/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'orderId',">orderId</th>
                <th data-options="field:'websiteId',">站点ID</th>
                <th data-options="field:'paymentId',">支付方式</th>
                <th data-options="field:'memberId',">会员ID</th>
                <th data-options="field:'shippingId',">配送方式</th>
                <th data-options="field:'code',">订单号</th>
                <th data-options="field:'status',">订单状态</th>
                <th data-options="field:'paymentStatus',">支付状态</th>
                <th data-options="field:'shippingStatus',">配送状态</th>
                <th data-options="field:'productPrice',">商品总价格</th>
                <th data-options="field:'weight',">商品重量</th>
                <th data-options="field:'freight',">运费</th>
                <th data-options="field:'total',">订单总额</th>
                <th data-options="field:'score',">订单积分</th>
                <th data-options="field:'ip',">IP地址</th>
                <th data-options="field:'createTime',">下单日期</th>
                <th data-options="field:'finishedTime',">结单日期</th>
                <th data-options="field:'lastModified',">最后修改时间</th>
                <th data-options="field:'comments',">订单附言</th>
                <th data-options="field:'shippingTime',">发货日期</th>
                <th data-options="field:'couponPrice',">couponPrice</th>
                <th data-options="field:'productname',">订单商品名字的组合</th>
                <th data-options="field:'tradeno',">支付宝交易号</th>
                <th data-options="field:'returnId',">退款Id</th>
                <th data-options="field:'receiveName',">收货人姓名</th>
                <th data-options="field:'receiveAddress',">收货人地址</th>
                <th data-options="field:'receiveZip',">收货人邮编</th>
                <th data-options="field:'receivePhone',">收货人电话号码</th>
                <th data-options="field:'receiveMobile',">收货人手机号码</th>
                <th data-options="field:'paymentCode',">支付方式</th>
                <th data-options="field:'delStatus',">删除状态 1-删除</th>
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
                     <td><input class="easyui-textbox" type="text" name="orderId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>支付方式</td>
                     <td><input class="easyui-textbox" type="text" name="paymentId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员ID</td>
                     <td><input class="easyui-textbox" type="text" name="memberId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>配送方式</td>
                     <td><input class="easyui-textbox" type="text" name="shippingId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>订单号</td>
                     <td><input class="easyui-textbox" type="text" name="code" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>订单状态</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>支付状态</td>
                     <td><input class="easyui-textbox" type="text" name="paymentStatus" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>配送状态</td>
                     <td><input class="easyui-textbox" type="text" name="shippingStatus" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品总价格</td>
                     <td><input class="easyui-textbox" type="text" name="productPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品重量</td>
                     <td><input class="easyui-textbox" type="text" name="weight" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>运费</td>
                     <td><input class="easyui-textbox" type="text" name="freight" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>订单总额</td>
                     <td><input class="easyui-textbox" type="text" name="total" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>订单积分</td>
                     <td><input class="easyui-textbox" type="text" name="score" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>IP地址</td>
                     <td><input class="easyui-textbox" type="text" name="ip" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>下单日期</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>结单日期</td>
                     <td><input class="easyui-textbox" type="text" name="finishedTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后修改时间</td>
                     <td><input class="easyui-textbox" type="text" name="lastModified" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>订单附言</td>
                     <td><input class="easyui-textbox" type="text" name="comments" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>发货日期</td>
                     <td><input class="easyui-textbox" type="text" name="shippingTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="couponPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>订单商品名字的组合</td>
                     <td><input class="easyui-textbox" type="text" name="productname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>支付宝交易号</td>
                     <td><input class="easyui-textbox" type="text" name="tradeno" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>退款Id</td>
                     <td><input class="easyui-textbox" type="text" name="returnId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收货人姓名</td>
                     <td><input class="easyui-textbox" type="text" name="receiveName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收货人地址</td>
                     <td><input class="easyui-textbox" type="text" name="receiveAddress" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收货人邮编</td>
                     <td><input class="easyui-textbox" type="text" name="receiveZip" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收货人电话号码</td>
                     <td><input class="easyui-textbox" type="text" name="receivePhone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收货人手机号码</td>
                     <td><input class="easyui-textbox" type="text" name="receiveMobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>支付方式</td>
                     <td><input class="easyui-textbox" type="text" name="paymentCode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>删除状态 1-删除</td>
                     <td><input class="easyui-textbox" type="text" name="delStatus" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/order/update.do",
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
                url: "${ctx }/jc/shop/order/update.do",
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

