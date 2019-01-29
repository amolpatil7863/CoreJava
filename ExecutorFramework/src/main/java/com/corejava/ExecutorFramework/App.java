package com.corejava.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class App {
	public static void main(String[] args) {
		int poolSize = Runtime.getRuntime().availableProcessors();
		System.out.println("Thread Pool Size:-" + poolSize);
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
//		ExecutorService executorService2=Executors.newScheduledThreadPool(10);
		
		ExecutorService executorService2=Executors.newFixedThreadPool(10000);
		
//		executorService2.invokeAll(tasks)
		
		
		
		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});

		executorService.shutdown();
		
		
		
//		using ScheduledExecutorService
		
		/*ScheduledExecutorService scheduledExecutorService =Executors.newScheduledThreadPool(5);

		ScheduledFuture scheduledFuture =scheduledExecutorService.schedule(new Callable() {
		        public Object call() throws Exception {
		        	
		            System.out.println("Executed!");
		            return "Called!";
		        }
		    },
		3    ,
		    TimeUnit.SECONDS);
	}*/
	}
}
