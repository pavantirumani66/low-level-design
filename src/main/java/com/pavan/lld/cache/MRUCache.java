package com.pavan.lld.cache;

public class MRUCache extends AbstractCache {

	public MRUCache(int cacheSize) {
		super(cacheSize);
	}

	@Override
	public void put(Object key, Object value) {
		if (list.size() == cacheSize) {
			removeLast();
		}
		list.addLast(key);
		map.put(key, value);
	}

	@Override
	public Object get(Object key) {
		boolean res = list.remove(key);
		if(res) {
			list.addLast(key);
			return map.get(key);
		}
		return null;
	}

}
