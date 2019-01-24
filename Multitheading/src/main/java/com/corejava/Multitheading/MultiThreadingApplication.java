package com.corejava.Multitheading;

import java.time.Duration;
import java.time.Instant;

public class MultiThreadingApplication extends Thread {
	
	public void run(){
		for(int i=0;i<500;i++){
//			System.out.println("inside un method:-"+i);
			try {
				Thread.sleep(1000);    //using sleep method
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	MultiThreadingApplication t=new MultiThreadingApplication();
	Instant start = Instant.now();
	t.start();
	 Instant finish = Instant.now();
	 
	long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
	System.out.println("time:-"+timeElapsed);
	/*for(int j=0;j<500;j++){
		System.out.println("inside main method:-"+j);
	}*/
 }
}
