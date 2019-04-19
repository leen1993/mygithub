package com.rekj.core.web.query.entity;

public abstract class FieldTable {
	protected String table;
	protected boolean isMain = true;

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public boolean isMain() {
		return this.isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}
}
