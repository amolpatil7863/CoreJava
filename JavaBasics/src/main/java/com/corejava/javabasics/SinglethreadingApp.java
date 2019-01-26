/**
 * 
 */
package com.corejava.javabasics;

/**
 * @author amol
 *
 */
public class SinglethreadingApp {

	/**
	 * 
	 */
	public SinglethreadingApp() {
		// TODO Auto-generated constructor stub
	}

	public void printEvenOdd() {
		for (int i = 0; i < 10000; i++) {
//			System.out.println(Thread.currentThread().getName()+" Is Running");
			if (i % 2 == 0) {
				System.out.println("Even:-" + i);
			} else {
				System.out.println("odd:-" + i);
			}

		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sTime=System.currentTimeMillis();
		new SinglethreadingApp().printEvenOdd();
		long eTime=System.currentTimeMillis();
		
		System.out.println("Time:-"+(eTime-sTime));
	}

}
