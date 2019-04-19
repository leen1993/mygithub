<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>tbl_lott_lottery</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>tbl_lott_lottery数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/tbl/lott/lottery/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'lotId',">彩种ID</th>
                <th data-options="field:'lotName',">彩种名称</th>
                <th data-options="field:'lotCode',">彩种编码</th>
                <th data-options="field:'issueSet',">期号设置</th>
                <th data-options="field:'weekCycle',">周 开奖周期</th>
                <th data-options="field:'yearStart',">每年的开始时间</th>
                <th data-options="field:'yearEnd',">每年的截止时间</th>
                <th data-options="field:'minCommission',">最小手续费</th>
                <th data-options="field:'minProfit',">最小利润</th>
                <th data-options="field:'sellPrice',">单注的销售价格</th>
                <th data-options="field:'issueRule',">奖期规则</th>
                <th data-options="field:'lotDesc',">描述</th>
                <th data-options="field:'lotSort',">显示顺序</th>
                <th data-options="field:'numRule',">号码规则</th>
                <th data-options="field:'lotType',">彩种种类ID，对应字典表主键</th>
                <th data-options="field:'lotCreate',">创建时间</th>
                <th data-options="field:'lotUrl',">彩种访问的URL</th>
                <th data-options="field:'valid',">是否有效. 1：有效，0：无效</th>
                <th data-options="field:'serialSign',">生成流水的标志</th>
                <th data-options="field:'dealClassname',">处理业务的对象</th>
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
                     <td>彩种ID</td>
                     <td><input class="easyui-textbox" type="text" name="lotId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>彩种名称</td>
                     <td><input class="easyui-textbox" type="text" name="lotName" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>彩种编码</td>
                     <td><input class="easyui-textbox" type="text" name="lotCode" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>期号设置</td>
                     <td><input class="easyui-textbox" type="text" name="issueSet" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>周 开奖周期</td>
                     <td><input class="easyui-textbox" type="text" name="weekCycle" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>每年的开始时间</td>
                     <td><input class="easyui-textbox" type="text" name="yearStart" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>每年的截止时间</td>
                     <td><input class="easyui-textbox" type="text" name="yearEnd" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最小手续费</td>
                     <td><input class="easyui-textbox" type="text" name="minCommission" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最小利润</td>
                     <td><input class="easyui-textbox" type="text" name="minProfit" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>单注的销售价格</td>
                     <td><input class="easyui-textbox" type="text" name="sellPrice" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>奖期规则</td>
                     <td><input class="easyui-textbox" type="text" name="issueRule" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>描述</td>
                     <td><input class="easyui-textbox" type="text" name="lotDesc" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>显示顺序</td>
                     <td><input class="easyui-textbox" type="text" name="lotSort" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>号码规则</td>
                     <td><input class="easyui-textbox" type="text" name="numRule" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>彩种种类ID，对应字典表主键</td>
                     <td><input class="easyui-textbox" type="text" name="lotType" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="lotCreate" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>彩种访问的URL</td>
                     <td><input class="easyui-textbox" type="text" name="lotUrl" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否有效. 1：有效，0：无效</td>
                     <td><input class="easyui-textbox" type="text" name="valid" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>生成流水的标志</td>
                     <td><input class="easyui-textbox" type="text" name="serialSign" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>处理业务的对象</td>
                     <td><input class="easyui-textbox" type="text" name="dealClassname" data-options="required:false"></td>
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
              url: "${ctx }/tbl/lott/lottery/update.do",
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
                url: "${ctx }/tbl/lott/lottery/update.do",
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

