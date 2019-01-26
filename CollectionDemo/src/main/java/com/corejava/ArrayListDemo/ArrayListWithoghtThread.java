package com.corejava.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListWithoghtThread {
	 ArrayList<Integer> a = new ArrayList<Integer>();
	public ArrayListWithoghtThread() {
		for (int i = 0; i < 100000; i++) {
			a.add(i+1);
		}
		for (Integer integer : a) {
			System.out.println("Fetching ele:-" + integer);
		}
	}

	public static void main(String[] args) {
		new ArrayListWithoghtThread();
	}

}
