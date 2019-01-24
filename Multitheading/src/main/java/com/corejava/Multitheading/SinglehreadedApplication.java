package com.corejava.Multitheading;

import java.time.Duration;
import java.time.Instant;

public class SinglehreadedApplication {
	public void show(){
		for(int i=0;i<500;i++){
			System.out.println("i:-"+i);
		}
	}
	public static void main(String[] args) {
		SinglehreadedApplication t=new SinglehreadedApplication();
		Instant start = Instant.now();
		t.show();
		 Instant finish = Instant.now();
		 
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println("time:-"+timeElapsed);
	}
}
