package com.corejava.javabasics;

public class ParentClass extends Object{
	private int a;
	private String name;
	private double price;
	
	public ParentClass() {
		super();
		System.out.println();
		System.out.println("superclass Hashcode:- "+super.hashCode());
		System.out.println("Parent object:- "+this);
	}

	public ParentClass(int a, String name, double price) {
		super();
		this.a = a;
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(a+name+price);
	}
/*
	@Override
	public int hashCode() {
		return a;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	
	
}
