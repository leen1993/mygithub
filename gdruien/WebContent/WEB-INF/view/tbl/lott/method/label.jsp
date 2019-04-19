<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_lott_method_label</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_lott_method_label数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/lott/method/label/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'labelId',">表现形式ID</th>
                <th data-options="field:'labelName',">形式名称</th>
                <th data-options="field:'medId',">对应的玩法ID</th>
                <th data-options="field:'medDesc',">玩法描述, 描述可以为null</th>
                <th data-options="field:'medHelp',">玩法帮助说明</th>
                <th data-options="field:'showStr',">玩法的显示样式, 形如：-，-，X, X, X</th>
                <th data-options="field:'codeSp',">号码分隔符</th>
                <th data-options="field:'medPrize',">奖金模式,{1:"1800"}</th>
                <th data-options="field:'selectArea',">选区显示内容</th>
                <th data-options="field:'desc',">本形式下玩法描述</th>
                <th data-options="field:'labelIsvalid',">本形式是否有效； 0：无效；1有效；</th>
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
                     <td>表现形式ID</td>
                     <td><input class="easyui-textbox" type="text" name="labelId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>形式名称</td>
                     <td><input class="easyui-textbox" type="text" name="labelName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>对应的玩法ID</td>
                     <td><input class="easyui-textbox" type="text" name="medId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>玩法描述, 描述可以为null</td>
                     <td><input class="easyui-textbox" type="text" name="medDesc" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>玩法帮助说明</td>
                     <td><input class="easyui-textbox" type="text" name="medHelp" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>玩法的显示样式, 形如：-，-，X, X, X</td>
                     <td><input class="easyui-textbox" type="text" name="showStr" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>号码分隔符</td>
                     <td><input class="easyui-textbox" type="text" name="codeSp" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>奖金模式,{1:"1800"}</td>
                     <td><input class="easyui-textbox" type="text" name="medPrize" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>选区显示内容</td>
                     <td><input class="easyui-textbox" type="text" name="selectArea" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>本形式下玩法描述</td>
                     <td><input class="easyui-textbox" type="text" name="desc" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>本形式是否有效； 0：无效；1有效；</td>
                     <td><input class="easyui-textbox" type="text" name="labelIsvalid" data-options="required:true"></td>
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
              url: "${ctx }/tbl/lott/method/label/update.do",
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
                url: "${ctx }/tbl/lott/method/label/update.do",
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

