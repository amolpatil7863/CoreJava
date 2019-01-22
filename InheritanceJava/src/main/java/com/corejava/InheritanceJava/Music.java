package com.corejava.InheritanceJava;

public class Music  {
	
 
	public Music() {
		super();
		System.out.println("Music::Initializing song...");
		}

	public void play() {
		System.out.println("Music:: Playing music...");
	}
	
	public Object show(){
		System.out.println("Parent Class");
		Music music=new Music();
		return music;
	}
	
	public float calc(){
		return 20.54f;
	}
	
	private int add(){
		return 10;
	}
}
