package com.corejava.ExecutorFramework;

import java.util.concurrent.Callable;

public class AddTwoNo implements Callable<Integer> {
	int no1, no2;

	/**
	 * @param no1
	 * @param no2
	 */
	public AddTwoNo(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}

	@Override
	public Integer call() throws Exception {
		return this.no1 + this.no2;
	}

}
