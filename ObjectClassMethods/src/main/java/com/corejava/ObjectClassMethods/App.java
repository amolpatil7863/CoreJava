package com.corejava.ObjectClassMethods;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student obj1=new Student(1,"Steve");
    	System.out.println("hashcode of obj1:- "+obj1.hashCode());
    	Student obj2=new Student(1,"Steve");
    	System.out.println("hashcode of obj2:- "+obj2.hashCode());
    	System.out.println("equals method:-"+obj1.equals(obj2));
    }
}
