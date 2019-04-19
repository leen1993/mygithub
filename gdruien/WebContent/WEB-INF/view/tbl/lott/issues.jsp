<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_lott_issues</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_lott_issues数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/lott/issues/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'issId',">奖期流水号</th>
                <th data-options="field:'issName',">奖期名称. 如：131028120</th>
                <th data-options="field:'issCode',">期号编码. 如：131028120</th>
                <th data-options="field:'lotId',">对应的彩种ID</th>
                <th data-options="field:'issDate',">开奖日期</th>
                <th data-options="field:'saleStart',">销售开始时间</th>
                <th data-options="field:'saleEnd',">销售截止时间</th>
                <th data-options="field:'cancelDeadline',">取消截止时间</th>
                <th data-options="field:'officialTime',">官方开奖时间</th>
                <th data-options="field:'writeTime',">写入时间</th>
                <th data-options="field:'writeUserId',">操作人</th>
                <th data-options="field:'verifyTime',">审核时间</th>
                <th data-options="field:'verifyUserId',">审核人</th>
                <th data-options="field:'issStatus',">当前状态; 0:待销售；1：销售中，2：待开奖；3：开奖中；4：清算中；5：已完成</th>
                <th data-options="field:'lottContent',">开奖内容</th>
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
                     <td>奖期流水号</td>
                     <td><input class="easyui-textbox" type="text" name="issId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>奖期名称. 如：131028120</td>
                     <td><input class="easyui-textbox" type="text" name="issName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>期号编码. 如：131028120</td>
                     <td><input class="easyui-textbox" type="text" name="issCode" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>对应的彩种ID</td>
                     <td><input class="easyui-textbox" type="text" name="lotId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>开奖日期</td>
                     <td><input class="easyui-textbox" type="text" name="issDate" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>销售开始时间</td>
                     <td><input class="easyui-textbox" type="text" name="saleStart" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>销售截止时间</td>
                     <td><input class="easyui-textbox" type="text" name="saleEnd" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>取消截止时间</td>
                     <td><input class="easyui-textbox" type="text" name="cancelDeadline" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>官方开奖时间</td>
                     <td><input class="easyui-textbox" type="text" name="officialTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>写入时间</td>
                     <td><input class="easyui-textbox" type="text" name="writeTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>操作人</td>
                     <td><input class="easyui-textbox" type="text" name="writeUserId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>审核时间</td>
                     <td><input class="easyui-textbox" type="text" name="verifyTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审核人</td>
                     <td><input class="easyui-textbox" type="text" name="verifyUserId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前状态; 0:待销售；1：销售中，2：待开奖；3：开奖中；4：清算中；5：已完成</td>
                     <td><input class="easyui-textbox" type="text" name="issStatus" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>开奖内容</td>
                     <td><input class="easyui-textbox" type="text" name="lottContent" data-options="required:false"></td>
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
              url: "${ctx }/tbl/lott/issues/update.do",
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
                url: "${ctx }/tbl/lott/issues/update.do",
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

