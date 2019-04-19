package com.rekj.core.util;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtil {
	public static Long[] convertArray(String[] aryStr) {
		if (ArrayUtils.isEmpty(aryStr))
			return ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
		Long[] aryLong = new Long[aryStr.length];
		for (int i = 0; i < aryStr.length; i++) {
			aryLong[i] = Long.parseLong(aryStr[i]);
		}
		return aryLong;
	}

	public static String[] convertArray(Long[] aryLong) {
		if (ArrayUtils.isEmpty(aryLong))
			return ArrayUtils.EMPTY_STRING_ARRAY;
		String[] aryStr = new String[aryLong.length];
		for (int i = 0; i < aryStr.length; i++) {
			aryStr[i] = aryStr[i];
		}
		return aryStr;
	}
	
	public static String join(String[] arr, String joinStr) {
		StringBuffer result = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
        	result.append(arr[i]);
        	if(i < arr.length - 1) {
        		result.append(".");
        	}
		}
		return result.toString();
	}
}
