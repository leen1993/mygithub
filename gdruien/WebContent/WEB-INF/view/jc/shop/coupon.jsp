<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_coupon</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_coupon数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/coupon/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'websiteId',">站点Id</th>
                <th data-options="field:'couponName',">优惠劵名称</th>
                <th data-options="field:'couponBegintime',">开始时间</th>
                <th data-options="field:'couponEndtime',">结束时间</th>
                <th data-options="field:'couponPic',">图片地址</th>
                <th data-options="field:'isUsing',">是否启用</th>
                <th data-options="field:'couponPrice',">优惠倦值</th>
                <th data-options="field:'couponLeastprice',">至少消费</th>
                <th data-options="field:'couponCount',">数量</th>
                <th data-options="field:'categoryId',">..ID</th>
                <th data-options="field:'comments',">.......</th>
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
                     <td>站点Id</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>优惠劵名称</td>
                     <td><input class="easyui-textbox" type="text" name="couponName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>开始时间</td>
                     <td><input class="easyui-textbox" type="text" name="couponBegintime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>结束时间</td>
                     <td><input class="easyui-textbox" type="text" name="couponEndtime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>图片地址</td>
                     <td><input class="easyui-textbox" type="text" name="couponPic" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否启用</td>
                     <td><input class="easyui-textbox" type="text" name="isUsing" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>优惠倦值</td>
                     <td><input class="easyui-textbox" type="text" name="couponPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>至少消费</td>
                     <td><input class="easyui-textbox" type="text" name="couponLeastprice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>数量</td>
                     <td><input class="easyui-textbox" type="text" name="couponCount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..ID</td>
                     <td><input class="easyui-textbox" type="text" name="categoryId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.......</td>
                     <td><input class="easyui-textbox" type="text" name="comments" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/coupon/update.do",
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
                url: "${ctx }/jc/shop/coupon/update.do",
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

