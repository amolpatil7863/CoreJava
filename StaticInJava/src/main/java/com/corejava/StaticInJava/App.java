package com.corejava.StaticInJava;


public class App 
{
	 static int a=10; //static variable
	 int ss;
	static{	//execuated first when class is loaded in memory
		System.out.println("Static Block:-"+a);
		
	}
	
	public static int count(int c){      //static methods only access static member directly.
										 //Access Non static member through object .
		App a12=new App();
		a12.ss++; 
		c++;
		return c;
		
	}
    public static void main( String[] args )
    {
    	App a1=new App();
    	System.out.println("Static variables:-"+a1.a);
    	App a2=new App();
    	System.out.println("Static variables:-"+a2.a);
    	App a3=new App();
    	System.out.println("Static variables:-"+a3.a);
    	System.out.println(App.count(1));
    }
}
