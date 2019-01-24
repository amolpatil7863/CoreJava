package com.corejava.Multitheading;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum=sum+i;
			System.out.println("SUM:- "+sum);
			try {
				Thread.sleep(209);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
