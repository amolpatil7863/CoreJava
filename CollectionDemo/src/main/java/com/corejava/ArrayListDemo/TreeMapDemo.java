package com.corejava.ArrayListDemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public TreeMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		treeMap.put("k", 4);
		treeMap.put("one", 1);
		treeMap.put("two", 1);
		treeMap.put("three", 1);
		treeMap.put("ke", 4);
		treeMap.put("a", 4);
//		treeMap.put(null, 1);
		
		
		
		System.out.println(treeMap);
	}

}
