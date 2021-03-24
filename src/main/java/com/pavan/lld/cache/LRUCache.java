package com.pavan.lld.cache;

public class LRUCache extends AbstractCache {

	public LRUCache(int cacheSize) {
		super(cacheSize);
	}

	@Override
	public void put(Object key, Object value) {
		if(list.contains(key)) {
			list.remove(key);
		}
			if (list.size() == cacheSize) {
				removeLast();
			}
			list.addFirst(key);
			map.put(key, value);
	}

	@Override
	public Object get(Object key) {
		boolean res = list.remove(key);
		if (res) {
			list.addFirst(key);
			return map.get(key);
		}
		return null;
	}

}
