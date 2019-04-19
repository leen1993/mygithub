<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_lott_plan_detail</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_lott_plan_detail数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/lott/plan/detail/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'detId',">明细ID</th>
                <th data-options="field:'proId',">追号订单ID</th>
                <th data-options="field:'issId',">期号ID</th>
                <th data-options="field:'issName',">期号名称</th>
                <th data-options="field:'lotTimes',">投注倍数</th>
                <th data-options="field:'lotMoney',">投注金额</th>
                <th data-options="field:'proStats',">方案状态。 1：未开奖， 2：已中奖，3：未中奖</th>
                <th data-options="field:'planDetail',">追单明细</th>
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
                     <td>明细ID</td>
                     <td><input class="easyui-textbox" type="text" name="detId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>追号订单ID</td>
                     <td><input class="easyui-textbox" type="text" name="proId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>期号ID</td>
                     <td><input class="easyui-textbox" type="text" name="issId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>期号名称</td>
                     <td><input class="easyui-textbox" type="text" name="issName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>投注倍数</td>
                     <td><input class="easyui-textbox" type="text" name="lotTimes" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>投注金额</td>
                     <td><input class="easyui-textbox" type="text" name="lotMoney" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>方案状态。 1：未开奖， 2：已中奖，3：未中奖</td>
                     <td><input class="easyui-textbox" type="text" name="proStats" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>追单明细</td>
                     <td><input class="easyui-textbox" type="text" name="planDetail" data-options="required:false"></td>
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
              url: "${ctx }/tbl/lott/plan/detail/update.do",
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
                url: "${ctx }/tbl/lott/plan/detail/update.do",
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

