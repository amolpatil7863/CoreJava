/**
 * 
 */
package com.corejava.ArrayListDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author HP
 *
 */
public class HashSetDemo {

	/**
	 * 
	 */
	public HashSetDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("amol");
		hashSet.add("tanaji");
		hashSet.add("Tl");
		hashSet.add("Kp");

		
		
		System.out.println("HashSet:-"+hashSet);
		
	    Set<String> lhset = new HashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");
		System.out.println(lhset);
		
	}

}
