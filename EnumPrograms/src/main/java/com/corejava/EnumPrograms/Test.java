package com.corejava.EnumPrograms;

enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class Test 
{ 
     
    public static void main(String[] args) 
    { 
       System.out.println("Enum:- "+ Test.class);
       System.out.println(Runtime.getRuntime().totalMemory());
       
       
       System.out.println(Color.BLUE);
    } 
}
