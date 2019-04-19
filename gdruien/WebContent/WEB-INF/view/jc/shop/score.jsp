<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_score</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_score数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/score/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'memberId',">会员关联</th>
                <th data-options="field:'name',">积分来源/用途</th>
                <th data-options="field:'score',">积分</th>
                <th data-options="field:'scoretime',">积分生成时间</th>
                <th data-options="field:'scoretype',">积分的类型</th>
                <th data-options="field:'usestatus',">0为收入，1为支出</th>
                <th data-options="field:'status',">积分状况（0为冻结，1为可用）</th>
                <th data-options="field:'remark',">备注</th>
                <th data-options="field:'code',">订单号</th>
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
                     <td>会员关联</td>
                     <td><input class="easyui-textbox" type="text" name="memberId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>积分来源/用途</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>积分</td>
                     <td><input class="easyui-textbox" type="text" name="score" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>积分生成时间</td>
                     <td><input class="easyui-textbox" type="text" name="scoretime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>积分的类型</td>
                     <td><input class="easyui-textbox" type="text" name="scoretype" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>0为收入，1为支出</td>
                     <td><input class="easyui-textbox" type="text" name="usestatus" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>积分状况（0为冻结，1为可用）</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>备注</td>
                     <td><input class="easyui-textbox" type="text" name="remark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>订单号</td>
                     <td><input class="easyui-textbox" type="text" name="code" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/score/update.do",
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
                url: "${ctx }/jc/shop/score/update.do",
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

