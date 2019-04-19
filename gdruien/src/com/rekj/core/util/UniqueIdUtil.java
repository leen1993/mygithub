package com.rekj.core.util;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 生成ID工具
 * 
 * @author      jack
 * @date        2017年5月7日 上午3:16:30
 */
public class UniqueIdUtil {
	
	private static JdbcTemplate jdbcTemplate;

	protected static Logger logger = LoggerFactory.getLogger(UniqueIdUtil.class);
	
	/**
	 * 初始化DB连接(专用的数据库连接)
	 *  
	 * @author jack  2017年5月7日 上午3:22:16
	 */
	private static void init() {
		try {
			if (jdbcTemplate == null) {
				jdbcTemplate = (JdbcTemplate) AppUtil.getBean("jdbcTemplateSN");
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
	}

	/**
	 * 生成序列
	 * @param seqName 序列名字
	 * @return 
	 * @author jack  2017年5月7日 上午3:22:56
	 */
	public static synchronized String genId(String seqName) {
		init();
		String sql = "select " + seqName + ".nextval from dual";
		long id = jdbcTemplate.queryForObject(sql, long.class);
		return id + "";
	}

	/**
	 * 生成GUID
	 * @return 
	 * @author jack  2017年5月7日 上午3:23:19
	 */
	public static final String getGuid() {
		UUID uuid = UUID.randomUUID();
		String tmp = uuid.toString();
		return tmp.replace("-", "").toUpperCase();
	}
}
