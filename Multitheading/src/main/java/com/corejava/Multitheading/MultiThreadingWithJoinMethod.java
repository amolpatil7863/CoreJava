package com.corejava.Multitheading;

public class MultiThreadingWithJoinMethod extends Thread {
	int sum=0;
	public void run(){
		for(int i=0;i<100000;i++){
			sum=sum+i;
//			System.out.println(sum);
		}
		System.out.println("my Thread Name:-"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("Main Thread Name:-"+Thread.currentThread().getName());
		MultiThreadingWithJoinMethod t=new MultiThreadingWithJoinMethod();
		long startime=System.currentTimeMillis();
		t.start();
		
		try{
		t.join();
		}catch(InterruptedException e){
			
		}
		long endtime=System.currentTimeMillis();
		System.out.println("Time :-"+(startime-endtime)/1000+"Seconds");
		System.out.println("o/p:- "+t.sum);
	}

}
