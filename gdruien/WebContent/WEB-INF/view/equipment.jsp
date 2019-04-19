<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/include/html_doctype.html"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>equipment</title>
<%@include file="/commons/include/get.jsp"%>
<style type="text/css">

</style>

</head>
<body>
    <h2>equipment数据增上改查</h2>
    <p></p>
    <div style="margin:20px 0;"></div>
    <table id="dg_id" class="easyui-datagrid" title="Basic DataGrid" style="width:800px;height:500px"
            data-options="toolbar:'#tb',singleSelect:true,collapsible:true,url:'${ctx }/equipment/getAll.do',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'id',">id</th>
                <th data-options="field:'equipmentNum',">设备编码</th>
                <th data-options="field:'assetsNum',">资产编码</th>
                <th data-options="field:'barCodeNum',">条码号</th>
                <th data-options="field:'equipmentName',">设备名称</th>
                <th data-options="field:'equipmentNickname',">设备别名</th>
                <th data-options="field:'equipmentCodeId',">设备信息编码ID</th>
                <th data-options="field:'equipmentCateId',">设备分类ID</th>
                <th data-options="field:'image',">设备图片</th>
                <th data-options="field:'equipmentStatusId',">设备状态ID</th>
                <th data-options="field:'financeCateId',">财务分类</th>
                <th data-options="field:'financeNum',">财务编号</th>
                <th data-options="field:'brandId',">品牌ID</th>
                <th data-options="field:'madeInId',">产地ID</th>
                <th data-options="field:'countryId',">国别ID</th>
                <th data-options="field:'spec',">规格/型号</th>
                <th data-options="field:'unitId',">单位ID</th>
                <th data-options="field:'fileNum',">档案编号</th>
                <th data-options="field:'assetSerialNum',">资产序列号</th>
                <th data-options="field:'assetMasterId',">资产负责人ID</th>
                <th data-options="field:'repairMasterId',">维修负责人</th>
                <th data-options="field:'useDepartmentId',">使用科室ID</th>
                <th data-options="field:'manageDepartmentId',">管理科室ID</th>
                <th data-options="field:'placeId',">存放地点ID</th>
                <th data-options="field:'assetCateId',">资产类型ID</th>
                <th data-options="field:'manufactureNum',">出厂编号</th>
                <th data-options="field:'manufactureDate',">出厂日期</th>
                <th data-options="field:'registerCertificateNum',">注册证件号</th>
                <th data-options="field:'estimatedOpenDate',">预开机日期</th>
                <th data-options="field:'fundFrom',">资金来源</th>
                <th data-options="field:'assetFromId',">资产来源</th>
                <th data-options="field:'invoiceNum',">发票编号</th>
                <th data-options="field:'invoiceAmount',">发票金额</th>
                <th data-options="field:'accessoryAsset',">附资产标志：1是，0否</th>
                <th data-options="field:'lifeSupport',">生命自持类：1是，0否</th>
                <th data-options="field:'firstAidAssets',">急救资产0不是1是</th>
                <th data-options="field:'specialAssets',">特种资产0不是1是</th>
                <th data-options="field:'isAssets',">是否资产0不是1是</th>
                <th data-options="field:'measuringAssets',">计量资产0不是1是</th>
                <th data-options="field:'customsDeclaration',">报关单0不是1是</th>
                <th data-options="field:'instructionManual',">说明书0没有1有</th>
                <th data-options="field:'warrantyCard',">报修卡0没有1有</th>
                <th data-options="field:'certificate',">合格证0没有1有</th>
                <th data-options="field:'medicalReport',">体检报告书0没有1有</th>
                <th data-options="field:'baseInfoRemark',">基本信息备注</th>
                <th data-options="field:'costBenefitAnalysis',">效益分析：0不用，1需要</th>
                <th data-options="field:'benefitCostUser',">效益人工费</th>
                <th data-options="field:'benefitCostUtility',">效益水电费</th>
                <th data-options="field:'benefitCostManagement',">效益管理费</th>
                <th data-options="field:'benefitCostArea',">效益场地费</th>
                <th data-options="field:'shouldOpenDays',">应开机天数</th>
                <th data-options="field:'monthWork',">应诊疗人数</th>
                <th data-options="field:'assetPower',">设备功率</th>
                <th data-options="field:'useHourPerDay',">理论开机时间（h/天）</th>
                <th data-options="field:'publicAsset',">公用设备：1是，0否</th>
                <th data-options="field:'createUid',">录入人ID</th>
                <th data-options="field:'createTime',">录入日期</th>
                <th data-options="field:'lastEditUid',">最后修改人ID</th>
                <th data-options="field:'lastEditTime',">最后修改时间</th>
                <th data-options="field:'aboutDocument',">档案情况：1是，0否</th>
                <th data-options="field:'sameAsOrderList',">实物是否与清单一致：1是，0否</th>
                <th data-options="field:'privateNetworkAsset',">是否专网资产：1是，0否</th>
                <th data-options="field:'building',">楼宇</th>
                <th data-options="field:'floor',">楼层</th>
                <th data-options="field:'room',">房间</th>
                <th data-options="field:'contractId',">合同ID</th>
                <th data-options="field:'contractPrice',">合同价格</th>
                <th data-options="field:'buyDate',">购入日期</th>
                <th data-options="field:'checkOkDate',">验收合格日期</th>
                <th data-options="field:'warrantyDate',">保修到期</th>
                <th data-options="field:'auditingDate',">送审时间</th>
                <th data-options="field:'winBidDate',">中标日期</th>
                <th data-options="field:'noticeDeliveryTime',">通知供货时间</th>
                <th data-options="field:'deadlineDeliveryDate',">交货截止日期</th>
                <th data-options="field:'firstCheckDate',">首次验收日期</th>
                <th data-options="field:'secondCheckDate',">二次验收时间</th>
                <th data-options="field:'insuranceDate',">出保日期</th>
                <th data-options="field:'supplierId',">供应商ID</th>
                <th data-options="field:'supplierPerson',">供应商联系人</th>
                <th data-options="field:'supplierPhone',">供应商电话</th>
                <th data-options="field:'repairCompanyId',">维修公司ID</th>
                <th data-options="field:'repairCompanyPerson',">维修公司联系人</th>
                <th data-options="field:'repairCompanyPhone',">联系人电话</th>
                <th data-options="field:'manufactureId',">生产厂商</th>
                <th data-options="field:'purchaseId',">采购单ID</th>
                <th data-options="field:'purchaseDetailId',">采购子表ID</th>
                <th data-options="field:'purchaseCateId',">采购方式ID</th>
                <th data-options="field:'bidCateId',">招标形式ID</th>
                <th data-options="field:'singleBudge',">单项预算</th>
                <th data-options="field:'setProjectAccording',">立项依据</th>
                <th data-options="field:'downPaymentDate',">首付日期</th>
                <th data-options="field:'downPaymentInvoiceNum',">首付发票号</th>
                <th data-options="field:'restPaymentDate',">尾款日期</th>
                <th data-options="field:'depreciationStartPoint',">折旧起点</th>
                <th data-options="field:'netWorth',">当前净值</th>
                <th data-options="field:'remainingValueRatio',">残值率</th>
                <th data-options="field:'beforehandClearFee',">预提清理费用</th>
                <th data-options="field:'depreciationStartDate',">开始折旧日期</th>
                <th data-options="field:'alreadyDepreciationMonth',">已折旧月份</th>
                <th data-options="field:'forecastUseYear',">预计使用年限</th>
                <th data-options="field:'monthDepreciationRatio',">月折旧率</th>
                <th data-options="field:'depreciationStatus',">折旧状态：1启用，0不启用</th>
                <th data-options="field:'depreciationCateId',">折旧方式ID</th>
                <th data-options="field:'depreciationRemark',">折旧备注</th>
                <th data-options="field:'applyReportNum',">申请报告号</th>
                <th data-options="field:'techParmSendTime',">技术参数送出时间</th>
                <th data-options="field:'argumentTime',">论证时间</th>
                <th data-options="field:'installDate',">安装日期</th>
                <th data-options="field:'arrivalInTime',">是否在规定时间内到货：1是，0否</th>
                <th data-options="field:'registrationStatus',">登记状态：0未登记1已登记</th>
                <th data-options="field:'status',">1正常，2维修，3停用，10已报废</th>
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
                     <td>设备编码</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资产编码</td>
                     <td><input class="easyui-textbox" type="text" name="assetsNum" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>条码号</td>
                     <td><input class="easyui-textbox" type="text" name="barCodeNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备名称</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentName" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备别名</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentNickname" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备信息编码ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentCodeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备分类ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>设备图片</td>
                     <td><input class="easyui-textbox" type="text" name="image" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>设备状态ID</td>
                     <td><input class="easyui-textbox" type="text" name="equipmentStatusId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>财务分类</td>
                     <td><input class="easyui-textbox" type="text" name="financeCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>财务编号</td>
                     <td><input class="easyui-textbox" type="text" name="financeNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>品牌ID</td>
                     <td><input class="easyui-textbox" type="text" name="brandId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>产地ID</td>
                     <td><input class="easyui-textbox" type="text" name="madeInId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>国别ID</td>
                     <td><input class="easyui-textbox" type="text" name="countryId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>规格/型号</td>
                     <td><input class="easyui-textbox" type="text" name="spec" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>单位ID</td>
                     <td><input class="easyui-textbox" type="text" name="unitId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>档案编号</td>
                     <td><input class="easyui-textbox" type="text" name="fileNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资产序列号</td>
                     <td><input class="easyui-textbox" type="text" name="assetSerialNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资产负责人ID</td>
                     <td><input class="easyui-textbox" type="text" name="assetMasterId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修负责人</td>
                     <td><input class="easyui-textbox" type="text" name="repairMasterId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>使用科室ID</td>
                     <td><input class="easyui-textbox" type="text" name="useDepartmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>管理科室ID</td>
                     <td><input class="easyui-textbox" type="text" name="manageDepartmentId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>存放地点ID</td>
                     <td><input class="easyui-textbox" type="text" name="placeId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资产类型ID</td>
                     <td><input class="easyui-textbox" type="text" name="assetCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>出厂编号</td>
                     <td><input class="easyui-textbox" type="text" name="manufactureNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>出厂日期</td>
                     <td><input class="easyui-textbox" type="text" name="manufactureDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>注册证件号</td>
                     <td><input class="easyui-textbox" type="text" name="registerCertificateNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>预开机日期</td>
                     <td><input class="easyui-textbox" type="text" name="estimatedOpenDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资金来源</td>
                     <td><input class="easyui-textbox" type="text" name="fundFrom" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>资产来源</td>
                     <td><input class="easyui-textbox" type="text" name="assetFromId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>发票编号</td>
                     <td><input class="easyui-textbox" type="text" name="invoiceNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>发票金额</td>
                     <td><input class="easyui-textbox" type="text" name="invoiceAmount" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>附资产标志：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="accessoryAsset" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>生命自持类：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="lifeSupport" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>急救资产0不是1是</td>
                     <td><input class="easyui-textbox" type="text" name="firstAidAssets" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>特种资产0不是1是</td>
                     <td><input class="easyui-textbox" type="text" name="specialAssets" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否资产0不是1是</td>
                     <td><input class="easyui-textbox" type="text" name="isAssets" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>计量资产0不是1是</td>
                     <td><input class="easyui-textbox" type="text" name="measuringAssets" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>报关单0不是1是</td>
                     <td><input class="easyui-textbox" type="text" name="customsDeclaration" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>说明书0没有1有</td>
                     <td><input class="easyui-textbox" type="text" name="instructionManual" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>报修卡0没有1有</td>
                     <td><input class="easyui-textbox" type="text" name="warrantyCard" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>合格证0没有1有</td>
                     <td><input class="easyui-textbox" type="text" name="certificate" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>体检报告书0没有1有</td>
                     <td><input class="easyui-textbox" type="text" name="medicalReport" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>基本信息备注</td>
                     <td><input class="easyui-textbox" type="text" name="baseInfoRemark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>效益分析：0不用，1需要</td>
                     <td><input class="easyui-textbox" type="text" name="costBenefitAnalysis" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>效益人工费</td>
                     <td><input class="easyui-textbox" type="text" name="benefitCostUser" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>效益水电费</td>
                     <td><input class="easyui-textbox" type="text" name="benefitCostUtility" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>效益管理费</td>
                     <td><input class="easyui-textbox" type="text" name="benefitCostManagement" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>效益场地费</td>
                     <td><input class="easyui-textbox" type="text" name="benefitCostArea" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>应开机天数</td>
                     <td><input class="easyui-textbox" type="text" name="shouldOpenDays" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>应诊疗人数</td>
                     <td><input class="easyui-textbox" type="text" name="monthWork" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>设备功率</td>
                     <td><input class="easyui-textbox" type="text" name="assetPower" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>理论开机时间（h/天）</td>
                     <td><input class="easyui-textbox" type="text" name="useHourPerDay" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>公用设备：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="publicAsset" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>录入人ID</td>
                     <td><input class="easyui-textbox" type="text" name="createUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>录入日期</td>
                     <td><input class="easyui-textbox" type="text" name="createTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后修改人ID</td>
                     <td><input class="easyui-textbox" type="text" name="lastEditUid" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>最后修改时间</td>
                     <td><input class="easyui-textbox" type="text" name="lastEditTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>档案情况：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="aboutDocument" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>实物是否与清单一致：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="sameAsOrderList" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否专网资产：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="privateNetworkAsset" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>楼宇</td>
                     <td><input class="easyui-textbox" type="text" name="building" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>楼层</td>
                     <td><input class="easyui-textbox" type="text" name="floor" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>房间</td>
                     <td><input class="easyui-textbox" type="text" name="room" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同ID</td>
                     <td><input class="easyui-textbox" type="text" name="contractId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>合同价格</td>
                     <td><input class="easyui-textbox" type="text" name="contractPrice" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>购入日期</td>
                     <td><input class="easyui-textbox" type="text" name="buyDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>验收合格日期</td>
                     <td><input class="easyui-textbox" type="text" name="checkOkDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>保修到期</td>
                     <td><input class="easyui-textbox" type="text" name="warrantyDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>送审时间</td>
                     <td><input class="easyui-textbox" type="text" name="auditingDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>中标日期</td>
                     <td><input class="easyui-textbox" type="text" name="winBidDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>通知供货时间</td>
                     <td><input class="easyui-textbox" type="text" name="noticeDeliveryTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>交货截止日期</td>
                     <td><input class="easyui-textbox" type="text" name="deadlineDeliveryDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>首次验收日期</td>
                     <td><input class="easyui-textbox" type="text" name="firstCheckDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>二次验收时间</td>
                     <td><input class="easyui-textbox" type="text" name="secondCheckDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>出保日期</td>
                     <td><input class="easyui-textbox" type="text" name="insuranceDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商ID</td>
                     <td><input class="easyui-textbox" type="text" name="supplierId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商联系人</td>
                     <td><input class="easyui-textbox" type="text" name="supplierPerson" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>供应商电话</td>
                     <td><input class="easyui-textbox" type="text" name="supplierPhone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修公司ID</td>
                     <td><input class="easyui-textbox" type="text" name="repairCompanyId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>维修公司联系人</td>
                     <td><input class="easyui-textbox" type="text" name="repairCompanyPerson" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>联系人电话</td>
                     <td><input class="easyui-textbox" type="text" name="repairCompanyPhone" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>生产厂商</td>
                     <td><input class="easyui-textbox" type="text" name="manufactureId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>采购单ID</td>
                     <td><input class="easyui-textbox" type="text" name="purchaseId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>采购子表ID</td>
                     <td><input class="easyui-textbox" type="text" name="purchaseDetailId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>采购方式ID</td>
                     <td><input class="easyui-textbox" type="text" name="purchaseCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>招标形式ID</td>
                     <td><input class="easyui-textbox" type="text" name="bidCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>单项预算</td>
                     <td><input class="easyui-textbox" type="text" name="singleBudge" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>立项依据</td>
                     <td><input class="easyui-textbox" type="text" name="setProjectAccording" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>首付日期</td>
                     <td><input class="easyui-textbox" type="text" name="downPaymentDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>首付发票号</td>
                     <td><input class="easyui-textbox" type="text" name="downPaymentInvoiceNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>尾款日期</td>
                     <td><input class="easyui-textbox" type="text" name="restPaymentDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>折旧起点</td>
                     <td><input class="easyui-textbox" type="text" name="depreciationStartPoint" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>当前净值</td>
                     <td><input class="easyui-textbox" type="text" name="netWorth" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>残值率</td>
                     <td><input class="easyui-textbox" type="text" name="remainingValueRatio" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>预提清理费用</td>
                     <td><input class="easyui-textbox" type="text" name="beforehandClearFee" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>开始折旧日期</td>
                     <td><input class="easyui-textbox" type="text" name="depreciationStartDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>已折旧月份</td>
                     <td><input class="easyui-textbox" type="text" name="alreadyDepreciationMonth" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>预计使用年限</td>
                     <td><input class="easyui-textbox" type="text" name="forecastUseYear" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>月折旧率</td>
                     <td><input class="easyui-textbox" type="text" name="monthDepreciationRatio" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>折旧状态：1启用，0不启用</td>
                     <td><input class="easyui-textbox" type="text" name="depreciationStatus" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>折旧方式ID</td>
                     <td><input class="easyui-textbox" type="text" name="depreciationCateId" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>折旧备注</td>
                     <td><input class="easyui-textbox" type="text" name="depreciationRemark" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>申请报告号</td>
                     <td><input class="easyui-textbox" type="text" name="applyReportNum" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>技术参数送出时间</td>
                     <td><input class="easyui-textbox" type="text" name="techParmSendTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>论证时间</td>
                     <td><input class="easyui-textbox" type="text" name="argumentTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>安装日期</td>
                     <td><input class="easyui-textbox" type="text" name="installDate" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>是否在规定时间内到货：1是，0否</td>
                     <td><input class="easyui-textbox" type="text" name="arrivalInTime" data-options="required:false"></td>
                </tr>
                <tr>
                     <td>登记状态：0未登记1已登记</td>
                     <td><input class="easyui-textbox" type="text" name="registrationStatus" data-options="required:true"></td>
                </tr>
                <tr>
                     <td>1正常，2维修，3停用，10已报废</td>
                     <td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></td>
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
              url: "${ctx }/equipment/update.do",
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
                url: "${ctx }/equipment/update.do",
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

