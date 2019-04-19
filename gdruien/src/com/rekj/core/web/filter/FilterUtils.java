package com.rekj.core.web.filter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.rekj.core.util.StringUtil;
import com.rekj.core.util.TimeUtil;

public class FilterUtils {
	private static Object getObjValue(String type, String paramValue) {
		Object value = null;

		if ("S".equals(type)) {
			value = paramValue;
		} else if ("SL".equals(type)) {
			if (!StringUtils.isEmpty(paramValue)) {
				value = new StringBuilder().append("%").append(paramValue)
						.append("%").toString();
			} else {
				value = "";
			}
		} else if ("SLR".equals(type)) {
			if (!StringUtils.isEmpty(paramValue)) {
				value = new StringBuilder().append(paramValue).append("%")
						.toString();
			} else {
				value = "";
			}
		} else if ("SLL".equals(type)) {
			value = new StringBuilder().append("%").append(paramValue)
					.toString();
		} else if ("SUPL".equals(type)) {
			value = new StringBuilder().append("%")
					.append(paramValue.toUpperCase()).append("%").toString();
		} else if ("SUPLR".equals(type)) {
			value = new StringBuilder().append(paramValue.toUpperCase())
					.append("%").toString();
		} else if ("SUPLL".equals(type)) {
			value = new StringBuilder().append("%")
					.append(paramValue.toUpperCase()).toString();
		} else if ("SLOL".equals(type)) {
			value = new StringBuilder().append("%")
					.append(paramValue.toLowerCase()).append("%").toString();
		} else if ("SLOLR".equals(type)) {
			value = new StringBuilder().append(paramValue.toLowerCase())
					.append("%").toString();
		} else if ("SLOLL".equals(type)) {
			value = new StringBuilder().append("%")
					.append(paramValue.toLowerCase()).toString();
		} else if ("L".equals(type)) {
			value = new Long(paramValue);
		} else if ("N".equals(type))
			value = new Integer(paramValue);
		else if ("DB".equals(type)) {
			value = new Double(paramValue);
		} else if ("BD".equals(type)) {
			value = new BigDecimal(paramValue);
		} else if ("FT".equals(type)) {
			value = new Float(paramValue);
		} else if ("SN".equals(type)) {
			value = new Short(paramValue);
		} else if ("DL".equals(type)) {
			value = TimeUtil.convertString(paramValue, "yyyy-MM-dd");
		} else if ("DG".equals(type)) {
			value = TimeUtil.getNextDays(
					TimeUtil.convertString(paramValue, "yyyy-MM-dd"), 1);
		} else {
			value = paramValue;
		}
		return value;
	}

	private static Object[] getObjValue(String type, String[] value) {
		Object[] aryObj = new Object[value.length];
		for (int i = 0; i < aryObj.length; i++) {
			String v = "";
			if (value[i] != null)
				v = value[i].toString();
			aryObj[i] = getObjValue(type, v);
		}
		return aryObj;
	}

	private static void addParameter(String key, String[] values,
			Map<String, Object> map) {
		String[] aryParaKey = key.split("_");
		if (aryParaKey.length < 3)
			return;
		String paraName = key.substring(2, key.lastIndexOf("_"));
		String type = key.substring(key.lastIndexOf("_") + 1);
		if (values.length == 1) {
			String value = values[0].trim();
			if (value == null) {
				value = "";
			}
			try {
				if (value.indexOf("_") != -1) {
					value = value.replaceAll("_", "|_");
				}
				Object obj = getObjValue(type, value);
				map.put(paraName, obj);
			} catch (Exception e) {
			}
		} else {
			Object[] aryObj = getObjValue(type, values);
			map.put(paraName, aryObj);
		}
	}

	public static Map<String, Object> getFiltersMap(String[] conditions) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < conditions.length; i++) {
			String[] array = conditions[i].split("=");
			if (array.length != 2)
				continue;
			String key = array[0];
			String[] values = new String[] { array[1] };
			if ((values.length > 0)) {
				if (key.startsWith("Q_")) {
					addParameter(key, values, map);
				} else if (values.length == 1) {
					String val = values[0].trim();
					if (StringUtil.isNotEmpty(val))
						map.put(key, values[0].trim());
				} else {
					map.put(key, values);
				}
			}
		}
		return map;
	}
}
