package com.corejava.JavaEightExamples;
@FunctionalInterface
public interface MyFunctionalInterface {
	public static void execute() {
		System.out.println("static method inside Interface");
	}
	public default void display(){
		System.out.println("Base interface Default Interface");
	}
	
	public abstract int show();
//	public abstract void add();
	
}
