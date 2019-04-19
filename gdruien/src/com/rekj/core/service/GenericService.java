package com.rekj.core.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.rekj.core.db.IEntityDao;
import com.rekj.core.page.PageBean;
import com.rekj.core.web.query.QueryFilter;

/**
 * 通用数据访问服务
 * 
 * @author jack
 * @date 2017年5月13日 下午3:12:01
 */
@Transactional(rollbackFor = Exception.class)
public abstract class GenericService {

	public static final String OK = "ok";
	public static final String YES = "1";
	public static final String NO = "0";

	/**
	 * 批量保存状态值 {added,removed,deleted,modified}
	 */
	public static final String added = "added";
	public static final String removed = "removed";
	public static final String deleted = "deleted";
	public static final String modified = "modified";
	
	public static final String msg$changed = "数据发生变化,请重新加载数据";
	

	protected Logger logger = LoggerFactory.getLogger(GenericService.class);

	protected abstract IEntityDao getEntityDao();

	public void add(Object entity) {
		getEntityDao().add(entity);
	}

	public void add(String sqlkey, Object entity) {
		getEntityDao().add(sqlkey, entity);
	}

	public void delById(Object id) {
		getEntityDao().delById(id);
	}

	public int update(Object entity) throws Exception {
		return getEntityDao().update(entity);
	}

	public int update(String sqlkey, Object entity) {
		return getEntityDao().update(sqlkey, entity);
	}

	public Object getById(Object id) {
		return getEntityDao().getById(id);
	}

	public Object getOne(String sqlkey, Object entity) {
		return getEntityDao().getOne(sqlkey, entity);
	}

	public List getList(String sqlkey, PageBean pageBean) {
		List list = getEntityDao().getBySqlKey(sqlkey, pageBean);
		return list;
	}

	public List getList(String sqlkey, Object param, PageBean pb) {
		List list = getEntityDao().getBySqlKey(sqlkey, param, pb);
		return list;
	}

	public List getList(String sqlkey, Object param) {
		if (param instanceof QueryFilter) {
			return getEntityDao().getBySqlKey(sqlkey, (QueryFilter) param);
		} else {
			return getEntityDao().getBySqlKey(sqlkey, param);
		}
	}

	public List getAll() {
		return getEntityDao().getAll();
	}

	public List getAll(Object e) {
		return getEntityDao().getAll(e);
	}

	public List getAll(Map map) {
		return getEntityDao().getAll(map);
	}

	public List getAll(QueryFilter filter) {
		return getEntityDao().getAll(filter);
	}

	public List getAll(QueryFilter filter, String statement) {
		String s = this.getEntityDao().getStatement(statement);
		return getEntityDao().getBySqlKey(s, filter);
	}

	public int delBySqlKey(String sqlKey, Object param) {
		return getEntityDao().delBySqlKey(sqlKey, param);
	}
}
