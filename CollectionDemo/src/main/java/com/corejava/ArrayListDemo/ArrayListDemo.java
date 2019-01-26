package com.corejava.ArrayListDemo;

import java.util.ArrayList;
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
//		System.out.println("USIN LOOP:"+(eTime-sTime));

		
		long sTime1=System.currentTimeMillis();
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
		iterator.next();
			
		}
		long eTime1=System.currentTimeMillis();
		System.out.println("USING Iterator:"+(eTime1-sTime1));
		
		 ListIterator<Employee> iterator1 = list.listIterator(); 
		 
		 while(iterator1.hasPrevious()) {
			 System.out.println("Using ListIterator:- "+ iterator1.previous());
		 }

	}
}
