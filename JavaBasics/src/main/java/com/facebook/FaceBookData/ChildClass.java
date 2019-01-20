package com.facebook.FaceBookData;

public class ChildClass extends ParentClass{
	private double salary;

	public ChildClass() {
		super();
		System.out.println("Child class Object:- "+this);
	}

	public ChildClass(double salary) {
		super();
		this.salary = salary;
	}
	public void show() {
		System.out.println(salary);
	}
	
}
