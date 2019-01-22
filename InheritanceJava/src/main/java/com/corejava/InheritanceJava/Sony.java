package com.corejava.InheritanceJava;

public class Sony extends Music{

	
	Sony() {
		System.out.println("Sony operations...");
	}
	@Override
	public void play() {
		System.out.println("Sony:: Playing music... ");
	}
	@Override
	public Sony show(){
		System.out.println("Child class");
		Sony sony=new Sony();
		return sony;
	}
	/*@Override
	public double calc(){
		return 20.54d;
	}*/
	
	public int add(){
		return 32;
	}
}
