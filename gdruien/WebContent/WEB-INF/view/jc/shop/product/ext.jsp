<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_product_ext</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_product_ext数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/product/ext/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'productId',">productId</th>
                <th data-options="field:'code',">商品编号</th>
                <th data-options="field:'description',">商品简介</th>
                <th data-options="field:'mtitle',">页面TITLE</th>
                <th data-options="field:'mkeywords',">页面KEYWORDS</th>
                <th data-options="field:'mdescription',">页面DESCRIPTION</th>
                <th data-options="field:'detailImg',">详细图</th>
                <th data-options="field:'listImg',">列表图</th>
                <th data-options="field:'minImg',">最小图</th>
                <th data-options="field:'coverImg',">封面图片</th>
                <th data-options="field:'weight',">重量(g)</th>
                <th data-options="field:'unit',">单位</th>
                <th data-options="field:'productImgs',">商品全方位图片</th>
                <th data-options="field:'productImgDesc',">全方位图片描述</th>
                <th data-options="field:'isLimittime',">是否限时购买</th>
                <th data-options="field:'limittime',">限时时间</th>
                <th data-options="field:'seckillprice',">秒杀价</th>
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
                     <td><input class="easyui-textbox" type="text" name="productId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品编号</td>
                     <td><input class="easyui-textbox" type="text" name="code" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品简介</td>
                     <td><input class="easyui-textbox" type="text" name="description" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>页面TITLE</td>
                     <td><input class="easyui-textbox" type="text" name="mtitle" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>页面KEYWORDS</td>
                     <td><input class="easyui-textbox" type="text" name="mkeywords" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>页面DESCRIPTION</td>
                     <td><input class="easyui-textbox" type="text" name="mdescription" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>详细图</td>
                     <td><input class="easyui-textbox" type="text" name="detailImg" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>列表图</td>
                     <td><input class="easyui-textbox" type="text" name="listImg" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最小图</td>
                     <td><input class="easyui-textbox" type="text" name="minImg" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>封面图片</td>
                     <td><input class="easyui-textbox" type="text" name="coverImg" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>重量(g)</td>
                     <td><input class="easyui-textbox" type="text" name="weight" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>单位</td>
                     <td><input class="easyui-textbox" type="text" name="unit" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品全方位图片</td>
                     <td><input class="easyui-textbox" type="text" name="productImgs" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>全方位图片描述</td>
                     <td><input class="easyui-textbox" type="text" name="productImgDesc" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否限时购买</td>
                     <td><input class="easyui-textbox" type="text" name="isLimittime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>限时时间</td>
                     <td><input class="easyui-textbox" type="text" name="limittime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>秒杀价</td>
                     <td><input class="easyui-textbox" type="text" name="seckillprice" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/product/ext/update.do",
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
                url: "${ctx }/jc/shop/product/ext/update.do",
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

