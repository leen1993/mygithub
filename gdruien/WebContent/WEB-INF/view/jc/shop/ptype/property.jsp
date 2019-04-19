<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_ptype_property</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_ptype_property数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/ptype/property/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'typePropertyId',">typePropertyId</th>
                <th data-options="field:'ptypeId',">ptypeId</th>
                <th data-options="field:'field',">字段</th>
                <th data-options="field:'propertyName',">属性名</th>
                <th data-options="field:'sort',">排序顺序</th>
                <th data-options="field:'defValue',">默认值</th>
                <th data-options="field:'optValue',">可选项</th>
                <th data-options="field:'areaRows',">文本行数</th>
                <th data-options="field:'areaCols',">文本列数</th>
                <th data-options="field:'isStart',">是否启用</th>
                <th data-options="field:'isNotnull',">是否必填</th>
                <th data-options="field:'dataType',">数据类型</th>
                <th data-options="field:'isSingle',">是否独占一行</th>
                <th data-options="field:'isCategory',">是否类别模型项</th>
                <th data-options="field:'isCustom',">是否自定义</th>
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
                     <td><input class="easyui-textbox" type="text" name="typePropertyId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="ptypeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>字段</td>
                     <td><input class="easyui-textbox" type="text" name="field" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>属性名</td>
                     <td><input class="easyui-textbox" type="text" name="propertyName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>排序顺序</td>
                     <td><input class="easyui-textbox" type="text" name="sort" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>默认值</td>
                     <td><input class="easyui-textbox" type="text" name="defValue" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>可选项</td>
                     <td><input class="easyui-textbox" type="text" name="optValue" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>文本行数</td>
                     <td><input class="easyui-textbox" type="text" name="areaRows" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>文本列数</td>
                     <td><input class="easyui-textbox" type="text" name="areaCols" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否启用</td>
                     <td><input class="easyui-textbox" type="text" name="isStart" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否必填</td>
                     <td><input class="easyui-textbox" type="text" name="isNotnull" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>数据类型</td>
                     <td><input class="easyui-textbox" type="text" name="dataType" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否独占一行</td>
                     <td><input class="easyui-textbox" type="text" name="isSingle" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否类别模型项</td>
                     <td><input class="easyui-textbox" type="text" name="isCategory" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否自定义</td>
                     <td><input class="easyui-textbox" type="text" name="isCustom" data-options="required:true"></td>
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
              url: "${ctx }/jc/shop/ptype/property/update.do",
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
                url: "${ctx }/jc/shop/ptype/property/update.do",
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

