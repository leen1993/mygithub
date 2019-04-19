<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_core_website</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_core_website数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/core/website/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'websiteId',">websiteId</th>
                <th data-options="field:'adminId',">创始人ID</th>
                <th data-options="field:'globalId',">全局表ID</th>
                <th data-options="field:'parentId',">父站点ID</th>
                <th data-options="field:'domain',">域名</th>
                <th data-options="field:'name',">站点名称</th>
                <th data-options="field:'additionaltitle',">附加标题</th>
                <th data-options="field:'currentSystem',">当前系统（jeecms,jeeshop,jeeshop）</th>
                <th data-options="field:'suffix',">访问后缀</th>
                <th data-options="field:'lft',">树左边</th>
                <th data-options="field:'rgt',">树右边</th>
                <th data-options="field:'createTime',">站点创建时间</th>
                <th data-options="field:'baseDomain',">根域名</th>
                <th data-options="field:'domainAlias',">多个别名用;分割</th>
                <th data-options="field:'shortName',">站点简称</th>
                <th data-options="field:'closeReason',">关闭原因</th>
                <th data-options="field:'isClose',">是否关闭网站（后台仍可访问）</th>
                <th data-options="field:'frontEncoding',">前台编码</th>
                <th data-options="field:'frontContentType',">前台Content-Type</th>
                <th data-options="field:'localeFront',">前台本地化信息</th>
                <th data-options="field:'localeAdmin',">后台本地化信息</th>
                <th data-options="field:'controlReserved',">用户信息保留字</th>
                <th data-options="field:'controlNameMinlen',">用户名最短几个字符</th>
                <th data-options="field:'controlFrontIps',">前台允许访问的IP</th>
                <th data-options="field:'controlAdminIps',">后台允许访问的IP</th>
                <th data-options="field:'company',">公司名称</th>
                <th data-options="field:'copyright',">版权信息</th>
                <th data-options="field:'recordCode',">备案号</th>
                <th data-options="field:'email',">电子邮箱</th>
                <th data-options="field:'phone',">电话号码</th>
                <th data-options="field:'mobile',">手机号码</th>
                <th data-options="field:'isRelativePath',">使用相对路径</th>
                <th data-options="field:'emailHost',">邮件发送服务器</th>
                <th data-options="field:'emailEncoding',">邮件发送编码</th>
                <th data-options="field:'emailUsername',">邮箱用户名</th>
                <th data-options="field:'emailPersonal',">邮箱发件人</th>
                <th data-options="field:'emailPassword',">邮箱密码</th>
                <th data-options="field:'version',">版本信息</th>
                <th data-options="field:'restart',">restart</th>
                <th data-options="field:'tplSolution',">....</th>
                <th data-options="field:'tplMobileSolution',">tplMobileSolution</th>
                <th data-options="field:'ftpUploadId',">..ftp</th>
                <th data-options="field:'ftpSyncPageId',">.....FTP</th>
                <th data-options="field:'pageIsSyncFtp',">.......FTP</th>
                <th data-options="field:'resouceIsSyncFtp',">......FTP</th>
                <th data-options="field:'resourcesPath',">资源目录</th>
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
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>创始人ID</td>
                     <td><input class="easyui-textbox" type="text" name="adminId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>全局表ID</td>
                     <td><input class="easyui-textbox" type="text" name="globalId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>父站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="parentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>域名</td>
                     <td><input class="easyui-textbox" type="text" name="domain" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点名称</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>附加标题</td>
                     <td><input class="easyui-textbox" type="text" name="additionaltitle" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前系统（jeecms,jeeshop,jeeshop）</td>
                     <td><input class="easyui-textbox" type="text" name="currentSystem" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>访问后缀</td>
                     <td><input class="easyui-textbox" type="text" name="suffix" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>树左边</td>
                     <td><input class="easyui-textbox" type="text" name="lft" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>树右边</td>
                     <td><input class="easyui-textbox" type="text" name="rgt" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点创建时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>根域名</td>
                     <td><input class="easyui-textbox" type="text" name="baseDomain" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>多个别名用;分割</td>
                     <td><input class="easyui-textbox" type="text" name="domainAlias" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>站点简称</td>
                     <td><input class="easyui-textbox" type="text" name="shortName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>关闭原因</td>
                     <td><input class="easyui-textbox" type="text" name="closeReason" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否关闭网站（后台仍可访问）</td>
                     <td><input class="easyui-textbox" type="text" name="isClose" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>前台编码</td>
                     <td><input class="easyui-textbox" type="text" name="frontEncoding" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>前台Content-Type</td>
                     <td><input class="easyui-textbox" type="text" name="frontContentType" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>前台本地化信息</td>
                     <td><input class="easyui-textbox" type="text" name="localeFront" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>后台本地化信息</td>
                     <td><input class="easyui-textbox" type="text" name="localeAdmin" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>用户信息保留字</td>
                     <td><input class="easyui-textbox" type="text" name="controlReserved" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>用户名最短几个字符</td>
                     <td><input class="easyui-textbox" type="text" name="controlNameMinlen" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>前台允许访问的IP</td>
                     <td><input class="easyui-textbox" type="text" name="controlFrontIps" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>后台允许访问的IP</td>
                     <td><input class="easyui-textbox" type="text" name="controlAdminIps" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>公司名称</td>
                     <td><input class="easyui-textbox" type="text" name="company" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>版权信息</td>
                     <td><input class="easyui-textbox" type="text" name="copyright" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>备案号</td>
                     <td><input class="easyui-textbox" type="text" name="recordCode" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>电子邮箱</td>
                     <td><input class="easyui-textbox" type="text" name="email" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>电话号码</td>
                     <td><input class="easyui-textbox" type="text" name="phone" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>手机号码</td>
                     <td><input class="easyui-textbox" type="text" name="mobile" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>使用相对路径</td>
                     <td><input class="easyui-textbox" type="text" name="isRelativePath" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>邮件发送服务器</td>
                     <td><input class="easyui-textbox" type="text" name="emailHost" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮件发送编码</td>
                     <td><input class="easyui-textbox" type="text" name="emailEncoding" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮箱用户名</td>
                     <td><input class="easyui-textbox" type="text" name="emailUsername" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮箱发件人</td>
                     <td><input class="easyui-textbox" type="text" name="emailPersonal" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>邮箱密码</td>
                     <td><input class="easyui-textbox" type="text" name="emailPassword" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>版本信息</td>
                     <td><input class="easyui-textbox" type="text" name="version" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="restart" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>....</td>
                     <td><input class="easyui-textbox" type="text" name="tplSolution" data-options="required:false"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="tplMobileSolution" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>..ftp</td>
                     <td><input class="easyui-textbox" type="text" name="ftpUploadId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.....FTP</td>
                     <td><input class="easyui-textbox" type="text" name="ftpSyncPageId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>.......FTP</td>
                     <td><input class="easyui-textbox" type="text" name="pageIsSyncFtp" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>......FTP</td>
                     <td><input class="easyui-textbox" type="text" name="resouceIsSyncFtp" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>资源目录</td>
                     <td><input class="easyui-textbox" type="text" name="resourcesPath" data-options="required:false"></td>
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
              url: "${ctx }/jc/core/website/update.do",
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
                url: "${ctx }/jc/core/website/update.do",
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

