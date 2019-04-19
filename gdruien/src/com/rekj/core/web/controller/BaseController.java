package com.rekj.core.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import com.rekj.core.page.PageBean;
import com.rekj.core.spring.DateEditor;
import com.rekj.core.web.ResultMessage;
import com.rekj.core.web.query.QueryFilter;

/**
 * 基础控制器
 * 
 * @author jack
 * @date 2017年5月7日 下午4:42:23
 */
public class BaseController extends GenericController {

	public static final String Message = "message";

//	@Resource
//	protected ConfigurableBeanValidator confValidator;

	/**
	 * 格式化分页表格需要的数据格式
	 * 
	 * @param list
	 * @param filter
	 * @return
	 * @author jack 2017年5月7日 下午4:43:27
	 */
	protected Object formatDatagrid(List list, QueryFilter filter) {
		HashMap map = new HashMap();
		if (list == null) {
			map.put("rows", new ArrayList());
			map.put("total", 0);
			return map;
		}

		PageBean page = filter.getPageBean();
		boolean needPage = page != null;
		if (needPage) {
			long total = page.getTotalCount();
			map.put("rows", list);
			map.put("total", total);
			return map;
		} else {
			return list;
		}
	}
	
	protected Object formatDatagrid(List list) {
		HashMap map = new HashMap();
		if (list == null) {
			map.put("rows", new ArrayList());
			map.put("total", 0);
			return map;
		} else  {
			map.put("rows", list);
			map.put("total", list.size());
			return map;
		}
	}

	public void addMessage(ResultMessage message, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("message", message);
	}
	
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Integer.class, null, new CustomNumberEditor(Integer.class, null, true));
		binder.registerCustomEditor(Long.class, null, new CustomNumberEditor(Long.class, null, true));
//		binder.registerCustomEditor(Boolean.class, null, new CustomBooleanEditor(true));
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(Date.class, new DateEditor());
		binder.setDisallowedFields("tag");
		// binder.registerCustomEditor([B.class, new
		// ByteArrayMultipartFileEditor());
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// dateFormat.setLenient(false);
		// binder.registerCustomEditor(Date.class, null, new CustomDateEditor(
		// dateFormat, true));
	}

}
