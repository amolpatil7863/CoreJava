package com.corejava.Multitheading;

public class ThreadClassPriority extends Thread{
	private int sum=0;
	public void run(){
		for(int i=0;i<100000;i++){
			sum=sum+i;
		}
		System.out.println("thread is started:-"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadClassPriority t=new ThreadClassPriority();
		t.setName("mt1");
		t.setPriority(NORM_PRIORITY);
		
		t.start();
		
		ThreadClassPriority t1=new ThreadClassPriority();
		t.setPriority(NORM_PRIORITY);
		t.setName("mt2");
		t1.start();
	}

}
