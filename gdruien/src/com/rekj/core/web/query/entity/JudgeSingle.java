package com.rekj.core.web.query.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class JudgeSingle {
	protected String fieldName;
	protected String compare;
	protected String value;

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getCompare() {
		return this.compare;
	}

	public void setCompare(String compare) {
		this.compare = compare;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return new ToStringBuilder(this).append("fieldName", this.fieldName)
				.append("compare", this.compare).append("value", this.value)
				.toString();
	}
}
