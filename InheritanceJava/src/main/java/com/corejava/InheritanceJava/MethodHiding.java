package com.corejava.InheritanceJava;

class Animal {
	public static void display() {
		System.out.println("Static or class method from Super");
	}
}

public class MethodHiding extends Animal {
	public static void display() {
		System.out.println("Static or class method from Derived");//hide the parent class method
	}

	public static void main(String[] args) {
		MethodHiding.display();
	}

}
