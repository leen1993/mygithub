<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_mem_acchange_detail</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_mem_acchange_detail数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/mem/acchange/detail/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'detId',">账变明细ID</th>
                <th data-options="field:'accId',">账户ID</th>
                <th data-options="field:'memId',">会员ID</th>
                <th data-options="field:'lotId',">彩种ID</th>
                <th data-options="field:'lotName',">游种名称(冗余字段，用于直接显示)</th>
                <th data-options="field:'detType',">账变类型。1.购彩，2.派奖，3.返点，4.撤单，5.充值，6.提款</th>
                <th data-options="field:'issId',">对应期号ID</th>
                <th data-options="field:'issName',">奖期名称(冗余字段，用于直接显示)</th>
                <th data-options="field:'detMoney',">变动金额</th>
                <th data-options="field:'accMoney',">变帐后账户余额</th>
                <th data-options="field:'detTime',">账变时间</th>
                <th data-options="field:'detRefer',">账变明细编号</th>
                <th data-options="field:'detInfo',">账变详细记录</th>
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
                     <td>账变明细ID</td>
                     <td><input class="easyui-textbox" type="text" name="detId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>账户ID</td>
                     <td><input class="easyui-textbox" type="text" name="accId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员ID</td>
                     <td><input class="easyui-textbox" type="text" name="memId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>彩种ID</td>
                     <td><input class="easyui-textbox" type="text" name="lotId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>游种名称(冗余字段，用于直接显示)</td>
                     <td><input class="easyui-textbox" type="text" name="lotName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>账变类型。1.购彩，2.派奖，3.返点，4.撤单，5.充值，6.提款</td>
                     <td><input class="easyui-textbox" type="text" name="detType" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>对应期号ID</td>
                     <td><input class="easyui-textbox" type="text" name="issId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>奖期名称(冗余字段，用于直接显示)</td>
                     <td><input class="easyui-textbox" type="text" name="issName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>变动金额</td>
                     <td><input class="easyui-textbox" type="text" name="detMoney" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>变帐后账户余额</td>
                     <td><input class="easyui-textbox" type="text" name="accMoney" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>账变时间</td>
                     <td><input class="easyui-textbox" type="text" name="detTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>账变明细编号</td>
                     <td><input class="easyui-textbox" type="text" name="detRefer" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>账变详细记录</td>
                     <td><input class="easyui-textbox" type="text" name="detInfo" data-options="required:false"></td>
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
              url: "${ctx }/tbl/mem/acchange/detail/update.do",
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
                url: "${ctx }/tbl/mem/acchange/detail/update.do",
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

