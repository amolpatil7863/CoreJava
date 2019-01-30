package com.corejava.InheritanceJava;

public class LambadaUsingRunnable {

	public static void main(String[] args) {
		
		Runnable task2 = () -> { System.out.println("Task #2 is running"); };
		
		 new Thread(task2).start();
	}

}
