<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_message</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_message数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/message/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'msgId',">msgId</th>
                <th data-options="field:'msgTitle',">标题</th>
                <th data-options="field:'msgContent',">信息内容</th>
                <th data-options="field:'sendTime',">发送时间</th>
                <th data-options="field:'msgSendUser',">发送人</th>
                <th data-options="field:'msgReceiverUser',">接收人</th>
                <th data-options="field:'msgStatus',">信息状态 0，未读 1，已读</th>
                <th data-options="field:'msgBox',">消息信箱 0收件箱 1发件箱 2草稿箱 3垃圾箱</th>
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
                     <td><input class="easyui-textbox" type="text" name="msgId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>标题</td>
                     <td><input class="easyui-textbox" type="text" name="msgTitle" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>信息内容</td>
                     <td><input class="easyui-textbox" type="text" name="msgContent" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>发送时间</td>
                     <td><input class="easyui-textbox" type="text" name="sendTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>发送人</td>
                     <td><input class="easyui-textbox" type="text" name="msgSendUser" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>接收人</td>
                     <td><input class="easyui-textbox" type="text" name="msgReceiverUser" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>信息状态 0，未读 1，已读</td>
                     <td><input class="easyui-textbox" type="text" name="msgStatus" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>消息信箱 0收件箱 1发件箱 2草稿箱 3垃圾箱</td>
                     <td><input class="easyui-textbox" type="text" name="msgBox" data-options="required:true"></td>
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
              url: "${ctx }/jc/message/update.do",
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
                url: "${ctx }/jc/message/update.do",
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

