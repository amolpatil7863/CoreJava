package com.facebook.FaceBookData;

public class MethodOverloadingDemo {

	public int add(int a) {
		System.out.println("INT:- "+a);
		return a;
	}
	
	public int add(double h) {
		System.out.println("double :- "+h);
		return (int) h;
	}
	
	/*public double add(int a,int f)
	{
		System.out.println("two args double:- "+a+" "+f);
		return a*f;
	}*/
	
	public void add(float f1) {
		
		System.out.println("----------float------------"+f1);
	}
	
	/*public static void increament() {
		System.out.println("Static default");
	}
	
	public static int increament(int fh) {
		System.out.println("Static default221"+fh);

		return fh;
	}
	public static void main() {
		System.out.println("Overloading defalut main method");
	}
	public static void main(int gh) {
		System.out.println("Overloading parameterized main method");
	}
	
	final int sun(int a) {
		System.out.println(a);
		return a;
	}
	
	final void sum(double d) {
		System.out.println(d);
	}
	*/
	public static void main(String[] args)  {
		MethodOverloadingDemo mehodde=new MethodOverloadingDemo();
		mehodde.add(20.9d);
		mehodde.add(10);
		mehodde.add(29f);
		
	}
}
