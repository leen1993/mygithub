package com.een.cn.util;

public class ArrayUtil {
	
	public static String join(String[] arr, String joinStr) {
		StringBuffer result = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
        	result.append(arr[i]);
        	if(i < arr.length - 1) {
        		result.append(joinStr);
        	}
		}
		return result.toString();
	}
}
