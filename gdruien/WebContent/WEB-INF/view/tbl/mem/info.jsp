<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_mem_info</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_mem_info数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/mem/info/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'memId',">会员ID</th>
                <th data-options="field:'memRealname',">会员真是姓名</th>
                <th data-options="field:'memGmpwd',">会员提款密码（MD5后的密文）</th>
                <th data-options="field:'memQq',">会员联系QQ</th>
                <th data-options="field:'memEmail',">会员邮箱</th>
                <th data-options="field:'memProvince',">会员所在的省份。对应地区字典主键</th>
                <th data-options="field:'memCity',">会员所在的城市，对应地区字典主键</th>
                <th data-options="field:'memDrawType',">会员提款方式： '1':'财付通','2':'建设银行','3':'工商银行'</th>
                <th data-options="field:'memDrawAccount',">会员提款银行账号. </th>
                <th data-options="field:'memDrawName',">会员提款姓名</th>
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
                     <td>会员ID</td>
                     <td><input class="easyui-textbox" type="text" name="memId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员真是姓名</td>
                     <td><input class="easyui-textbox" type="text" name="memRealname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员提款密码（MD5后的密文）</td>
                     <td><input class="easyui-textbox" type="text" name="memGmpwd" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员联系QQ</td>
                     <td><input class="easyui-textbox" type="text" name="memQq" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员邮箱</td>
                     <td><input class="easyui-textbox" type="text" name="memEmail" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员所在的省份。对应地区字典主键</td>
                     <td><input class="easyui-textbox" type="text" name="memProvince" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员所在的城市，对应地区字典主键</td>
                     <td><input class="easyui-textbox" type="text" name="memCity" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员提款方式： '1':'财付通','2':'建设银行','3':'工商银行'</td>
                     <td><input class="easyui-textbox" type="text" name="memDrawType" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员提款银行账号. </td>
                     <td><input class="easyui-textbox" type="text" name="memDrawAccount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员提款姓名</td>
                     <td><input class="easyui-textbox" type="text" name="memDrawName" data-options="required:false"></td>
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
              url: "${ctx }/tbl/mem/info/update.do",
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
                url: "${ctx }/tbl/mem/info/update.do",
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

