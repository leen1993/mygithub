package com.rekj.core.web.query.rule.impl;

import com.rekj.core.web.query.entity.JudgeScope;
import com.rekj.core.web.query.rule.IScopeScript;
import com.rekj.core.web.query.rule.ISingleScript;

public class ScopeScript implements IScopeScript {
	public String getSQL(Integer optType, JudgeScope judgeScope) {
		StringBuilder sb = new StringBuilder();

		ISingleScript queryScript = SingleScriptFactory.getQueryScript(optType);

		String scriptBegin = queryScript.getSQL(judgeScope.getBeginJudge());

		String scriptEnd = queryScript.getSQL(judgeScope.getEndJudge());

		sb.append(" (").append(scriptBegin).append(" ")
				.append(judgeScope.getRelation()).append(" ").append(scriptEnd)
				.append(") ");

		return sb.toString();
	}
}
