package com.corejava.ArrayListDemo;

public class Employee {
	private String name;
	private int id;
	private String address;
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	
	
	/**
	 * @param name
	 * @param id
	 * @param address
	 */
	public Employee(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
}
