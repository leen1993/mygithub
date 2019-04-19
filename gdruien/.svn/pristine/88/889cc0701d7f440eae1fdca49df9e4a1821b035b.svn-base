package com.rekj.core.web;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 前后端通讯接口
 * 
 * @author      jack
 * @date        2017年5月9日 下午12:58:11
 */
public class ResultMessage {
	
	public static final int OK = 1;
	
	public static final int NG = 0;
	
	private int result = OK;
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	private String message = "";

	// 传递给页面的对象
	private Object tag;

	public ResultMessage() {
	}

	public ResultMessage(boolean success, String message) {
		this.result = success ? OK : NG;
		this.message = message;
	}
	
	public void ok() {
		this.result = OK;
	}
	
	public void failure() {
		this.result = NG;
	}

	public Object getTag() {
		return tag;
	}

	public void setTag(Object tag) {
		this.tag = tag;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		Map map = new HashMap();
		map.put("result", this.result);
		map.put("message", this.message);
		return JSONObject.toJSONString(map);
	}
}
