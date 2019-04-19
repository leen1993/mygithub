package com.een.cn.util;

import java.util.ArrayList;
import java.util.List;

import com.een.cn.pojo.Pojo;

public class PojoUtil {

	public static List<Pojo> copyList(List<Pojo> list) {
		List<Pojo> pojoList = new ArrayList<Pojo>();
		for (int i = 0; i < list.size(); i++) {
			Pojo pojo = (Pojo) list.get(i).clone();
			pojoList.add(pojo);
		}
		return pojoList;
	}
	
	/**
	 * 是否为特殊字， 保留字
	 * 
	 * @return
	 */
	public static String isHoldWord(String fieldName) {
		String holdWord = ConfigUtil.get("holdNames");
		String[] holds = holdWord.split(",");
		for (int i = 0; i < holds.length; i++) {
			if(fieldName.equals(holds[i])) {
				return "hold" + fieldName;
			}
		}
		return fieldName;
	}
	
	
	
}
