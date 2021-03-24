package com.pavan.lld.cache;

public class CacheMain {

	public static void main(String[] args) {
		ICache icache = CacheFactory.getInstance(4, EvictionStrategy.LRU);
		icache.put(1,"value1");
		icache.put(2,"value2");
		icache.put(3,"value3");
		icache.put(4,"value4");
		icache.put(5,"value5");
		icache.put(6,"value6");
		icache.put(7,"value7");
		System.out.println(icache.toString());
		System.out.println(icache.get(5));
		icache.put(1,"value8");
		System.out.println(icache.toString());
	}

}
