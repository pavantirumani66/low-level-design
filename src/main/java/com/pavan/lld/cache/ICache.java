package com.pavan.lld.cache;

public interface ICache {
	
	public void put(Object kay, Object value);

	public Object get(Object kay);
	
}
