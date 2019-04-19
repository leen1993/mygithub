<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>repair</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>repair数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/repair/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'repairNum',">报修单号</th>
                <th data-options="field:'equipmentId',">设备ID</th>
                <th data-options="field:'departmentId',">科室ID</th>
                <th data-options="field:'createUid',">报修人ID</th>
                <th data-options="field:'phone',">报修人电话（用户信息获取，可修改）</th>
                <th data-options="field:'createTime',">创建时间（报修时间）</th>
                <th data-options="field:'openTime',">受理时间（设备科打开报修单时间）</th>
                <th data-options="field:'openUid',">openUid</th>
                <th data-options="field:'subTime',">派工时间（设备科派工）</th>
                <th data-options="field:'acceptTime',">接单时间（工程师接单）</th>
                <th data-options="field:'respondTime',">响应时间（工程师填写响应单）</th>
                <th data-options="field:'approvalTime',">审批完成时间（通过或不通过）</th>
                <th data-options="field:'repairReplyTime',">维修处理时间（提交表单）</th>
                <th data-options="field:'urgencyLevel',">紧急程度(1一般，2加急，3特急）</th>
                <th data-options="field:'faultDescription',">故障描述</th>
                <th data-options="field:'status',">0报修中，1已受理，2已派工，3已接单，4已响应，5审批中，6维修审批不通过，7维修处理中，8待验收，9已验收，10撤销，11忽略</th>
                <th data-options="field:'engineerId',">工程师ID</th>
                <th data-options="field:'engineerMobile',">工程师电话</th>
                <th data-options="field:'assistEngineerId',">协助工程师ID</th>
                <th data-options="field:'assistEngineerMobile',">协助工程师电话</th>
                <th data-options="field:'faultCateId',">故障类型ID</th>
                <th data-options="field:'repairCateId',">维修性质（repair_cate表）</th>
                <th data-options="field:'currentOperatorUid',">维修审批当前审批人</th>
                <th data-options="field:'estimatedFee',">预计费用</th>
                <th data-options="field:'estimatedRepairDate',">预计修复日期</th>
                <th data-options="field:'suggestion',">维修意见</th>
                <th data-options="field:'remark',">维修备注</th>
                <th data-options="field:'actualFee',">实际费用</th>
                <th data-options="field:'partsFee',">配件费用</th>
                <th data-options="field:'manHour',">维修工时</th>
                <th data-options="field:'repairDate',">修复日期</th>
                <th data-options="field:'repairResultId',">维修结果（1修复，2未修复，3建议报废，4其它）</th>
                <th data-options="field:'faultAnalysis',">故障分析及解决方案</th>
                <th data-options="field:'envSuggestion',">环境改善建议</th>
                <th data-options="field:'repairSubTime',">维修处理提交时间</th>
                <th data-options="field:'gradeTech',">技术评价</th>
                <th data-options="field:'gradeAttitude',">态度评价</th>
                <th data-options="field:'gradeSpeed',">响应速度评分</th>
                <th data-options="field:'checkUid',">验收人ID</th>
                <th data-options="field:'checkTime',">验收时间（默认当前时间，可修改）</th>
                <th data-options="field:'checkSuggestion',">验收人建议</th>
                <th data-options="field:'stopHour',">停机时间</th>
                <th data-options="field:'checkRemark',">验收备注</th>
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
                     <td>报修单号</td>
                     <td><input class="easyui-textbox" type="text" name="repairNum" data-options="required:false"></td>
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
                     <td>报修人ID</td>
                     <td><input class="easyui-textbox" type="text" name="createUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>报修人电话（用户信息获取，可修改）</td>
                     <td><input class="easyui-textbox" type="text" name="phone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>创建时间（报修时间）</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>受理时间（设备科打开报修单时间）</td>
                     <td><input class="easyui-textbox" type="text" name="openTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="openUid" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>派工时间（设备科派工）</td>
                     <td><input class="easyui-textbox" type="text" name="subTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>接单时间（工程师接单）</td>
                     <td><input class="easyui-textbox" type="text" name="acceptTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>响应时间（工程师填写响应单）</td>
                     <td><input class="easyui-textbox" type="text" name="respondTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>审批完成时间（通过或不通过）</td>
                     <td><input class="easyui-textbox" type="text" name="approvalTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修处理时间（提交表单）</td>
                     <td><input class="easyui-textbox" type="text" name="repairReplyTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>紧急程度(1一般，2加急，3特急）</td>
                     <td><input class="easyui-textbox" type="text" name="urgencyLevel" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>故障描述</td>
                     <td><input class="easyui-textbox" type="text" name="faultDescription" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>0报修中，1已受理，2已派工，3已接单，4已响应，5审批中，6维修审批不通过，7维修处理中，8待验收，9已验收，10撤销，11忽略</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>工程师ID</td>
                     <td><input class="easyui-textbox" type="text" name="engineerId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>工程师电话</td>
                     <td><input class="easyui-textbox" type="text" name="engineerMobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>协助工程师ID</td>
                     <td><input class="easyui-textbox" type="text" name="assistEngineerId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>协助工程师电话</td>
                     <td><input class="easyui-textbox" type="text" name="assistEngineerMobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>故障类型ID</td>
                     <td><input class="easyui-textbox" type="text" name="faultCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修性质（repair_cate表）</td>
                     <td><input class="easyui-textbox" type="text" name="repairCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修审批当前审批人</td>
                     <td><input class="easyui-textbox" type="text" name="currentOperatorUid" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>预计费用</td>
                     <td><input class="easyui-textbox" type="text" name="estimatedFee" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>预计修复日期</td>
                     <td><input class="easyui-textbox" type="text" name="estimatedRepairDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修意见</td>
                     <td><input class="easyui-textbox" type="text" name="suggestion" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修备注</td>
                     <td><input class="easyui-textbox" type="text" name="remark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>实际费用</td>
                     <td><input class="easyui-textbox" type="text" name="actualFee" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>配件费用</td>
                     <td><input class="easyui-textbox" type="text" name="partsFee" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修工时</td>
                     <td><input class="easyui-textbox" type="text" name="manHour" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>修复日期</td>
                     <td><input class="easyui-textbox" type="text" name="repairDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修结果（1修复，2未修复，3建议报废，4其它）</td>
                     <td><input class="easyui-textbox" type="text" name="repairResultId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>故障分析及解决方案</td>
                     <td><input class="easyui-textbox" type="text" name="faultAnalysis" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>环境改善建议</td>
                     <td><input class="easyui-textbox" type="text" name="envSuggestion" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修处理提交时间</td>
                     <td><input class="easyui-textbox" type="text" name="repairSubTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>技术评价</td>
                     <td><input class="easyui-textbox" type="text" name="gradeTech" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>态度评价</td>
                     <td><input class="easyui-textbox" type="text" name="gradeAttitude" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>响应速度评分</td>
                     <td><input class="easyui-textbox" type="text" name="gradeSpeed" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>验收人ID</td>
                     <td><input class="easyui-textbox" type="text" name="checkUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>验收时间（默认当前时间，可修改）</td>
                     <td><input class="easyui-textbox" type="text" name="checkTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>验收人建议</td>
                     <td><input class="easyui-textbox" type="text" name="checkSuggestion" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>停机时间</td>
                     <td><input class="easyui-textbox" type="text" name="stopHour" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>验收备注</td>
                     <td><input class="easyui-textbox" type="text" name="checkRemark" data-options="required:false"></td>
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
              url: "${ctx }/repair/update.do",
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
                url: "${ctx }/repair/update.do",
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

