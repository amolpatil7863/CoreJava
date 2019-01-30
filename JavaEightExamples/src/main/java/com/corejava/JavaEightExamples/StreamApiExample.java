package com.corejava.JavaEightExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			myList.add(i);
		}

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		// using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		// using lambda in forEach
//		highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

		/*
		 * Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		 * highNumsSeq.forEach(p ->
		 * System.out.println("High Nums sequential="+p));
		 */

		
//		System.out.println("Filte Api:- "+sequentialStream.filter(p -> p > 10).count());
		
		List<Integer> myList1 = new ArrayList<>();
		for (int i = 0; i < 60; i++) {
			if(i%2==0){
				myList1.add(i);
			}
		}
		Stream<Integer> sList=myList1.stream();
		Stream<Integer> list= sList.sorted();
//		Stream<Integer> list= sList.sorted((i1,i2)->i1.compareTo(i2));
		list.forEach(p -> System.out.println("Numeical Lis:-" + p));
		
		
		
		List<Integer> randomList=new ArrayList<Integer>();
		
		randomList.add(10);
		randomList.add(39);
		randomList.add(89);
		randomList.add(29);
		
		System.out.println("List:-"+randomList);
		
		Stream<Integer> sRandomList=randomList.stream();
//		System.out.println("sRandomList:--"+sRandomList.count());
		
		sRandomList.forEach(p->System.out.println(p));
		
		
		
	}
}
