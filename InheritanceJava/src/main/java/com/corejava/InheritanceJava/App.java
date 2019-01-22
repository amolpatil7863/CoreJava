package com.corejava.InheritanceJava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//normal way calling using child class object
    	Sony sony=new Sony();
    	sony.play();
    	
    	
    	//calling only parent class methods
    	System.out.println("Calling only parent");
    	Music music=new Music();
    	music.play();
    	
    	System.out.println("Taking reference of parent :- ");
    	//taking reference of parent class 
    	Music m=new Sony();
    	m.play();
    	
    	
    	//Co-orient return type
    	m.show();
    	System.out.println(m.calc());
    	try{
    	Object i = Integer.valueOf(42);
    	String s = (String)i;  
    	}catch(ClassCastException e){
    		System.out.println("ClassCastException:- "+e);
    	}
    	
    	
      }
}
