package com.corejava.ArrayListDemo;

import java.util.LinkedHashMap;

public class LinkedHashedMap {

	public LinkedHashedMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashedMap=new LinkedHashMap<String, Integer>();
		linkedHashedMap.put("one", 1);
		linkedHashedMap.put("one", 1);
		linkedHashedMap.put("one", 1);
		linkedHashedMap.put(null, 1);
		System.out.println(linkedHashedMap);
	}
}
