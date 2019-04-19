/**  
 * 版本信息: version 0.5
 * 创建日期: 2017年6月29日
 * Copyright ©2017 中科云尚(phd91.com) Inc. All Rights Reserved。
 * 
 * 描述:  TODO
 * 作者:  jack
 * 修订历史:  2017年6月29日 上午12:31:21 初始创建  
 */ 
package com.rekj.core.service;

import com.rekj.core.util.BeanUtils;

/**
 * 
 * @author      jack
 * @date        2017年6月29日 上午12:31:21 
 */
public class BaseManager {
	
	public static final String OK = "ok"; // 成功
	public static final String NG = "ng"; // 失败
	
	public static final String YES = "1";
	public static final String NO = "0";
	
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
