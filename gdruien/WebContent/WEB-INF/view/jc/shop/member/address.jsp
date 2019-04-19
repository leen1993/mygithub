<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_member_address</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_member_address数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/member/address/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'addressId',">addressId</th>
                <th data-options="field:'memberId',">会员</th>
                <th data-options="field:'provinceId',">省份</th>
                <th data-options="field:'cityId',">城市Id</th>
                <th data-options="field:'countryId',">县Id</th>
                <th data-options="field:'username',">姓名</th>
                <th data-options="field:'gender',">性别</th>
                <th data-options="field:'detailaddress',">详细地址</th>
                <th data-options="field:'postcode',">邮编</th>
                <th data-options="field:'tel',">手机</th>
                <th data-options="field:'areacode',">电话区号</th>
                <th data-options="field:'phone',">电话部分</th>
                <th data-options="field:'extnumber',">分机号</th>
                <th data-options="field:'isDefault',">是否是默认地址</th>
                <th data-options="field:'provinceName',">省份名称</th>
                <th data-options="field:'cityName',">城市名称</th>
                <th data-options="field:'countryName',">县级名称</th>
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
                     <td><input class="easyui-textbox" type="text" name="addressId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员</td>
                     <td><input class="easyui-textbox" type="text" name="memberId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>省份</td>
                     <td><input class="easyui-textbox" type="text" name="provinceId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>城市Id</td>
                     <td><input class="easyui-textbox" type="text" name="cityId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>县Id</td>
                     <td><input class="easyui-textbox" type="text" name="countryId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>姓名</td>
                     <td><input class="easyui-textbox" type="text" name="username" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>性别</td>
                     <td><input class="easyui-textbox" type="text" name="gender" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>详细地址</td>
                     <td><input class="easyui-textbox" type="text" name="detailaddress" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>邮编</td>
                     <td><input class="easyui-textbox" type="text" name="postcode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>手机</td>
                     <td><input class="easyui-textbox" type="text" name="tel" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>电话区号</td>
                     <td><input class="easyui-textbox" type="text" name="areacode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>电话部分</td>
                     <td><input class="easyui-textbox" type="text" name="phone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>分机号</td>
                     <td><input class="easyui-textbox" type="text" name="extnumber" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否是默认地址</td>
                     <td><input class="easyui-textbox" type="text" name="isDefault" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>省份名称</td>
                     <td><input class="easyui-textbox" type="text" name="provinceName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>城市名称</td>
                     <td><input class="easyui-textbox" type="text" name="cityName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>县级名称</td>
                     <td><input class="easyui-textbox" type="text" name="countryName" data-options="required:true"></td>
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
              url: "${ctx }/jc/shop/member/address/update.do",
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
                url: "${ctx }/jc/shop/member/address/update.do",
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

