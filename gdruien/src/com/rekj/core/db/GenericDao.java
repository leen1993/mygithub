package com.rekj.core.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.rekj.core.model.BaseModel;
import com.rekj.core.mybatis.BaseMyBatisDao;
import com.rekj.core.mybatis.IbatisSql;
import com.rekj.core.page.PageBean;
import com.rekj.core.util.BeanUtils;
import com.rekj.core.web.query.QueryFilter;

/**
 * 通用数据库访问
 * 
 * @author      jack
 * @date        2017年6月30日 上午3:24:57
 */
public abstract class GenericDao extends BaseMyBatisDao implements IEntityDao {

	public static final String OK = "ok";
	public static final String YES = "1";
	public static final String NO = "0";
	
	@Resource
	protected JdbcDao jdbcDao;

	public Object getById(Object params) {
		String getStatement = getNamespace() + ".getById";
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().selectOne(getStatement, params);
	}

	public Object getOne(String sqlKey, Object params) {
		String statement = getNamespace() + "." + sqlKey;
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().selectOne(statement, params);
	}

	public List getBySqlKey(String sqlKey, Object params, PageBean pageBean) {
		String statement = getNamespace() + "." + sqlKey;
		return getList(statement, params, pageBean);
	}

	public List getBySqlKey(String sqlKey, QueryFilter queryFilter) {
		List list = new ArrayList();
		if (queryFilter.getPageBean() == null) {
			list = getBySqlKey(sqlKey, queryFilter.getFilters());
		} else {
			list = getBySqlKey(sqlKey, queryFilter.getFilters(), queryFilter.getPageBean());
		}
		return list;
	}

	public List getBySqlKey(String sqlKey, Object params) {
		String statement = getNamespace() + "." + sqlKey;
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}		
		return getSqlSessionTemplate().selectList(statement, params);
	}

	public int delById(Object params) {
		String delStatement = getNamespace() + ".delById";
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().delete(delStatement, params);
	}

	public int delBySqlKey(String sqlKey, Object params) {
		String delStatement = getNamespace() + "." + sqlKey;
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().delete(delStatement, params);
	}

	public int add(Object entity) {
		String addStatement = getNamespace() + ".add";
		if ((entity instanceof BaseModel)) {
			BaseModel baseModel = (BaseModel) entity;
			if (baseModel.getOperTime() == null) {
				baseModel.setOperTime(new Date());
			}

//			String employeeId = ContextUtil.getEmployeeId();
//			if (!StringUtils.isEmpty(employeeId)) {
//				baseModel.setOperId(employeeId);
//			}
		}
		return getSqlSessionTemplate().insert(addStatement, entity);
	}

	public int add(String sqlKey, Object entity) {
		String addStatement = getNamespace() + "." + sqlKey;
		if ((entity instanceof BaseModel)) {
			BaseModel baseModel = (BaseModel) entity;
			if (baseModel.getOperTime() == null) {
				baseModel.setOperTime(new Date());
			}

//			String employeeId = ContextUtil.getEmployeeId();
//			if (!StringUtils.isEmpty(employeeId)) {
//				baseModel.setOperId(employeeId);
//			}
		}

		return getSqlSessionTemplate().insert(addStatement, entity);
	}

	public int update(Object entity) {
		String updStatement = getNamespace() + ".update";
		if ((entity instanceof BaseModel)) {
			BaseModel baseModel = (BaseModel) entity;
			baseModel.setOperTime(new Date());

//			String employeeId = ContextUtil.getEmployeeId();
//			if (!StringUtils.isEmpty(employeeId)) {
//				baseModel.setOperId(employeeId);
//			}
		}

		return getSqlSessionTemplate().update(updStatement, entity);
	}

	public int update(String sqlKey, Object params) {
		String updStatement = getNamespace() + "." + sqlKey;
		int affectCount = getSqlSessionTemplate().update(updStatement, params);
		return affectCount;
	}

	protected abstract String getNamespace();

	public String getStatement(String id) {
		String statement = getNamespace() + "." + id;
		return statement;
	}

	/**
	 * 全路径namespace.sqlkey访问
	 * 
	 * @param statementWithNamespace
	 * @param params
	 *            任意 pojo(可为空)
	 * @param pageBean
	 *            分页参数(可为空)
	 * @return
	 * @author jack 2017年4月25日 上午1:40:10
	 */
	protected List getList(String statementWithNamespace, Object params, PageBean pageBean) {
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}

		if (pageBean == null) {
			return getList(statementWithNamespace, params);
		}

		// Map filters = new HashMap();
		// if (params != null) {
		// if ((params instanceof Map)) {
		// filters.putAll((Map) params);
		// } else {
		// Map parameterObject = BeanUtils.describe(params);
		// filters.putAll(parameterObject);
		// }
		// }

		if (pageBean.isShowTotal()) {
			IbatisSql ibatisSql = getIbatisSql(statementWithNamespace, params);
			String sqlCount = this.jdbcDao.getCountSql(ibatisSql.getSql());
			// Long totalCount;
			int totalCount = this.jdbcDao.getJdbcTemplate().queryForObject(sqlCount, ibatisSql.getParameters(), int.class);
					// queryForInt(sqlCount, ibatisSql.getParameters());
			pageBean.setTotalCount(totalCount);
		}
		return getSqlSessionTemplate().selectList(statementWithNamespace, params, pageBean.getFirst(),
				pageBean.getPageSize());
	}

	/**
	 * 全路径namespace.sqlkey访问
	 * 
	 * @param statementWithNamespace
	 * @param params
	 *            任意
	 * @return
	 * @author jack 2017年4月25日 上午1:39:55
	 */
	protected List getList(String statementWithNamespace, Object params) {
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().selectList(statementWithNamespace, params);

		// Map filters = new HashMap();
		// if (params != null) {
		// if ((params instanceof Map)) {
		// filters.putAll((Map) params);
		// } else {
		// Map parameterObject = BeanUtils.describe(params);
		// filters.putAll(parameterObject);
		// }
		// }
		//
		// if (this.log.isDebugEnabled()) {
		// IbatisSql ibatisSql = getIbatisSql(statementWithNamespace, filters);
		// this.log.debug(ibatisSql.getSql());
		// }
		// List list =
		// getSqlSessionTemplate().selectList(statementWithNamespace, filters);
	}

	/**
	 * 全路径namespace.sqlkey访问
	 * 
	 * @param statementWithNamespace
	 * @param queryFilter
	 *            查询及分页参数
	 * @return
	 * @author jack 2017年4月25日 上午1:39:08
	 */
	protected List getList(String statementWithNamespace, QueryFilter queryFilter) {
		List list = null;
		PageBean pageBean = queryFilter.getPageBean();
		Object filters = queryFilter.getFilters();
		if (pageBean != null)
			list = getList(statementWithNamespace, queryFilter.getFilters(), pageBean);
		else {
			list = getList(statementWithNamespace, filters);
		}
		return list;
	}

	public List getAll(Map params) {
		String statementName = getNamespace() + ".getAll";
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().selectList(statementName, params);
	}

	public List getAll(Object params) {
		String statementName = getNamespace() + ".getAll";
		if (BeanUtils.isEmpty(params)) {
			params = null;
		}
		return getSqlSessionTemplate().selectList(statementName, params);
	}

	public List getAll() {
		String statementName = getNamespace() + ".getAll";
		// 修改这里让mybatis直接执行拼接好的sql语句，而不用将在mapper中写sql语句。动态拼接
		
		
		return getSqlSessionTemplate().selectList(statementName, null);
	}

	public List getAll(QueryFilter queryFilter) {
		String statementName = getNamespace() + ".getAll";
		List list = getList(statementName, queryFilter);
		return list;
	}

	public int insert(String sqlKey, Object params) {
		String updStatement = getNamespace() + "." + sqlKey;
		int affectCount = getSqlSessionTemplate().insert(updStatement, params);
		return affectCount;
	}

	static enum SortBy {
		ASC, DESC;
	}
	
}
