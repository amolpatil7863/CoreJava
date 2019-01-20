package com.corejava.javabasics.object;

public class Test extends Object{
	public static void main(String[] args) {
		ObjectClassMethods object=new ObjectClassMethods("Tanaji", 1);
		System.out.println(object);
		
		System.out.println("Hashcode value1:- "+object.hashCode());
		
		ObjectClassMethods object1=new ObjectClassMethods("Tanaji", 1);
		System.out.println(object1);
		System.out.println("Hashcode value2:- "+object1.hashCode());
		
		System.out.println("Equality:- "+ object.equals(object1));
		
		System.out.println("Hashcode object:- "+object.hashCode());
		ObjectClassMethods object5=object;
		System.out.println("Hashcode of object5:- "+object5.hashCode());
		
		if(object.hashCode()==object5.hashCode()) {
			System.out.println("Pointing to same object refrence----------------"+object.hashCode()+"---"+object5.hashCode());
		}else {
			System.out.println("not pointing to same refernce*******");
		}
		
		System.out.println("object equality:-"+ object.equals(object5));
		
		System.out.println("-----------"+object.equals(null));
	
	}
}
