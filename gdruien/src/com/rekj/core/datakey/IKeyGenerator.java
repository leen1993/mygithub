package com.rekj.core.datakey;

public abstract interface IKeyGenerator {
	public abstract Object nextId() throws Exception;

	public abstract void setAlias(String paramString);
}
