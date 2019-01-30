package com.corejava.InheritanceJava;

class Dog extends AnimalClass {
	public void show() {
		System.out.println("Dog  class");
	}

	public void displayDogData() {
		System.out.println("Dog class Data");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		AnimalClass animal=new Dog();
//		animal.show();
		animal.displayAnimalData();
		
//		animal.displayDogData();
		animal.show();
	}

}
