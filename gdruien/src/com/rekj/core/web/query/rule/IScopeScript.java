package com.rekj.core.web.query.rule;

import com.rekj.core.web.query.entity.JudgeScope;

public abstract interface IScopeScript {
	public abstract String getSQL(Integer paramInteger,
			JudgeScope paramJudgeScope);
}
