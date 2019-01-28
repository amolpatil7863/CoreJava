package com.corejava.Multitheading;

import java.util.GregorianCalendar;

public class GCDemo extends GregorianCalendar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			// create a new ObjectDemo object
			GCDemo cal = new GCDemo();

			// print current time
			System.out.println("" + cal.getTime());

			// finalize cal
			System.out.println("Finalizing...");
			cal.finalize();
			System.out.println("Finalized.");

		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

}
