<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_ptype</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_ptype数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/ptype/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'ptypeId',">ptypeId</th>
                <th data-options="field:'websiteId',">站点ID</th>
                <th data-options="field:'name',">类型名称</th>
                <th data-options="field:'path',">访问路径</th>
                <th data-options="field:'alias',">类型别名</th>
                <th data-options="field:'channelPrefix',">栏目页模板前缀</th>
                <th data-options="field:'contentPrefix',">内容页模板前缀</th>
                <th data-options="field:'props',">属性</th>
                <th data-options="field:'detailImgWidth',">详细图宽</th>
                <th data-options="field:'detailImgHeight',">详细图高</th>
                <th data-options="field:'listImgWidth',">列表图宽</th>
                <th data-options="field:'listImgHeight',">列表图高</th>
                <th data-options="field:'minImgWidth',">缩略图宽</th>
                <th data-options="field:'minImgHeight',">缩略图高</th>
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
                     <td><input class="easyui-textbox" type="text" name="ptypeId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>类型名称</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>访问路径</td>
                     <td><input class="easyui-textbox" type="text" name="path" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>类型别名</td>
                     <td><input class="easyui-textbox" type="text" name="alias" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>栏目页模板前缀</td>
                     <td><input class="easyui-textbox" type="text" name="channelPrefix" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>内容页模板前缀</td>
                     <td><input class="easyui-textbox" type="text" name="contentPrefix" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>属性</td>
                     <td><input class="easyui-textbox" type="text" name="props" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>详细图宽</td>
                     <td><input class="easyui-textbox" type="text" name="detailImgWidth" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>详细图高</td>
                     <td><input class="easyui-textbox" type="text" name="detailImgHeight" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>列表图宽</td>
                     <td><input class="easyui-textbox" type="text" name="listImgWidth" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>列表图高</td>
                     <td><input class="easyui-textbox" type="text" name="listImgHeight" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>缩略图宽</td>
                     <td><input class="easyui-textbox" type="text" name="minImgWidth" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>缩略图高</td>
                     <td><input class="easyui-textbox" type="text" name="minImgHeight" data-options="required:true"></td>
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
              url: "${ctx }/jc/shop/ptype/update.do",
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
                url: "${ctx }/jc/shop/ptype/update.do",
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

