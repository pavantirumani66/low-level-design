package com.pavan.lld.cache;

public class CacheFactory {

	public static ICache getInstance(int cacheSize, EvictionStrategy strategy) {
		if (EvictionStrategy.LRU == strategy) {
			return new LRUCache(cacheSize);
		}
		if (EvictionStrategy.MRU == strategy) {
			return new MRUCache(cacheSize);
		} else {
			return null;
		}
	}
	
}
