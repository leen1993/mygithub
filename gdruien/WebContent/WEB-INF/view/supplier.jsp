<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>supplier</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>supplier数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/supplier/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'cateId',">分类ID</th>
                <th data-options="field:'name',">供应商名</th>
                <th data-options="field:'shortname',">简称</th>
                <th data-options="field:'serialNum',">供应商编号</th>
                <th data-options="field:'email',">邮箱</th>
                <th data-options="field:'website',">企业官网</th>
                <th data-options="field:'telephone',">座机电话</th>
                <th data-options="field:'faxNum',">传真</th>
                <th data-options="field:'province',">省份</th>
                <th data-options="field:'city',">城市</th>
                <th data-options="field:'orgCode',">组织机构代码</th>
                <th data-options="field:'bankAccount',">银行账号</th>
                <th data-options="field:'bankName',">开户行</th>
                <th data-options="field:'address',">地址</th>
                <th data-options="field:'status',">状态：1正常，0不合作，2删除</th>
                <th data-options="field:'uid',">录入用户ID</th>
                <th data-options="field:'createTime',">创建时间戳</th>
                <th data-options="field:'editTime',">最后编辑时间戳</th>
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
                     <td>分类ID</td>
                     <td><input class="easyui-textbox" type="text" name="cateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商名</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>简称</td>
                     <td><input class="easyui-textbox" type="text" name="shortname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商编号</td>
                     <td><input class="easyui-textbox" type="text" name="serialNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮箱</td>
                     <td><input class="easyui-textbox" type="text" name="email" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>企业官网</td>
                     <td><input class="easyui-textbox" type="text" name="website" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>座机电话</td>
                     <td><input class="easyui-textbox" type="text" name="telephone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>传真</td>
                     <td><input class="easyui-textbox" type="text" name="faxNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>省份</td>
                     <td><input class="easyui-textbox" type="text" name="province" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>城市</td>
                     <td><input class="easyui-textbox" type="text" name="city" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>组织机构代码</td>
                     <td><input class="easyui-textbox" type="text" name="orgCode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>银行账号</td>
                     <td><input class="easyui-textbox" type="text" name="bankAccount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>开户行</td>
                     <td><input class="easyui-textbox" type="text" name="bankName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>地址</td>
                     <td><input class="easyui-textbox" type="text" name="address" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>状态：1正常，0不合作，2删除</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>录入用户ID</td>
                     <td><input class="easyui-textbox" type="text" name="uid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建时间戳</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后编辑时间戳</td>
                     <td><input class="easyui-textbox" type="text" name="editTime" data-options="required:false"></td>
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
              url: "${ctx }/supplier/update.do",
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
                url: "${ctx }/supplier/update.do",
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

