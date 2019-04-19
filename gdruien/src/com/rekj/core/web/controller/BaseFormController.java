package com.rekj.core.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

/**
 * 控制器基础类(特别用于表单保存使用)
 * 
 * @author jack
 * @date 2017年5月7日 下午6:11:58
 */
public class BaseFormController extends GenericController {
	public Logger logger = LoggerFactory.getLogger(BaseFormController.class);

	// @Resource
	// protected ConfigurableBeanValidator confValidator;

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Integer.class, null, new CustomNumberEditor(Integer.class, null, true));
		binder.registerCustomEditor(Long.class, null, new CustomNumberEditor(Long.class, null, true));
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, null, new CustomDateEditor(dateFormat, true));
	}

	// protected ResultMessage validForm(String form, Object obj, BindingResult
	// result, HttpServletRequest request) {
	// ResultMessage resObj = new ResultMessage(true, "");
	// return resObj;
	// }
}
