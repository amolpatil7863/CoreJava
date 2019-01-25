package com.corejava.ArrayListDemo;

import java.util.HashSet;

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	public static void main(String[] args) {
		/*Employee e1=new Employee();
		Employee e2=e1;
		System.out.println(e1.hashCode()+"  "+e2.hashCode());*/
		
		 Employee employee = new Employee("rajeev", 24,"pune");
	     Employee employee1 = new Employee("rajeev", 25,"pune");
	     Employee employee2 = new Employee("rajeev", 24,"pune");
	     System.out.println("employee.hashCode():  " + employee.hashCode()+"\n"+ "employee2.hashCode():" + employee2.hashCode());
	     HashSet<Employee> employees = new HashSet<Employee>();
	        employees.add(employee);
	        System.out.println(employees.contains(employee2));
	        
	      
	   System.out.println(employee.equals(employee2));     
	      
	}
}
