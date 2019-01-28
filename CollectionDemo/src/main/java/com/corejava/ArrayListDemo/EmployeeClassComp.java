package com.corejava.ArrayListDemo;

import java.util.Comparator;

public class EmployeeClassComp implements Comparator<Employee> {

	public EmployeeClassComp() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getId()>o2.getId()) {
			return 1;
		}else if (o1.getId()>o2.getId()) {
			return -1;
		}else{
			return 0;
		}
		
//		System.gc();
		
//		return 0;
	}
//Comparable<T>
	
	
}
