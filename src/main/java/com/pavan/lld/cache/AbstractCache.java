package com.pavan.lld.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class AbstractCache implements ICache {

	int cacheSize;
	Map map;
	LinkedList list;

	public AbstractCache(int cacheSize) {
		this.cacheSize = cacheSize;
		map = new HashMap(cacheSize);
		list = new LinkedList();
	}

	public abstract void put(Object kay, Object value);

	public abstract Object get(Object kay);

	public void removeLast() {
		Object key = list.removeLast();
		map.remove(key);
	}

	@Override
	public String toString() {
		return "AbstractCache [map=" + map + ", list=" + list + "]";
	}

}
