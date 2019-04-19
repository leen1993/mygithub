package com.rekj.core.service;

import com.rekj.core.mybatis.BaseMyBatisDao.SqlSessionTemplate;
import com.rekj.core.util.BeanUtils;

/**
 * 基础服务框架
 * 
 * @author      jack
 * @date        2017年6月30日 上午4:53:43
 */
public abstract class BaseService extends GenericService {
	
	/**
	 * 处于技术规范及机构完整性，不建议使用，但在各别场合可以灵活考虑
	 * 
	 * @return
	 */
	public SqlSessionTemplate getSqlSessionTemplate() {
		return this.getEntityDao().getSqlSessionTemplate();
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