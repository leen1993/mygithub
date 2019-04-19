package com.rekj.core.cache;

public abstract interface ICache {
	public abstract void add(String paramString, Object paramObject,
			int paramInt);

	public abstract void add(String paramString, Object paramObject);

	public abstract void delByKey(String paramString);

	public abstract void clearAll();

	public abstract Object getByKey(String paramString);

	public abstract boolean containKey(String paramString);
}
