<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_lott_project</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_lott_project数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/lott/project/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'proId',">方案ID</th>
                <th data-options="field:'lotId',">彩种ID</th>
                <th data-options="field:'memId',">会员ID</th>
                <th data-options="field:'proTime',">生成方案时间</th>
                <th data-options="field:'medId',">玩法ID</th>
                <th data-options="field:'medName',">玩法名称。（冗余字段，用于页面显示）</th>
                <th data-options="field:'bonModel',">奖金模式</th>
                <th data-options="field:'issId',">期号ID</th>
                <th data-options="field:'issName',">期号名称</th>
                <th data-options="field:'lotContent',">投注内容</th>
                <th data-options="field:'lotTimes',">投注倍数</th>
                <th data-options="field:'lotModel',">投注模式。1：元，2：角,3:分</th>
                <th data-options="field:'proMoney',">方案金额</th>
                <th data-options="field:'bonMoney',">中奖金额</th>
                <th data-options="field:'bonContent',">bonContent</th>
                <th data-options="field:'proStatus',">方案状态。1：未开奖，2：已中奖，3：未中奖， 4：已撤单</th>
                <th data-options="field:'proFrom',">方案来源。1：直投，2：追号</th>
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
                     <td>方案ID</td>
                     <td><input class="easyui-textbox" type="text" name="proId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>彩种ID</td>
                     <td><input class="easyui-textbox" type="text" name="lotId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员ID</td>
                     <td><input class="easyui-textbox" type="text" name="memId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>生成方案时间</td>
                     <td><input class="easyui-textbox" type="text" name="proTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>玩法ID</td>
                     <td><input class="easyui-textbox" type="text" name="medId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>玩法名称。（冗余字段，用于页面显示）</td>
                     <td><input class="easyui-textbox" type="text" name="medName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>奖金模式</td>
                     <td><input class="easyui-textbox" type="text" name="bonModel" data-options="required:false"></td>
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
                     <td>投注内容</td>
                     <td><input class="easyui-textbox" type="text" name="lotContent" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>投注倍数</td>
                     <td><input class="easyui-textbox" type="text" name="lotTimes" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>投注模式。1：元，2：角,3:分</td>
                     <td><input class="easyui-textbox" type="text" name="lotModel" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>方案金额</td>
                     <td><input class="easyui-textbox" type="text" name="proMoney" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>中奖金额</td>
                     <td><input class="easyui-textbox" type="text" name="bonMoney" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="bonContent" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>方案状态。1：未开奖，2：已中奖，3：未中奖， 4：已撤单</td>
                     <td><input class="easyui-textbox" type="text" name="proStatus" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>方案来源。1：直投，2：追号</td>
                     <td><input class="easyui-textbox" type="text" name="proFrom" data-options="required:true"></td>
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
              url: "${ctx }/tbl/lott/project/update.do",
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
                url: "${ctx }/tbl/lott/project/update.do",
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

