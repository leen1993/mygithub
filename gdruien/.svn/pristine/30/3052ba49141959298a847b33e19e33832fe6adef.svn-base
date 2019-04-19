package com.rekj.core.util;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.rekj.core.web.util.RequestUtil;

public class ImportExcelUtil {
	/**
	 * 
	 * 确定这个session中是否有excel导入的变量
	 * 
	 * @param session
	 *            ：需要判断的session
	 * @return：是否存在文件导入的变量
	 */
	public static boolean isImportExcel(HttpSession session) {
		if (session.getAttribute("___import_status") != null) {
			return true;
		}
		if (session.getAttribute("___import_percent") != null) {
			return true;
		}
		if (session.getAttribute("___import_currentNo") != null) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * 初始化excel上传的变量，并记录在session中
	 * 
	 * @param session
	 *            ：需要初始化的session
	 */
	public static void initImportExcelStatus(HttpSession session) {
		session.setAttribute("___import_status", "run");
		session.setAttribute("___import_percent", "0");
		session.setAttribute("___import_currentNo", "0");
	}

	/**
	 * 
	 * 在session设置excel上传的状态
	 * 
	 * @param session
	 *            ：需要设置状态的session
	 * @param status
	 *            ：excel上传的状态，包括"run"
	 * @param total
	 *            ：excel文件总条目
	 * @param number
	 *            ：已将导入的文件条目
	 * @param currentNo
	 *            ：现在刚刚完成的条目
	 */
	public static void setImportExcelRun(HttpSession session, String status, int total, int number, int currentNo) {
		try {
			System.out.println("sessionid===============" + session.getId());
			session.removeAttribute("___import_status");
			session.removeAttribute("___import_percent");
			session.removeAttribute("___import_currentNo");

			int percent = 0;
			if (number > 0) {
				percent = number * 100 / total;
			}
			session.setAttribute("___import_status", "run");
			session.setAttribute("___import_percent", String.valueOf(percent));
			session.setAttribute("___import_currentNo", String.valueOf(currentNo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * 在session中设置excel上传的状态为success
	 * 
	 * @param session：需要设置状态的session
	 */
	public static void setImportExcelSuccess(HttpSession session) {
		try {
			System.out.println("sessionid===============" + session.getId());
			session.removeAttribute("___import_status");
			session.removeAttribute("___import_percent");
			session.removeAttribute("___import_currentNo");
			session.setAttribute("___import_status", "success");
			session.setAttribute("___import_percent", "100");
			session.setAttribute("___import_currentNo", "100");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * 在session中设置excel上传的状态为failure
	 * 
	 * @param session：需要设置状态的session
	 */
	public static void setImportExcelFailure(HttpSession session,String errInfo,int currentNo) {
		try {
			System.out.println("sessionid===============" + session.getId());
			session.removeAttribute("___import_status");
			session.removeAttribute("___import_percent");
			session.removeAttribute("___import_currentNo");
			session.setAttribute("___import_status", "failure");
			session.setAttribute("___import_percent", errInfo);
			session.setAttribute("___import_currentNo", String.valueOf(currentNo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getFileName(HttpServletRequest request){
		return RequestUtil.getString(request, "excelFileName");
	}

	public static Map<String,Integer> getColumnsMap(HttpServletRequest request){
		final String[] mapping = RequestUtil.getStringAryByStr(request, "maps");
		Map<String, Integer> columnsMap = new HashMap<String, Integer>();
		for (String item : mapping) {
			String[] itemArray = item.split(":");
			if (itemArray.length == 2) {
				try {
					columnsMap.put(itemArray[1].replace("*", ""),Integer.valueOf(itemArray[0].trim()));
				} catch (Exception e) {
					// 忽略错误
				}
			}
		}
		return columnsMap;
	}
	
	public static  Set<Integer> getKeySet(HttpServletRequest request){
		final String[] key = RequestUtil.getStringAryByStr(request, "keys");
		Set<Integer> keySet=new HashSet<Integer>();
		for (String item:key){
			try {
				keySet.add(Integer.valueOf(item));
			} catch (Exception e) {
				// 忽略错误
			}
		}
		return keySet;
	}

}
