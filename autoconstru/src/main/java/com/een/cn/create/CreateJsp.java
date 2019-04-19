package com.een.cn.create;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.een.cn.pojo.Field;
import com.een.cn.pojo.Pojo;
import com.een.cn.util.ArrayUtil;
import com.een.cn.util.ConfigUtil;
import com.een.cn.util.StringUtil;

@Component
public class CreateJsp extends CommonCreate implements CreateFile {
    
    public void create(List<Pojo> pojos) throws IOException {
        
        // 设置专有属性
        setOwnData(pojos);
        
        // 主逻辑 替换标识符号
        mainLogic(pojos);
        
    }

    /**
     * 替换逻辑
     * 
     * @param pojos
     * @throws IOException
     */
    public void mainLogic(List<Pojo> pojos) throws IOException {
        String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.indexJsp")));
        StringBuffer sb = null;
        for (int i = 0; i < pojos.size(); i++) {
            sb = new StringBuffer(readFileToString);
            Pojo pojo = pojos.get(i);
            sb = replace(sb, FinalVariable.TABLE_NAME, pojo.getTableName());
            sb = replace(sb, FinalVariable.PACKAGE_NAME, pojo.getPackageName());
            sb = replace(sb, FinalVariable.CREATE_DATE, pojo.getCreateDate());
            sb = replace(sb, FinalVariable.AUTHOR, pojo.getAuthor());
            sb = replace(sb, FinalVariable.POJO_NAME, pojo.getPojoName());
            sb = replace(sb, FinalVariable.DOWNCASE_FIRST_POJO_NAME, StringUtil.makeFirstLetterLowerCase(pojo.getPojoName()));
            sb = replace(sb, FinalVariable.DELETE_MARK, "\"delete\"");
            sb = replace(sb, FinalVariable.ADD_MARK, "\"add\"");
            sb = replace(sb, FinalVariable.UPDATE_MARK, "\"update\"");
            
            
            // 设置查询的url
            String baseUrl = setBaseUrl(pojo);
            sb = replace(sb, FinalVariable.URL, baseUrl);
            
            // 构建fields
            String fields = joinFields(pojo.getFieldList());
            sb = replace(sb, FinalVariable.FIELDS, fields);
            
            // 构建fields表单
            String formFields = joinFormFields(pojo.getFieldList());
            sb = replace(sb, FinalVariable.FORM_FIELDS, formFields);
           
            
            FileUtils.writeStringToFile(new File(pojo.getFilePath()), sb.toString());
        }
    }

    /**
     * 构建Form表单组件
            
     * @param fieldList
     * @return
     */
    private String joinFormFields(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            /*
             * <tr>
             *   <td>id:</td>
             *   <td><input class="easyui-textbox" type="text" name="id" data-options="required:true"></input></td>
             * </tr>
             * */
            sb.append("\r\n                <tr>");
            sb.append("\r\n                     <td>"+ field.getAnnotation() +"</td>");
            sb.append("\r\n                     <td><input class=\"easyui-textbox\" type=\"text\" name=\""+ field.getName() +"\" data-options=\"required:"+ field.getRequired() +"\"></td>");
            sb.append("\r\n                </tr>");
        }
        return sb.toString();
    }

    private String joinFields(List<Field> fields) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            /*
             * <th data-options="field:'id',width:80">Item ID</th>
             * 可根据长度
             * 
             *  <th data-options='field:id',width:80'>id</th>
             * */
            String showName = StringUtil.isEmpty(field.getAnnotation()) ? field.getName() : field.getAnnotation();
            sb.append("<th data-options=\"field:'"+field.getName()+"',\">"+ showName +"</th>");
            if(i < fields.size() - 1) {
                sb.append("\r\n                ");
            }
        }
        return sb.toString();
    }

    /**
     * 设置url
     * 
     * @param pojo
     */
    private String setBaseUrl(Pojo pojo) {
        String[] s = pojo.getTableName().split("_");
        return "${ctx }/" + ArrayUtil.join(s, "/")+ "/";
    }

    /**
     * 替换方法替换所有标识符
     * 
     * @param sb 替换的字符串
     * @param replaceStr 标识符
     * @param newStr 替换为
     * @return
     */
    private StringBuffer replace(StringBuffer sb, String replaceStr, String newStr) {
        int packageNameStart = 1;
        int packageNameEnd = 0;
        while(true) {
            packageNameStart = sb.indexOf(replaceStr, packageNameEnd);
            if(packageNameStart == -1) break;
            packageNameEnd = packageNameStart + replaceStr.length();
            sb = sb.replace(packageNameStart, packageNameEnd, newStr);
        }
        return sb;
    }

    /**
     * 设置专门属性
     * 
     */
    public void setOwnData(List<Pojo> pojos) {
        for (Pojo p : pojos) {
            setFileName(p);
            setFilePath(p, ConfigUtil.get("package.controller"));
        }
    }


    public void setFilePath(Pojo p, String folderType) {
        String[] ts = p.getTableName().split("_");
        StringBuffer path = new StringBuffer("");
//        String packageP = ConfigUtil.get("companyUrl").replaceAll("\\.", "\\/");
//    
//        path.append(packageP + "/");
        // 表名包路径部分
        for (int i = 0; i < ts.length - 1; i++) {
            path.append(ts[i] + "/");
        }
        path.append(p.getFileName());
        String filePath = ConfigUtil.get("jspPath") + path.toString();
        p.setFilePath(filePath);
    }

    public void setPackageName(Pojo p, String folderType) {
    }

    public void setFileName(Pojo p) {
        String[] tn = p.getTableName().split("_");
        p.setFileName(tn[tn.length - 1] + ".jsp");        
    }

    public void setFullName(Pojo p) {
    }

    public void setImport(Pojo p) {
    }
}
