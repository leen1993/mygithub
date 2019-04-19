<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>cost_benefit_analysis</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>cost_benefit_analysis数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/cost/benefit/analysis/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'equipmentId',">设备ID</th>
                <th data-options="field:'departmentId',">科室ID</th>
                <th data-options="field:'createTime',">创建时间</th>
                <th data-options="field:'createUid',">创建人ID</th>
                <th data-options="field:'year',">收入年份</th>
                <th data-options="field:'month',">收入月份</th>
                <th data-options="field:'benefit',">月收入</th>
                <th data-options="field:'costMaterial',">材料费</th>
                <th data-options="field:'costDepreciation',">折旧费</th>
                <th data-options="field:'costUser',">人工费</th>
                <th data-options="field:'costMaintenance',">维保费</th>
                <th data-options="field:'costUtility',">水电费</th>
                <th data-options="field:'costManagement',">管理费</th>
                <th data-options="field:'costInterest',">利息支出</th>
                <th data-options="field:'maintenanceDays',">停机天数</th>
                <th data-options="field:'positivePatientsNum',">阳性病人数</th>
                <th data-options="field:'treatmentNum',">实际诊疗人数</th>
                <th data-options="field:'costArea',">场地费</th>
                <th data-options="field:'openDays',">实际开机天数</th>
                <th data-options="field:'shouldOpenDays',">应开机工作日</th>
                <th data-options="field:'monthWork',">应诊疗人数</th>
                <th data-options="field:'useRate',">使用率</th>
                <th data-options="field:'usabilityRate',">完好率</th>
                <th data-options="field:'positiveRate',">阳性率</th>
                <th data-options="field:'costOther',">其它支出</th>
                <th data-options="field:'profit',">利润</th>
                <th data-options="field:'profitMargin',">月资产利润率</th>
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
                     <td>设备ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>科室ID</td>
                     <td><input class="easyui-textbox" type="text" name="departmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建人ID</td>
                     <td><input class="easyui-textbox" type="text" name="createUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收入年份</td>
                     <td><input class="easyui-textbox" type="text" name="year" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>收入月份</td>
                     <td><input class="easyui-textbox" type="text" name="month" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>月收入</td>
                     <td><input class="easyui-textbox" type="text" name="benefit" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>材料费</td>
                     <td><input class="easyui-textbox" type="text" name="costMaterial" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>折旧费</td>
                     <td><input class="easyui-textbox" type="text" name="costDepreciation" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>人工费</td>
                     <td><input class="easyui-textbox" type="text" name="costUser" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维保费</td>
                     <td><input class="easyui-textbox" type="text" name="costMaintenance" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>水电费</td>
                     <td><input class="easyui-textbox" type="text" name="costUtility" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>管理费</td>
                     <td><input class="easyui-textbox" type="text" name="costManagement" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>利息支出</td>
                     <td><input class="easyui-textbox" type="text" name="costInterest" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>停机天数</td>
                     <td><input class="easyui-textbox" type="text" name="maintenanceDays" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>阳性病人数</td>
                     <td><input class="easyui-textbox" type="text" name="positivePatientsNum" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>实际诊疗人数</td>
                     <td><input class="easyui-textbox" type="text" name="treatmentNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>场地费</td>
                     <td><input class="easyui-textbox" type="text" name="costArea" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>实际开机天数</td>
                     <td><input class="easyui-textbox" type="text" name="openDays" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>应开机工作日</td>
                     <td><input class="easyui-textbox" type="text" name="shouldOpenDays" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>应诊疗人数</td>
                     <td><input class="easyui-textbox" type="text" name="monthWork" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>使用率</td>
                     <td><input class="easyui-textbox" type="text" name="useRate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>完好率</td>
                     <td><input class="easyui-textbox" type="text" name="usabilityRate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>阳性率</td>
                     <td><input class="easyui-textbox" type="text" name="positiveRate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>其它支出</td>
                     <td><input class="easyui-textbox" type="text" name="costOther" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>利润</td>
                     <td><input class="easyui-textbox" type="text" name="profit" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>月资产利润率</td>
                     <td><input class="easyui-textbox" type="text" name="profitMargin" data-options="required:true"></td>
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
              url: "${ctx }/cost/benefit/analysis/update.do",
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
                url: "${ctx }/cost/benefit/analysis/update.do",
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

