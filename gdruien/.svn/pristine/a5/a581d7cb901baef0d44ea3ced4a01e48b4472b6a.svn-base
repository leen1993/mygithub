/**
 * 
 */
package com.rekj.core.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源切换
 * @author yunqing
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	/**
	 * 自动查找datasource 
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DbContextHolder.getDbType();
	}

}
