package com.rekj.core.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.rekj.core.mybatis.Dialect;
import com.rekj.core.page.PageBean;

public class JdbcDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private Dialect dialect;
	
	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getPageSql(String sql, Map paraMap, int currentPage, int pageSize, PageBean pageBean) {
		int offset = (currentPage - 1) * pageSize;
		return this.dialect.getLimitString(sql, offset, pageSize);
	}
	
	public String getCountSql(String sql) {
		return this.dialect.getCountSql(sql);
	}

	public List getPage(int currentPage, int pageSize, String sql, Map paraMap,
			PageBean pageBean) throws Exception {
		int offset = (currentPage - 1) * pageSize;
		String pageSql = this.dialect.getLimitString(sql, offset, pageSize);
		String totalSql = this.dialect.getCountSql(sql);
		List list = queryForList(pageSql, paraMap);
		int total = queryForInt(totalSql, paraMap);
		pageBean.setTotalCount(total);

		return list;
	}

	public List getPage(PageBean pageBean, String sql, RowMapper rowMap)
			throws Exception {
		int pageSize = pageBean.getPageSize();

		int offset = pageBean.getFirst();

		Map map = new HashMap();

		String pageSql = this.dialect.getLimitString(sql, offset, pageSize);
		String totalSql = this.dialect.getCountSql(sql);
		List list = queryForList(pageSql, map, rowMap);
		int total = queryForInt(totalSql, map);

		pageBean.setTotalCount(total);
		return list;
	}

	public <T> T getPage(String sql, ResultSetExtractor<T> rse,
			PageBean pageBean) throws Exception {
		int pageSize = pageBean.getPageSize();
		int offset = pageBean.getFirst();
		String pageSql = this.dialect.getLimitString(sql, offset, pageSize);
		String totalSql = this.dialect.getCountSql(sql);
		Object result = this.jdbcTemplate.query(pageSql, rse);

		int total = this.jdbcTemplate.queryForObject(totalSql, int.class);
		pageBean.setTotalCount(total);
		return (T) result;
	}

	public List queryForList(String sql, Map parameter, RowMapper rowMap) {
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(
				this.jdbcTemplate.getDataSource());
		return template.query(sql, parameter, rowMap);
	}

	public List queryForList(String sql, Map parameter) {
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(
				this.jdbcTemplate.getDataSource());
		return template.queryForList(sql, parameter);
	}

	public int queryForInt(String sql, Map parameter) {
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(
				this.jdbcTemplate.getDataSource());
		return template.queryForObject(sql, parameter, int.class);
	}

	public int update(String sql) {
		return this.jdbcTemplate.update(sql);
	}
}
