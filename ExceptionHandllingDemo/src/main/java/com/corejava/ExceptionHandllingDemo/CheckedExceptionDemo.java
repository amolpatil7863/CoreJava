package com.corejava.ExceptionHandllingDemo;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		/* FileReader file = new FileReader("C:\\test\\a.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	          
	        // Print first 3 lines of file "C:\test\a.txt" 
	        for (int counter = 0; counter < 3; counter++)  
	            System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); */
		
		
		
		try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	}

}
