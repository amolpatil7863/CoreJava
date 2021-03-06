package com.corejava.SerializationExample;

import java.io.Serializable;

public class Student implements Serializable {

//	 default serialVersion id
//    private static final long serialVersionUID = 1L; 	
	
	/*If a class does not explicitly define a private static final long serialVersionUID in the code it will be autogenerated, 
	and there is no guarantee that different machines will generate the same id; it looks like that is exactly what happened.
	Also if the classes are different in any way (using different versions of the class) the autogenerated serialVersionUIDs will
	also be different.
*/


	/**
	 * genarated serialVersion id
	 */
	private static final long serialVersionUID = 9088627604768911860L;	//we must provide generated serial version oid
	private String first_name;
	private String last_name;
	private int age;

	public Student(String fname, String lname, int age) {
		this.first_name = fname;
		this.last_name = lname;
		this.age = age;
	}

	public void setFirstName(String fname) {
		this.first_name = fname;
	}

	public String getFirstName() {
		return this.first_name;
	}

	public void setLastName(String lname) {
		this.first_name = lname;
	}

	public String getLastName() {
		return this.last_name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Student [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + "]";
	}

}
