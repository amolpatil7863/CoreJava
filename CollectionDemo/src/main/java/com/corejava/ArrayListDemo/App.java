package com.corejava.ArrayListDemo;

public class App {

	public App() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
	}
	/*public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
		
	}*/
	public static void main(String[] args) {
		App a1=new App();
		/*Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		t1.start();
		t2.start();*/
		new App();
	}

	
	
	
}
