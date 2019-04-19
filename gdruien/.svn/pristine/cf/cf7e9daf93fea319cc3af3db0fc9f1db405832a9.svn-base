/**  
 * 版本信息: version 0.5
 * 创建日期: 2017年3月5日
 * Copyright ©2017 中科云尚(phd91.com) Inc. All Rights Reserved。
 * 
 * 描述:  无密码加密处理
 * 作者:  yunqing
 * 修订历史:  2017年3月5日 下午11:53:22 初始创建  
 */ 
package com.rekj.core.web.security;

import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;

/**
 * 
 * @author      yunqing
 * @date        2017年3月5日 下午11:53:22 
 */
public class DummyPasswordEncoder extends MessageDigestPasswordEncoder {

	public DummyPasswordEncoder() {
		super("sha-256");
	}
	
/*	public DummyPasswordEncoder(String algorithm) {
		super(algorithm);
	}*/

	public String encodePassword(String rawPass, Object salt) {
		return rawPass;
	}
}
