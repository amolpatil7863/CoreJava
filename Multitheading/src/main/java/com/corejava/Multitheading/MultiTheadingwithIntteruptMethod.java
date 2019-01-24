package com.corejava.Multitheading;

public class MultiTheadingwithIntteruptMethod {
	public static void main(String[] args) {
		MyThread1 mt=new MyThread1();
		mt.start();
		mt.interrupt();
		
		
	}
}
