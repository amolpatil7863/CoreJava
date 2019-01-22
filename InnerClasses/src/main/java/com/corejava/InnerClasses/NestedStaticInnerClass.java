package com.corejava.InnerClasses;

public class NestedStaticInnerClass {
	private int c=1;
	static class InnerClass{
		
		public InnerClass(){
			System.out.println("static construcor");
		}
		static int a=20;
		
		public int count(){
			NestedStaticInnerClass i=new NestedStaticInnerClass();
			System.out.println("------------"+i.c);
			a+=a;
			return a;
		}
	}
	public static void main(String[] args) {
		NestedStaticInnerClass.InnerClass nestedInnerClass=new NestedStaticInnerClass.InnerClass();
		System.out.println(nestedInnerClass.count());
		System.out.println(NestedStaticInnerClass.InnerClass.a=19);
	}
}
