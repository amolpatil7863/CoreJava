package com.corejava.ExceptionHandllingDemo;

public class CustomException extends Exception{

	public CustomException(String str) {
		super();
	}
	
	public static void main(String[] args) {
		try
        { 
            // Throw an object of user defined exception 
            throw new CustomException("GeeksGeeks"); 
        } 
        catch (CustomException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
	}

}
