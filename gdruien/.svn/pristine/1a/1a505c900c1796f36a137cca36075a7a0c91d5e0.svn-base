package com.rekj.core.web.query.rule.impl;

import com.rekj.core.web.query.rule.ISingleScript;

public class SingleScriptFactory {
	public static final int OPT_TYPE_NUMBER = 1;
	public static final int OPT_TYPE_STRING = 2;
	public static final int OPT_TYPE_DATE = 3;
	public static final int OPT_TYPE_DIC = 4;
	public static final int OPT_TYPE_SELECTOR = 5;

	public static ISingleScript getQueryScript(Integer optType) {
		switch (optType) {
		case 1:
		case 3:
			return new NumberScript();
		case 2:
		case 4:
			return new StringScript();
		case 5:
			return new InScript();
		}
		return new NumberScript();
	}
}
