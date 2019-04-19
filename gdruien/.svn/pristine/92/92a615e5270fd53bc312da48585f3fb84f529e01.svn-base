package com.rekj.core.db;

import java.util.List;
import java.util.Map;

import com.rekj.core.mybatis.BaseMyBatisDao.SqlSessionTemplate;
import com.rekj.core.page.PageBean;
import com.rekj.core.web.query.QueryFilter;

public abstract interface IEntityDao {
	int add(Object paramE);
	
	int add(String sqlKey, Object paramE);

	int delById(Object paramPK);
	
	int delBySqlKey(String sqlKey, Object params);

	int update(Object paramE);
	
	int update(String sqlKey, Object params);

	Object getById(Object paramPK);

	// 容易勿用,去除
//	List getList(String paramString, Object paramObject);
//
//	List getList(String paramString, Object paramObject, PageBean paramPageBean);
//	
//	List getList(String statementName, QueryFilter queryFilter);
	
	List getBySqlKey(String sqlKey, QueryFilter queryFilter);
	
	List getBySqlKey(String sqlKey, Object params, PageBean pageBean);
	
	List getBySqlKey(String sqlKey, Object params);

	List getAll();

	List getAll(Object e);

	List getAll(Map map);

	List getAll(QueryFilter paramQueryFilter);

	Object getOne(String sqlKey, Object params);

	String getStatement(String statement);
	
	SqlSessionTemplate getSqlSessionTemplate();
}
