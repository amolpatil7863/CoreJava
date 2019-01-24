package com.corejava.Multitheading;

public class MultiThreadingByImplementingRunnable implements Runnable{

	static int sum=0;
	public void run(){
		for(int i=0;i<100000;i++){
			sum=sum+i;
		}
		System.out.println("-----"+sum);
	}

	public static void main(String[] args) {
		System.out.println("--------------------------");
		MultiThreadingApplication mt=new MultiThreadingApplication();
		Thread t=new Thread(mt);
		t.start();
		try {
			t.join(10);
			System.out.println("Joining method calls");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
