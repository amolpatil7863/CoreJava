package com.corejava.MultiThreading;

/**
 * Hello world!
 *
 */
public class PrintEvenOdd implements Runnable{
	 
	public int MAX=20;
	static int  num=1;
	int remainder;
	static Object lock=new Object();
 
	PrintEvenOdd(int remainder)
	{
		this.remainder=remainder;
	}
 
	public void run() {
		while (num < MAX) {
			synchronized (lock) {
				while (num % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " -->  " + num);
				num++;
				lock.notifyAll();
			}
		}
	}


	public static void main(String[] args) {
		PrintEvenOdd runnable1=new PrintEvenOdd(1);
		PrintEvenOdd runnable2=new PrintEvenOdd(0);
		
		Thread t1=new Thread(runnable1,"Thread 1");
		Thread t2=new Thread(runnable2,"Thread 2");
		
		t1.start();
		t2.start();
	}

}
