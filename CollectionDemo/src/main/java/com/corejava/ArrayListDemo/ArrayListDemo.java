package com.corejava.ArrayListDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>(10);
		
		System.out.println("size:-"+list.size());
		for (int i = 0; i < 12; i++) {
			list.add(new Employee("Steven",i+1,"AUS"));
		}
		
		System.out.println("size:-"+list.size());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println(":::"+list.get(7));
		
//		HashSet<E>
		
		
		
	}
}
