<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_member</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_member数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/member/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'memberId',">memberId</th>
                <th data-options="field:'groupId',">会员组ID</th>
                <th data-options="field:'websiteId',">站点ID</th>
                <th data-options="field:'userdegreeId',">字典表身份ID</th>
                <th data-options="field:'familymembersId',">字典表家庭成员</th>
                <th data-options="field:'incomedescId',">字典表个人收入情况</th>
                <th data-options="field:'workseniorityId',">字典表工作年限</th>
                <th data-options="field:'degreeId',">字典表教育程度</th>
                <th data-options="field:'realname',">真实姓名</th>
                <th data-options="field:'gender',">性别</th>
                <th data-options="field:'birthday',">生日日期</th>
                <th data-options="field:'mobile',">手机</th>
                <th data-options="field:'tel',">电话</th>
                <th data-options="field:'score',">积分</th>
                <th data-options="field:'freezescore',">冻结的积分</th>
                <th data-options="field:'money',">账户金额</th>
                <th data-options="field:'company',">公司</th>
                <th data-options="field:'avatar',">会员头像</th>
                <th data-options="field:'marriage',">婚姻状况(空,保密;1,已婚;0,未婚)</th>
                <th data-options="field:'isCar',">是否有车(0:无 1：有)</th>
                <th data-options="field:'position',">职位</th>
                <th data-options="field:'schooltag',">毕业学校</th>
                <th data-options="field:'schooltagdate',">毕业时间</th>
                <th data-options="field:'favoritebrand',">最喜爱的品牌</th>
                <th data-options="field:'favoritestar',">最喜爱的明星</th>
                <th data-options="field:'favoritemovie',">最喜爱的电影</th>
                <th data-options="field:'favoritepersonage',">最喜爱的人物</th>
                <th data-options="field:'address',">地址</th>
                <th data-options="field:'wechatOppenid',">..oppenid</th>
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
                     <td><input class="easyui-textbox" type="text" name="memberId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>会员组ID</td>
                     <td><input class="easyui-textbox" type="text" name="groupId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>字典表身份ID</td>
                     <td><input class="easyui-textbox" type="text" name="userdegreeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>字典表家庭成员</td>
                     <td><input class="easyui-textbox" type="text" name="familymembersId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>字典表个人收入情况</td>
                     <td><input class="easyui-textbox" type="text" name="incomedescId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>字典表工作年限</td>
                     <td><input class="easyui-textbox" type="text" name="workseniorityId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>字典表教育程度</td>
                     <td><input class="easyui-textbox" type="text" name="degreeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>真实姓名</td>
                     <td><input class="easyui-textbox" type="text" name="realname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>性别</td>
                     <td><input class="easyui-textbox" type="text" name="gender" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>生日日期</td>
                     <td><input class="easyui-textbox" type="text" name="birthday" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>手机</td>
                     <td><input class="easyui-textbox" type="text" name="mobile" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>电话</td>
                     <td><input class="easyui-textbox" type="text" name="tel" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>积分</td>
                     <td><input class="easyui-textbox" type="text" name="score" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>冻结的积分</td>
                     <td><input class="easyui-textbox" type="text" name="freezescore" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>账户金额</td>
                     <td><input class="easyui-textbox" type="text" name="money" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>公司</td>
                     <td><input class="easyui-textbox" type="text" name="company" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>会员头像</td>
                     <td><input class="easyui-textbox" type="text" name="avatar" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>婚姻状况(空,保密;1,已婚;0,未婚)</td>
                     <td><input class="easyui-textbox" type="text" name="marriage" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否有车(0:无 1：有)</td>
                     <td><input class="easyui-textbox" type="text" name="isCar" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>职位</td>
                     <td><input class="easyui-textbox" type="text" name="position" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>毕业学校</td>
                     <td><input class="easyui-textbox" type="text" name="schooltag" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>毕业时间</td>
                     <td><input class="easyui-textbox" type="text" name="schooltagdate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最喜爱的品牌</td>
                     <td><input class="easyui-textbox" type="text" name="favoritebrand" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最喜爱的明星</td>
                     <td><input class="easyui-textbox" type="text" name="favoritestar" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最喜爱的电影</td>
                     <td><input class="easyui-textbox" type="text" name="favoritemovie" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最喜爱的人物</td>
                     <td><input class="easyui-textbox" type="text" name="favoritepersonage" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>地址</td>
                     <td><input class="easyui-textbox" type="text" name="address" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..oppenid</td>
                     <td><input class="easyui-textbox" type="text" name="wechatOppenid" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/member/update.do",
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
                url: "${ctx }/jc/shop/member/update.do",
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

