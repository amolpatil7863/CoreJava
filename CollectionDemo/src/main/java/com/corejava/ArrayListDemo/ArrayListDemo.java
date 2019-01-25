package com.corejava.ArrayListDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>(10);
		for (int i = 0; i < 50000; i++) {
			list.add(new Employee("Steven",i+1,"AUS"));
		}
		
		System.out.println("size:-"+list.size());
		
		
		
		long sTime=System.currentTimeMillis();
		
		for (Employee employee : list) {
			
//			System.out.println(employee);
		}
		long eTime=System.currentTimeMillis();
		System.out.println("USIN LOOP:"+(eTime-sTime));
//		System.out.println(":::"+list.get(7));
		
//		HashSet<E>
		
		long sTime1=System.currentTimeMillis();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		iterator.next();
			
		}
		long eTime1=System.currentTimeMillis();
		System.out.println("USIN Iterator:"+(eTime1-sTime1));
		
		 ListIterator iterator1 = list.listIterator(); 
		 

//		Comparable<T>
//		Comparator<T>
	}
}
