package com.corejava.ArrayListDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		long statTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		for (Integer integer : list) {
//			System.out.println(integer);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time Taken :-"+(endTime-statTime));
		
		
//		list.get(3)
	}

}
