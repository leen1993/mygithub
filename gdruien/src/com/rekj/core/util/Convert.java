package com.rekj.core.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

/**
 * 数据类型转换
 * 
 * @author jack
 * @date 2017年6月29日 上午4:26:57
 */
public final class Convert {

	/**
	 * 
	 * @param v
	 *            数值
	 * @param decison
	 *            精度
	 * @return
	 * @author jack 2017年6月29日 上午4:29:10
	 */
	public static double round(double v, int decison) {
		if (decison == 0) {
			return Math.round(v);
		} else {
			return new BigDecimal(v).setScale(decison, BigDecimal.ROUND_HALF_UP).doubleValue();	
		}
	}

	public static double toDouble(Object v) {
		if (v != null) {
			try {
				return Double.parseDouble(v.toString());
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public static long toLong(Object v) {
		if (v != null) {
			try {
				return Long.parseLong(v.toString());
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public static int toInt(Object v) {
		if (v != null) {
			try {
				return Integer.parseInt(v.toString());
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public static String toUTF8(String v) {
		try {
			return new String(v.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			return v;
		}
	}

	public static String toGBK(String v) {
		try {
			return new String(v.getBytes("GBK"));
		} catch (UnsupportedEncodingException e) {
			return v;
		}
	}

	public static String toGB2312(String v) {
		try {
			return new String(v.getBytes("GB2312"));
		} catch (UnsupportedEncodingException e) {
			return v;
		}
	}

}
