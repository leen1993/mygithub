package com.rekj.core.web.query;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rekj.core.page.PageBean;
import com.rekj.core.web.util.RequestUtil;

/**
 * 读取HttpServletRequest传入的参数(分页参数,分组参数,Q_XXX_SL参数,其他表单参数等)
 * 
 * @author      jack
 * @date        2017年5月7日 上午4:10:27
 */
public class QueryFilter {
	private static Logger logger = LoggerFactory.getLogger(QueryFilter.class);

	private Map<String, Object> filters = new HashMap<String, Object>();

	public static final String ORDER_ASC = "1";
	public static final String ORDER_DESC = "2";
	private PageBean pageBean = null;
	private HttpServletRequest request = null;

	/**
	 * 默认分页
	 * @param request
	 */
	public QueryFilter(HttpServletRequest request) {
		this(request, true);
	}

	/**
	 * 查询过滤
	 * 
	 * @param request
	 * @param needPage 是否分页
	 */
	public QueryFilter(HttpServletRequest request, boolean needPage) {
		try {
			this.request = request;
			String sortField = request.getParameter("sortField");
			String orderSeqNum = request.getParameter("sortOrder");

			String sortOrder = "desc";
			if (orderSeqNum != null && "asc".equals(orderSeqNum)) {
				sortOrder = "asc";
			}
			Map<String, Object> map = RequestUtil.getQueryMap(request);
			if (sortField != null) {
				map.put("sortField", sortField);
				map.put("sortOrder", sortOrder);
			}
			
			this.filters = map;
			if (needPage) {
				int page = RequestUtil.getInt(request, "pageIndex", 0) + 1;
				int pageSize = RequestUtil.getInt(request, "pageSize", PageBean.DEFAULT_PAGE_SIZE);
				// int oldPageSize = RequestUtil.getInt(request, tableIdCode
				// + "oz", PageBean.DEFAULT_PAGE_SIZE);
				// if (pageSize != oldPageSize) {
				// int first = PageUtils.getFirstNumber(page, oldPageSize);
				// page = first / pageSize + 1;
				// }
				this.pageBean = new PageBean(page, pageSize);
			}
			if (this.pageBean != null) {
				this.pageBean.setShowTotal(true);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public Map<String, Object> getFilters() {
		return this.filters;
	}

	public void addFilter(String filterName, Object params) {
		this.filters.put(filterName, params);
	}

	public void setFilters(Map<String, Object> filters) {
		this.filters = filters;
	}
}
