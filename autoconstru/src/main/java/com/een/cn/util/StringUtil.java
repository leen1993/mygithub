package com.een.cn.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	public static String escape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);

		for (int i = 0; i < src.length(); i++) {
			char j = src.charAt(i);

			if ((Character.isDigit(j)) || (Character.isLowerCase(j)) || (Character.isUpperCase(j))) {
				tmp.append(j);
			} else if (j < 'Ā') {
				tmp.append("%");
				if (j < '\020')
					tmp.append("0");
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}

	public static String replaceVariable(String template, Map<String, String> map) throws Exception {
		Pattern regex = Pattern.compile("\\{(.*?)\\}");
		Matcher regexMatcher = regex.matcher(template);
		while (regexMatcher.find()) {
			String key = regexMatcher.group(1);
			String toReplace = regexMatcher.group(0);
			String value = (String) map.get(key);
			if (value != null)
				template = template.replace(toReplace, value);
			else {
				throw new Exception(
						new StringBuilder().append("没有找到[").append(key).append("]对应的变量值，请检查表变量配置!").toString());
			}
		}
		return template;
	}

	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0;
		int pos = 0;

		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					char ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);

					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					char ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);

					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else if (pos == -1) {
				tmp.append(src.substring(lastPos));
				lastPos = src.length();
			} else {
				tmp.append(src.substring(lastPos, pos));
				lastPos = pos;
			}
		}

		return tmp.toString();
	}

	public static boolean isExist(String content, String begin, String end) {
		String tmp = content.toLowerCase();
		begin = begin.toLowerCase();
		end = end.toLowerCase();
		int beginIndex = tmp.indexOf(begin);
		int endIndex = tmp.indexOf(end);
		if ((beginIndex != -1) && (endIndex != -1) && (beginIndex < endIndex))
			return true;
		return false;
	}

	public static String trimLeft(String toTrim, String trimStr) {
		while (toTrim.startsWith(trimStr)) {
			toTrim = toTrim.substring(trimStr.length());
		}
		return toTrim;
	}

	public static String trimRight(String toTrim, String trimStr) {
		while (toTrim.endsWith(trimStr)) {
			toTrim = toTrim.substring(0, toTrim.length() - trimStr.length());
		}
		return toTrim;
	}

	public static String trim(String toTrim, String trimStr) {
		return trimRight(trimLeft(toTrim, trimStr), trimStr);
	}

	public static boolean isEmpty(String str) {
		if (str == null)
			return true;
		if (str.trim().equals(""))
			return true;
		return false;
	}

	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	public static String replaceVariable(String template, String repaceStr) {
		Pattern regex = Pattern.compile("\\{(.*?)\\}");
		Matcher regexMatcher = regex.matcher(template);
		if (regexMatcher.find()) {
			String toReplace = regexMatcher.group(0);
			template = template.replace(toReplace, repaceStr);
		}
		return template;
	}

	public static boolean isInteger(String s) {
		boolean rtn = validByRegex("^[-+]{0,1}\\d*$", s);
		return rtn;
	}

	public static boolean isEmail(String s) {
		boolean rtn = validByRegex("(\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)*", s);

		return rtn;
	}

	public static boolean isMobile(String s) {
		boolean rtn = validByRegex("^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\\d{8})$", s);

		return rtn;
	}

	public static boolean isPhone(String s) {
		boolean rtn = validByRegex("(0[0-9]{2,3}\\-)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?", s);

		return rtn;
	}

	public static boolean isZip(String s) {
		boolean rtn = validByRegex("^[0-9]{6}$", s);
		return rtn;
	}

	public static boolean isQq(String s) {
		boolean rtn = validByRegex("^[1-9]\\d{4,9}$", s);
		return rtn;
	}

	public static boolean isIp(String s) {
		boolean rtn = validByRegex(
				"^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", s);

		return rtn;
	}

	public static boolean isChinese(String s) {
		boolean rtn = validByRegex("^[一-龥]+$", s);
		return rtn;
	}

	public static boolean isChrNum(String s) {
		boolean rtn = validByRegex("^([a-zA-Z0-9]+)$", s);
		return rtn;
	}

	public static boolean isUrl(String url) {
		return validByRegex("(http://|https://)?([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?", url);
	}

	public static boolean validByRegex(String regex, String input) {
		Pattern p = Pattern.compile(regex, 2);
		Matcher regexMatcher = p.matcher(input);
		return regexMatcher.find();
	}

	public static boolean isNumeric(String str) {
		int i = str.length();
		do {
			i--;
			if (i < 0)
				return true;
		} while (Character.isDigit(str.charAt(i)));
		return false;
	}

	public static String makeFirstLetterUpperCase(String newStr) {
		if (newStr.length() == 0) {
			return newStr;
		}
		char[] oneChar = new char[1];
		oneChar[0] = newStr.charAt(0);
		String firstChar = new String(oneChar);
		return new StringBuilder().append(firstChar.toUpperCase()).append(newStr.substring(1)).toString();
	}

	public static String makeFirstLetterLowerCase(String newStr) {
		if (newStr.length() == 0) {
			return newStr;
		}
		char[] oneChar = new char[1];
		oneChar[0] = newStr.charAt(0);
		String firstChar = new String(oneChar);
		return new StringBuilder().append(firstChar.toLowerCase()).append(newStr.substring(1)).toString();
	}

	public static String formatParamMsg(String message, Object[] args) {
		for (int i = 0; i < args.length; i++) {
			message = message.replace(new StringBuilder().append("{").append(i).append("}").toString(),
					args[i].toString());
		}
		return message;
	}

	public static String formatParamMsg(String message, Map<String, ?> params) {
		if (params == null)
			return message;
		Iterator<String> keyIts = params.keySet().iterator();
		while (keyIts.hasNext()) {
			String key = (String) keyIts.next();
			Object val = params.get(key);
			if (val != null) {
				message = message.replace(new StringBuilder().append("${").append(key).append("}").toString(),
						val.toString());
			}
		}
		return message;
	}

	public static StringBuilder formatMsg(CharSequence msgWithFormat, boolean autoQuote, Object[] args) {
		int argsLen = args.length;
		boolean markFound = false;

		StringBuilder sb = new StringBuilder(msgWithFormat);

		if (argsLen > 0) {
			for (int i = 0; i < argsLen; i++) {
				String flag = new StringBuilder().append("%").append(i + 1).toString();
				int idx = sb.indexOf(flag);

				while (idx >= 0) {
					markFound = true;
					sb.replace(idx, idx + 2, toString(args[i], autoQuote));
					idx = sb.indexOf(flag);
				}
			}

			if ((args[(argsLen - 1)] instanceof Throwable)) {
				StringWriter sw = new StringWriter();
				((Throwable) args[(argsLen - 1)]).printStackTrace(new PrintWriter(sw));

				sb.append("\n").append(sw.toString());
			} else if ((argsLen == 1) && (!markFound)) {
				sb.append(args[(argsLen - 1)].toString());
			}
		}
		return sb;
	}

	public static StringBuilder formatMsg(String msgWithFormat, Object[] args) {
		return formatMsg(new StringBuilder(msgWithFormat), true, args);
	}

	public static String toString(Object obj, boolean autoQuote) {
		StringBuilder sb = new StringBuilder();
		if (obj == null) {
			sb.append("NULL");
		} else if ((obj instanceof Object[])) {
			for (int i = 0; i < ((Object[]) obj).length; i++) {
				sb.append(((Object[]) (Object[]) obj)[i]).append(", ");
			}
			if (sb.length() > 0)
				sb.delete(sb.length() - 2, sb.length());
		} else {
			sb.append(obj.toString());
		}

		if ((autoQuote) && (sb.length() > 0) && ((sb.charAt(0) != '[') || (sb.charAt(sb.length() - 1) != ']'))
				&& ((sb.charAt(0) != '{') || (sb.charAt(sb.length() - 1) != '}'))) {
			sb.insert(0, "[").append("]");
		}
		return sb.toString();
	}

	public static String returnSpace(String str) {
		String space = "";
		if (!str.isEmpty()) {
			String[] path = str.split("\\.");
			for (int i = 0; i < path.length - 1; i++) {
				space = new StringBuilder().append(space).append("&nbsp;&emsp;").toString();
			}
		}
		return space;
	}

	public static synchronized String encryptMd5(String inputStr) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(inputStr.getBytes());
			byte[] digest = md.digest();
			StringBuffer sb = new StringBuffer();
			for (byte b : digest) {
				sb.append(Integer.toHexString(b & 0xFF));
			}

			return sb.toString();
		} catch (Exception e) {
		}
		return null;
	}

	public static String getArrayAsString(List<String> arr) {
		if ((arr == null) || (arr.size() == 0))
			return "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.size(); i++) {
			if (i > 0)
				sb.append(",");
			sb.append((String) arr.get(i));
		}
		return sb.toString();
	}

	public static String getArrayAsString(String[] arr) {
		if ((arr == null) || (arr.length == 0))
			return "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0)
				sb.append("#");
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	public static String getSetAsString(Set<?> set) {
		if ((set == null) || (set.size() == 0))
			return "";
		StringBuffer sb = new StringBuffer();
		int i = 0;
		Iterator<?> it = set.iterator();
		while (it.hasNext()) {
			if (i++ > 0)
				sb.append(",");
			sb.append(it.next().toString());
		}
		return sb.toString();
	}

	public static String hangeToBig(double value) {
		char[] hunit = { '拾', '佰', '仟' };
		char[] vunit = { '万', '亿' };
		char[] digit = { 38646, '壹', 36144, '叁', 32902, '伍', 38470, '柒', '捌', '玖' };
		String zheng = "整";
		String jiao = "角";
		String fen = "分";
		char yuan = '圆';
		long midVal = (long) (value * 100.0D);
		String valStr = String.valueOf(midVal);
		String head = valStr.substring(0, valStr.length() - 2);
		int len = head.length();
		if (len > 12) {
			return "值过大";
		}
		String rail = valStr.substring(valStr.length() - 2);

		String prefix = "";
		String suffix = "";

		if (rail.equals("00"))
			suffix = zheng;
		else {
			suffix = new StringBuilder().append(digit[(rail.charAt(0) - '0')]).append(jiao)
					.append(digit[(rail.charAt(1) - '0')]).append(fen).toString();
		}

		char[] chDig = head.toCharArray();
		char zero = '0';
		byte zeroSerNum = 0;
		for (int i = 0; i < chDig.length; i++) {
			int idx = (chDig.length - i - 1) % 4;
			int vidx = (chDig.length - i - 1) / 4;
			if (chDig[i] == '0') {
				zeroSerNum = (byte) (zeroSerNum + 1);
				if (zero == '0') {
					zero = digit[0];
				} else if ((idx == 0) && (vidx > 0) && (zeroSerNum < 4)) {
					prefix = new StringBuilder().append(prefix).append(vunit[(vidx - 1)]).toString();
					zero = '0';
				}
			} else {
				zeroSerNum = 0;
				if (zero != '0') {
					prefix = new StringBuilder().append(prefix).append(zero).toString();
					zero = '0';
				}
				prefix = new StringBuilder().append(prefix).append(digit[(chDig[i] - '0')]).toString();
				if (idx > 0)
					prefix = new StringBuilder().append(prefix).append(hunit[(idx - 1)]).toString();
				if ((idx == 0) && (vidx > 0)) {
					prefix = new StringBuilder().append(prefix).append(vunit[(vidx - 1)]).toString();
				}
			}
		}
		if (prefix.length() > 0)
			prefix = new StringBuilder().append(prefix).append(yuan).toString();
		return new StringBuilder().append(prefix).append(suffix).toString();
	}

	public static String jsonUnescape(String str) {
		return str.replace("&quot;", "\"").replace("&nuot;", "\n");
	}

	public static String htmlEntityToString(String dataStr) {
		dataStr = dataStr.replace("&apos;", "'").replace("&quot;", "\"").replace("&gt;", ">").replace("&lt;", "<")
				.replace("&amp;", "&");

		int start = 0;
		int end = 0;
		StringBuffer buffer = new StringBuffer();

		while (start > -1) {
			int system = 10;
			if (start == 0) {
				int t = dataStr.indexOf("&#");
				if (start != t) {
					start = t;
				}
				if (start > 0) {
					buffer.append(dataStr.substring(0, start));
				}
			}
			end = dataStr.indexOf(";", start + 2);
			String charStr = "";
			if (end != -1) {
				charStr = dataStr.substring(start + 2, end);

				char s = charStr.charAt(0);
				if ((s == 'x') || (s == 'X')) {
					system = 16;
					charStr = charStr.substring(1);
				}
			}
			try {
				if (isNotEmpty(charStr)) {
					char letter = (char) Integer.parseInt(charStr, system);
					buffer.append(new Character(letter).toString());
				}

			} catch (NumberFormatException e) {
			}

			start = dataStr.indexOf("&#", end);
			if (start - end > 1) {
				buffer.append(dataStr.substring(end + 1, start));
			}

			if (start == -1) {
				int length = dataStr.length();
				if (end + 1 != length) {
					buffer.append(dataStr.substring(end + 1, length));
				}
			}
		}
		return buffer.toString();
	}

	public static String stringToHtmlEntity(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			switch (c) {
			case '\n':
				sb.append(c);
				break;
			case '<':
				sb.append("&lt;");
				break;
			case '>':
				sb.append("&gt;");
				break;
			case '&':
				sb.append("&amp;");
				break;
			case '\'':
				sb.append("&apos;");
				break;
			case '"':
				sb.append("&quot;");
				break;
			default:
				if ((c < ' ') || (c > '~')) {
					sb.append("&#x");
					sb.append(Integer.toString(c, 16));
					sb.append(';');
				} else {
					sb.append(c);
				}
				break;
			}
		}
		return sb.toString();
	}

	public static String encodingString(String str, String from, String to) {
		String result = str;
		try {
			result = new String(str.getBytes(from), to);
		} catch (Exception e) {
			result = str;
		}
		return result;
	}

	public static String comdify(String value) {
		DecimalFormat df = null;
		if (value.indexOf(".") > 0) {
			int i = value.length() - value.indexOf(".") - 1;
			switch (i) {
			case 0:
				df = new DecimalFormat("###,##0");
				break;
			case 1:
				df = new DecimalFormat("###,##0.0");
				break;
			case 2:
				df = new DecimalFormat("###,##0.00");
				break;
			case 3:
				df = new DecimalFormat("###,##0.000");
				break;
			case 4:
				df = new DecimalFormat("###,##0.0000");
				break;
			default:
				df = new DecimalFormat("###,##0.00000");
			}
		} else {
			df = new DecimalFormat("###,##0");
		}
		double number = 0.0D;
		try {
			number = Double.parseDouble(value);
		} catch (Exception e) {
			number = 0.0D;
		}
		return df.format(number);
	}

	public static String replaceNotVisable(String str) {
		char[] ary = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < ary.length; i++) {
			int c = ary[i];
			if (isViable(c)) {
				list.add(Character.valueOf((char) c));
			}
		}
		Object[] aryc = (Object[]) list.toArray();
		char[] arycc = new char[aryc.length];
		for (int i = 0; i < aryc.length; i++) {
			arycc[i] = ((Character) aryc[i]).charValue();
		}
		String out = new String(arycc);
		return out;
	}

	private static boolean isViable(int i) {
		if ((i == 0) || (i == 13) || ((i >= 9) && (i <= 10)) || ((i >= 11) && (i <= 12)) || ((i >= 28) && (i <= 126))
				|| ((i >= 19968) && (i <= 40869))) {
			return true;
		}
		return false;
	}

	public static String replaceAll(String toReplace, String replace, String replaceBy) {
		replaceBy = replaceBy.replaceAll("\\$", "\\\\\\$");
		return toReplace.replaceAll(replace, replaceBy);
	}

	public static String stringFormat2Json(String json) {
		StringBuilder sb = new StringBuilder();
		int size = json.length();
		for (int i = 0; i < size; i++) {
			char c = json.charAt(i);
			switch (c) {
			case '\b':
				sb.append("\\b");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			case '\013':
			default:
				sb.append(c);
			}
		}

		return sb.toString();
	}

	public static String getNumber(Object value, Object isShowComdify, Object decimalValue, Object coinValue) {
		if (value == null)
			return "";
		String val = value.toString();

		if (isShowComdify != null) {
			boolean result = Boolean.valueOf(isShowComdify.toString());
			Double douvalue = Double.parseDouble(val);
			DecimalFormat df = new DecimalFormat("");
			val = df.format(douvalue);
			if (!result) {
				val = val.replace(",", "");
			}
		}

		if (decimalValue != null) {
			int len = Integer.parseInt(decimalValue.toString());

			if (len > 0) {
				int idx = val.indexOf(".");
				if (idx == -1) {
					val = new StringBuilder().append(val).append(".").append(getZeroLen(len)).toString();
				} else {
					String intStr = val.substring(0, val.indexOf("."));
					String decimal = val.substring(val.indexOf(".") + 1);
					if (decimal.length() > len) {
						Double douvalue = Double.parseDouble(val.replace(",", ""));
						DecimalFormat df = new DecimalFormat("");
						df.setMaximumFractionDigits(len);
						String tmp = df.format(douvalue);
						if (tmp.indexOf(".") == -1) {
							val = new StringBuilder().append(intStr).append(".").append(getZeroLen(len)).toString();
						} else {
							decimal = tmp.substring(tmp.indexOf(".") + 1);
							val = new StringBuilder().append(intStr).append(".").append(decimal).toString();
						}
					} else if (decimal.length() < len) {
						int tmp = len - decimal.length();
						val = new StringBuilder().append(val).append(getZeroLen(tmp)).toString();
					}
				}
			}
		}
		if (coinValue != null) {
			val = new StringBuilder().append(coinValue.toString()).append(val).toString();
		}
		return val;
	}

	private static String getZeroLen(int len) {
		String str = "";
		for (int i = 0; i < len; i++) {
			str = new StringBuilder().append(str).append("0").toString();
		}
		return str;
	}

	public static int getCount(String str, int type) {
		int len = str.length();
		int chineseCount = 0;
		int letterCount = 0;
		int blankCount = 0;
		int numCount = 0;
		int otherCount = 0;
		for (int i = 0; i < len; i++) {
			char tem = str.charAt(i);
			Character.UnicodeBlock ub = Character.UnicodeBlock.of(tem);
			if (((tem > 'A') && (tem < 'Z')) || ((tem > 'a') && (tem < 'z')))
				letterCount++;
			else if (tem == ' ')
				blankCount++;
			else if ((tem > '0') && (tem < '9'))
				numCount++;
			else if ((ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS)
					|| (ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS)
					|| (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A)
					|| (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B)
					|| (ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION)
					|| (ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)
					|| (ub == Character.UnicodeBlock.GENERAL_PUNCTUATION)) {
				chineseCount++;
			} else
				otherCount++;
		}

		switch (type) {
		case -1:
			return chineseCount;
		case 0:
			return letterCount;
		case 1:
			return blankCount;
		case 2:
			return numCount;
		case 3:
			return otherCount;
		}
		return otherCount;
	}

	public static int getTotalSize(String str) {
		int chineseCount = getCount(str, -1);
		int letterCount = getCount(str, 0);
		int blankCount = getCount(str, 1);
		int numCount = getCount(str, 2);
		int otherCount = getCount(str, 3);
		return chineseCount + (letterCount + numCount) / 3 + blankCount / 4 + otherCount * 3 / 4;
	}

	public static String getUrl(String url, String params) {
		if (isEmpty(url))
			return url;
		if (url.indexOf("?") > 0) {
			if (isNotEmpty(params))
				url = new StringBuilder().append(url).append("&").append(params).toString();
			else
				url = new StringBuilder().append(url).append("?").append(params).toString();
		} else if (isNotEmpty(params))
			url = new StringBuilder().append(url).append("?").append(params).toString();
		return url;
	}

	public static String lineToHump(String str) {
		str = str.toLowerCase();
		Matcher matcher = Pattern.compile("_(\\w)").matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
