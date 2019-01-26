/**
 * 
 */
package com.corejava.Multitheading;

/**
 * @author amol
 *
 */
public class EvenOddMultiThreading implements Runnable {

	/**
	 * @param args
	 */

	public void run() {
		for (int i = 0; i < 10000; i++) {
			
			if (i % 2 == 0) {
				System.out.println("Even:-" + i);
			} else {
				System.out.println("odd:-" + i);
			}

		}
	}

	public static void main(String[] args) {

		long sTime = System.currentTimeMillis();

		EvenOddMultiThreading mt = new EvenOddMultiThreading();
		Thread t1 = new Thread(mt);
		t1.start();
		Thread t2 = new Thread(mt);
		t2.start();
		long eTime = System.currentTimeMillis();

//		System.out.println("Time:-" + (eTime - sTime));

	}
}
