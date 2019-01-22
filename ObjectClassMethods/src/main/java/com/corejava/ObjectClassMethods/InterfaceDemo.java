package com.corejava.ObjectClassMethods;

public class InterfaceDemo implements Interface1, Interface2 {

	public InterfaceDemo() {

	}

	public void show() {
		System.out.println("InterfaceDemo");

	}

	public static void main(String[] args) {
		InterfaceDemo in = new InterfaceDemo();
		in.show();
	}
}
