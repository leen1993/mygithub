package com.rekj.core.db;

import com.rekj.core.util.BeanUtils;

/**
 * 基础数据库访问
 * 
 * @author      jack
 * @date        2017年6月30日 上午3:24:17
 */
public abstract class BaseDao extends GenericDao {
	
	/**
	 * 通用保存
	 * 
	 * @param entity 实体,可以设置复合主键
	 * @return 
	 * @author jack  2017年6月30日 上午3:35:26 
	 */
	public Object save(Object entity) {
		Object that = this.getById(entity);
		if (that == null) {
			this.add(entity);
		} else {
			this.update(entity);
		}
		return "ok";
	}
	
	/**
	 * 查找容器bean
	 * 
	 * @param clazz
	 * @return 
	 * @author jack  2017年6月29日 上午12:33:17
	 */
	public <T> T getBean(Class<T> clazz) {
		return (T)BeanUtils.getBean(clazz);
	}
	
}
