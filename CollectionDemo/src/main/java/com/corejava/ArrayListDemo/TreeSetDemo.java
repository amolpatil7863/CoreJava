package com.corejava.ArrayListDemo;

import java.util.TreeSet;

public class TreeSetDemo{

	public TreeSetDemo() {

	}

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>(); 
		  
        // Elements are added using add() method 
		
		
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
        try {
        	ts1.add(null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
//        ts1.add(null);
        ts1.add("C"); 
  
        System.out.println(ts1); 
	}

	
}
