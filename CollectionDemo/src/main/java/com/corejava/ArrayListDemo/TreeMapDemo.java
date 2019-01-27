package com.corejava.ArrayListDemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public TreeMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
		treeMap.put(1, "one");
		treeMap.put(5, "five");
		treeMap.put(3, "three");
		treeMap.put(2, "two");
		treeMap.put(4, "four");
		treeMap.put(1, "sdivn");
		System.out.println(treeMap);
		
/*//		System.out.println(treeMap);
		TreeMap<Employee, Integer> treeMap1=new TreeMap<Employee, Integer>(new EmployeeClassComp());
		
		treeMap1.put(new Employee("amol", 1, "pune"), 1);
		treeMap1.put(new Employee("amol", 2, "pune"), 1);
		treeMap1.put(new Employee("amol", 3, "pune"), 1);
		treeMap1.put(new Employee("amol", 6, "pune"), 1);
		Employee e=null;*/
		
				
//		System.out.println(treeMap1);
	}
	
//Comparable<T>
}
