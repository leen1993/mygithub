/**  
 * 版本信息: version 0.5
 * 创建日期: 2017年6月29日
 * Copyright ©2017 中科云尚(phd91.com) Inc. All Rights Reserved。
 * 
 * 描述:  身份证工具类
 * 作者:  jack
 * 修订历史:  2017年6月29日 上午3:08:16 初始创建  
 */ 
package com.rekj.core.util;

/**
 * 身份证工具类
 * 
 * @author      jack
 * @date        2017年6月29日 上午3:08:16 
 */
public class IdCardUtils {
	
	/**
	 * 15位身份证转18位
	 * @param identityNO
	 * @return 
	 * @author jack  2017年5月9日 上午12:17:14
	 */
	public static String to18IdentityNo(String identityNo) {
		String result;
		if (identityNo.length() != 15) {
			result = identityNo;
		} else {
			int num = 0;
			int[] array = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };

			String text = "10X98765432";
			String text2 = "";
			try {
				text2 = identityNo.substring(0, 6);
				text2 += "19";
				text2 += identityNo.substring(6, 9);
				for (int i = 0; i < 17; i++) {
					num += Integer.parseInt(text2.substring(i, 1)) * array[i];
				}
				int startIndex = num % 11;
				text2 += text.substring(startIndex, 1);
			} catch (Exception e) {
				result = identityNo;
				return result;
			}
			result = text2;
		}
		return result;
	}
	
}
