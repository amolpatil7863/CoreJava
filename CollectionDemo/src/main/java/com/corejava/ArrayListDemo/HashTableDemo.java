package com.corejava.ArrayListDemo;

import java.util.Hashtable;

public class HashTableDemo {

	public HashTableDemo() {
	}

	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable=new Hashtable<String, Integer>();
		hashTable.put("one", 1);
		hashTable.put("one", 2);
		System.out.println(hashTable.get("one"));
	}

}
