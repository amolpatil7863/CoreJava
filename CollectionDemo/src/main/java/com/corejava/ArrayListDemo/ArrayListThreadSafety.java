package com.corejava.ArrayListDemo;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class ArrayListThreadSafety implements Runnable {
	 ArrayList<Integer> a = new ArrayList<Integer>();
	 static final Logger logger=Logger.getLogger(ArrayListWithoghtThread.class.getName());
	public void run() {
		synchronized (a) {
			for (int i = 0; i < 100000; i++) {
				a.add(i+1);
			}
			for (Integer integer : a) {
//				System.out.println("Fetching ele:-" + integer);
				logger.info(String.format("List:- (%s)", integer));
			}
		}
		

	}
	/*
	 * public void addElement() {
	 * 
	 * }
	 * 
	 * public void retriveElement() {
	 * 
	 * }
	 */

	public static void main(String[] args) {

		ArrayListThreadSafety al = new ArrayListThreadSafety();
		Thread t1 = new Thread(al);
		t1.setName("t1");
		Thread t2 = new Thread(al);
		t2.setName("t2");
		t1.start();
		t2.start();
	}

}
