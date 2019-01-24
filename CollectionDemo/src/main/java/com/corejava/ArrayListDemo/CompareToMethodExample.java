package com.corejava.ArrayListDemo;

public class CompareToMethodExample {

	public CompareToMethodExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		   String str1 = "a";
	       String str2 = "A";
	       String str3 = "String method tutorial";
	       
	       int no=str1.compareTo(str2);
	       System.out.println(no);
	       
	      char[] char1= str1.toCharArray();
	      for (char c : char1) {
			System.out.println("str1:" +(int) c);
		}
	      
	      
	      char[] char2= str2.toCharArray();
	      for (char c : char2) {
			System.out.println("str2:" +(int) c);
		}
	      
	      
	      Integer i1=new Integer(50);
	      Integer i2=new Integer(30);
	       
	       
	     System.out.println("----"+i1.compareTo(i2));
	      
	       
	}

}
