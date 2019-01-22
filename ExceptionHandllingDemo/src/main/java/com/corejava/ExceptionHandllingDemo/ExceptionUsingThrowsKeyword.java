package com.corejava.ExceptionHandllingDemo;

public class ExceptionUsingThrowsKeyword {

	public ExceptionUsingThrowsKeyword() {
	}
	
	static void fun()   
    { 
		try{
        System.out.println("Inside fun(). "); 
        throw new IllegalAccessException("demo"); 
		}catch(IllegalAccessException i){
			
		}
    } 
	public static void main(String[] args)  {
		/*try {
			fun();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		fun();
	}

}
