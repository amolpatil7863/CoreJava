package com.corejava.ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class DependencyCallable {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 10; i++) {
			AddTwoNo addTwoNo = new AddTwoNo(i, (i + 1));
			Future<Integer> result = executor.submit(addTwoNo);
			list.add(result);
		}
		
		
		for (Future<Integer> future : list) {
			try{
				System.out.println("result of Two:-"+future.get());
			}catch(Exception e){
				System.out.println(e);
			}
		
		}
	}
}
