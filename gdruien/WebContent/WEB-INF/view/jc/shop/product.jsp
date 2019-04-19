<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>jc_shop_product</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>jc_shop_product数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/jc/shop/product/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'productId',">productId</th>
                <th data-options="field:'ptypeId',">类型ID</th>
                <th data-options="field:'brandId',">品牌ID</th>
                <th data-options="field:'categoryId',">类别ID</th>
                <th data-options="field:'websiteId',">站点ID</th>
                <th data-options="field:'configId',">配置ID</th>
                <th data-options="field:'name',">商品名称</th>
                <th data-options="field:'marketPrice',">市场价</th>
                <th data-options="field:'salePrice',">销售价</th>
                <th data-options="field:'costPrice',">成本价</th>
                <th data-options="field:'viewCount',">浏览次数</th>
                <th data-options="field:'saleCount',">销售量</th>
                <th data-options="field:'stockCount',">库存</th>
                <th data-options="field:'alertInventory',">警戒库存</th>
                <th data-options="field:'createTime',">添加时间</th>
                <th data-options="field:'expireTime',">到期时间</th>
                <th data-options="field:'status',">商品状态0-删除 1-上架 2-下架 3-回收站</th>
                <th data-options="field:'isRecommend',">是否推荐</th>
                <th data-options="field:'isSpecial',">是否特价</th>
                <th data-options="field:'isHotsale',">是否热卖</th>
                <th data-options="field:'isNewproduct',">是否新品</th>
                <th data-options="field:'score',">商品送积分</th>
                <th data-options="field:'sharecontent',">sharecontent</th>
                <th data-options="field:'lackRemind',">是否库存预警</th>
                <th data-options="field:'liRun',">利润</th>
                <th data-options="field:'relatedgoods',">relatedgoods</th>
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
                     <td>类型ID</td>
                     <td><input class="easyui-textbox" type="text" name="ptypeId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>品牌ID</td>
                     <td><input class="easyui-textbox" type="text" name="brandId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>类别ID</td>
                     <td><input class="easyui-textbox" type="text" name="categoryId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>站点ID</td>
                     <td><input class="easyui-textbox" type="text" name="websiteId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>配置ID</td>
                     <td><input class="easyui-textbox" type="text" name="configId" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品名称</td>
                     <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>市场价</td>
                     <td><input class="easyui-textbox" type="text" name="marketPrice" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>销售价</td>
                     <td><input class="easyui-textbox" type="text" name="salePrice" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>成本价</td>
                     <td><input class="easyui-textbox" type="text" name="costPrice" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>浏览次数</td>
                     <td><input class="easyui-textbox" type="text" name="viewCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>销售量</td>
                     <td><input class="easyui-textbox" type="text" name="saleCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>库存</td>
                     <td><input class="easyui-textbox" type="text" name="stockCount" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>警戒库存</td>
                     <td><input class="easyui-textbox" type="text" name="alertInventory" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>添加时间</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>到期时间</td>
                     <td><input class="easyui-textbox" type="text" name="expireTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>商品状态0-删除 1-上架 2-下架 3-回收站</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否推荐</td>
                     <td><input class="easyui-textbox" type="text" name="isRecommend" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否特价</td>
                     <td><input class="easyui-textbox" type="text" name="isSpecial" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否热卖</td>
                     <td><input class="easyui-textbox" type="text" name="isHotsale" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>是否新品</td>
                     <td><input class="easyui-textbox" type="text" name="isNewproduct" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>商品送积分</td>
                     <td><input class="easyui-textbox" type="text" name="score" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="sharecontent" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否库存预警</td>
                     <td><input class="easyui-textbox" type="text" name="lackRemind" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>利润</td>
                     <td><input class="easyui-textbox" type="text" name="liRun" data-options="required:true"></td>
                </tr>
                <tr>
                     <td></td>
                     <td><input class="easyui-textbox" type="text" name="relatedgoods" data-options="required:false"></td>
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
              url: "${ctx }/jc/shop/product/update.do",
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
                url: "${ctx }/jc/shop/product/update.do",
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

