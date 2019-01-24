package com.corejava.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListThreadSafety {
	static ArrayList<Integer> a = new ArrayList<Integer>(1);
//	static Vector<Integer> a = new Vector<Integer>(1);
	
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<=50000;i++) {
					a.add(i);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for(Integer integer:a) {
					System.out.println(":::"+integer);
				
				}
			}
		};
		t1.start();
		t2.start();
//		Thread.sleep(100);
		
	}
}
