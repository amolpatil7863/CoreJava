package com.corejava.InheritanceJava;

class Super {
	int a=10;
	void Sample() {
		System.out.println("method of super class");
	}
	public static void disp1() {
		System.out.println("static 1");
	}
}

public class Sub extends Super {
	int b=20;
	static int c=29;
	void Sample() {
		System.out.println("method of sub class");
	}
	public static void disp1() {
		System.out.println("static 1");
	}
void show() {
	System.out.println("show");
}
	public static void main(String args[]) {
		Super obj=new Sub();	//upcasting
//		obj.Sample();
		System.out.println(obj.a);
		obj.Sample();
		Sub sub=(Sub) obj;
		sub.Sample();
		
		/*Object obj1 = new Integer(100);
		
		        System.out.println((String) obj1);*/
		
		
		Sub obj2=(Sub) obj;
		obj2.Sample();
		
		System.out.println(obj2.a+" "+obj2.b);
		
		
//		Sub s1=new Sub();
		
		
		
		
	Sub s2=new Sub();
	s2.disp1();

	}
}
