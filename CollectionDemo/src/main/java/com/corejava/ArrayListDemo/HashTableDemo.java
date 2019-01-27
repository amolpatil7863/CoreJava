package com.corejava.ArrayListDemo;

import java.util.Hashtable;

public class HashTableDemo {

	public HashTableDemo() {
	}

	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable=new Hashtable<String, Integer>();
		hashTable.put("one", 1);
//		hashTable.put(null,7);
		hashTable.put("two", 2);
		hashTable.put("two", 3);
		/*try{
		hashTable.put("three", null);
		
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
		System.out.println(hashTable);
		
	
		
	}

}
