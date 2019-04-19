package com.rekj.core.web.query.rule.impl;

import com.rekj.core.web.query.entity.JudgeSingle;
import com.rekj.core.web.query.rule.ISingleScript;

public class NumberScript implements ISingleScript {
	public String getSQL(JudgeSingle judgeSingle) {
		StringBuilder sb = new StringBuilder();
		if ("1".equals(judgeSingle.getCompare()))
			sb.append(judgeSingle.getFieldName()).append("=")
					.append(judgeSingle.getValue());
		else if ("2".equals(judgeSingle.getCompare()))
			sb.append(judgeSingle.getFieldName()).append("!=")
					.append(judgeSingle.getValue());
		else if ("3".equals(judgeSingle.getCompare()))
			sb.append(judgeSingle.getFieldName()).append(">")
					.append(judgeSingle.getValue());
		else if ("4".equals(judgeSingle.getCompare()))
			sb.append(judgeSingle.getFieldName()).append(">=")
					.append(judgeSingle.getValue());
		else if ("5".equals(judgeSingle.getCompare()))
			sb.append(judgeSingle.getFieldName()).append("<")
					.append(judgeSingle.getValue());
		else if ("6".equals(judgeSingle.getCompare())) {
			sb.append(judgeSingle.getFieldName()).append("<=")
					.append(judgeSingle.getValue());
		}
		return sb.toString();
	}
}
