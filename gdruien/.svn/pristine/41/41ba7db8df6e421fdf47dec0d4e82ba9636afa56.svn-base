package com.rekj.core.web.query.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class JudgeScope extends JudgeSingle {
	private String compareEnd;
	private String valueEnd;
	private String relation;

	public JudgeSingle getBeginJudge() {
		JudgeSingle judge = new JudgeSingle();
		judge.setFieldName(this.fieldName);
		judge.setCompare(this.compare);
		judge.setValue(this.value);
		return judge;
	}

	public JudgeSingle getEndJudge() {
		JudgeSingle judge = new JudgeSingle();
		judge.setFieldName(this.fieldName);
		judge.setCompare(this.compareEnd);
		judge.setValue(this.valueEnd);
		return judge;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public void setCompareEnd(String compareEnd) {
		this.compareEnd = compareEnd;
	}

	public void setValueEnd(String valueEnd) {
		this.valueEnd = valueEnd;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getRelation() {
		return "AND";
	}

	public String toString() {
		return new ToStringBuilder(this).append("fieldName", this.fieldName)
				.append("compare", this.compare).append("value", this.value)
				.append("compareEnd", this.compareEnd)
				.append("valueEnd", this.valueEnd)
				.append("relation", this.relation).toString();
	}
}
