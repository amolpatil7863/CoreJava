package com.corejava.javabasics.object;

public class ObjectClassMethods {
	private String name;
	private int id;
	public ObjectClassMethods() {
		super();
	}
	public ObjectClassMethods(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	@Override
	public String toString() {
		return "ObjectClassMethods [name=" + name + ", id=" + id + "]";
//		return super.toString();
	}
	/*@Override
	public int hashCode() {
		return id;
	}*/
	/*@Override
	public boolean equals(Object obj) {
		ObjectClassMethods objectClassMethods=(ObjectClassMethods) obj;
		System.out.println("In Equals method:- "+objectClassMethods);
		if(objectClassMethods.getName().equals(this.name) && objectClassMethods.getId()==(this.id)) {
			return true;
		}
		return false;
	}
	*/
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		System.out.println("HASHCODE::::::::::::"+result);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("HASHCODE:::::::::----------:::"+result);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassMethods other = (ObjectClassMethods) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	 
	
	 //when we override equals method then we must override hashcode method of that class 
	
}
