package com.corejava.ArrayListDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioriyQueueExample {

	public PrioriyQueueExample() {
	}

	public static void main(String[] args) {
	      Queue<String> q = new PriorityQueue<String>();
	      q.add("Rick");
	      q.add("Maggie"); 
	      q.add("Glenn");
	      q.add("Negan");
	      q.add("Daryl");
	      
	      q.add("Glenn");
	      q.add("Negan");
	      System.out.println("Elements in Priority Queue:"+q);
	      System.out.println("Size:- "+q.size());
	     
	      q=new LinkedList<String>();
	      //Adding elements to the Queue
	      q.add("Rick");
	      q.add("Maggie"); 
	      q.add("Glenn");
	      q.add("Negan");
	      q.add("Daryl");
	      System.out.println("Elements in LinkedList:-"+q);
//	      System.out.println(q.poll());
	      System.out.println("Size:- "+q.size());
	     
	      System.out.println("Priority Queue:-");
	      Queue<Integer> q3 = new PriorityQueue<Integer>(); 
	      q3.add(2);
	      q3.add(5);
	      q3.add(3);
	      q3.add(1);
	      q3.add(7);
	      q3.add(8);
	      q3.add(null);
	     System.out.println(q3);
	}

}
