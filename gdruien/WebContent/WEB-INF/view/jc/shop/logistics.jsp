<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_logistics</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_logistics数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/logistics/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'logisticsId',">logisticsId</th>
                <th data-options="field:'name',">名称</th>
                <th data-options="field:'webUrl',">网址</th>
                <th data-options="field:'logoPath',">LOGO</th>
                <th data-options="field:'priority',">排序</th>
                <th data-options="field:'fnt',">..........</th>
                <th data-options="field:'fnz',">..........</th>
                <th data-options="field:'fat',">..........</th>
                <th data-options="field:'faz',">..........</th>
                <th data-options="field:'fpt',">............</th>
                <th data-options="field:'snt',">..........</th>
                <th data-options="field:'snz',">..........</th>
                <th data-options="field:'sat',">..........</th>
                <th data-options="field:'saz',">..........</th>
                <th data-options="field:'spt',">..........</th>
                <th data-options="field:'spz',">..........</th>
                <th data-options="field:'isCourier',">........</th>
                <th data-options="field:'imgUrl',">..........</th>
                <th data-options="field:'fnw',">........</th>
                <th data-options="field:'fnh',">........</th>
                <th data-options="field:'faw',">........</th>
                <th data-options="field:'fah',">........</th>
                <th data-options="field:'fpw',">........</th>
                <th data-options="field:'fph',">........</th>
                <th data-options="field:'snw',">........</th>
                <th data-options="field:'snh',">........</th>
                <th data-options="field:'saw',">........</th>
                <th data-options="field:'sah',">........</th>
                <th data-options="field:'spw',">........</th>
                <th data-options="field:'sph',">........</th>
                <th data-options="field:'fnwh',">.........</th>
                <th data-options="field:'fawh',">.........</th>
                <th data-options="field:'fpwh',">.........</th>
                <th data-options="field:'snwh',">.........</th>
                <th data-options="field:'sawh',">.........</th>
                <th data-options="field:'spwh',">.........</th>
                <th data-options="field:'evenSpacing',">....</th>
                <th data-options="field:'fpz',">............</th>
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
                     <td><input class="easyui-textbox" type="text" name="logisticsId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>名称</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>网址</td>
                     <td><input class="easyui-textbox" type="text" name="webUrl" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>LOGO</td>
                     <td><input class="easyui-textbox" type="text" name="logoPath" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>排序</td>
                     <td><input class="easyui-textbox" type="text" name="priority" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="fnt" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="fnz" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="fat" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="faz" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>............</td>
                     <td><input class="easyui-textbox" type="text" name="fpt" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="snt" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="snz" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="sat" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="saz" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="spt" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="spz" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="isCourier" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..........</td>
                     <td><input class="easyui-textbox" type="text" name="imgUrl" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fnw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fnh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="faw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fah" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fpw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="fph" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="snw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="snh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="saw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="sah" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="spw" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>........</td>
                     <td><input class="easyui-textbox" type="text" name="sph" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="fnwh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="fawh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="fpwh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="snwh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="sawh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.........</td>
                     <td><input class="easyui-textbox" type="text" name="spwh" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="evenSpacing" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>............</td>
                     <td><input class="easyui-textbox" type="text" name="fpz" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/logistics/update.do",
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
                url: "${ctx }/jc/shop/logistics/update.do",
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

