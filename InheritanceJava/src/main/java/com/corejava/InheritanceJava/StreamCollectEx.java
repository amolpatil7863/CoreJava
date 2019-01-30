package com.corejava.InheritanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectEx {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Nataraja G", "Accounts", 8000));
		empList.add(new Employee("Nagesh Y", "Admin", 15000));
		empList.add(new Employee("Vasu V", "Security", 2500));
		empList.add(new Employee("Amar", "Entertainment", 12500));
		
		List<Employee> filteredList =  empList.stream().filter(emp->emp.getSalary() > 10000).collect(Collectors.toList());
		
//		filteredList.forEach();
//		filteredList.forEach(System.out::println);
//		System.out.println("Size:- "+filteredList.size());
		System.out.println("ForEach Method:-");
		
		filteredList.forEach(p->System.out.println(p));
		
 
		
		
		
		
	}
}