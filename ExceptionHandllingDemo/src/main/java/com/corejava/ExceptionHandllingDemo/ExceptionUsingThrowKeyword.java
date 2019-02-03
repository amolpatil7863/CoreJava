/**
 * 
 */
package com.corejava.ExceptionHandllingDemo;

/**
 * @author amol
 *
 */
public class ExceptionUsingThrowKeyword {

	/**
	 * 
	 */
	public ExceptionUsingThrowKeyword() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			throw new MyException("Problem in our code");
		} catch (MyException e) {
			e.printStackTrace();
		} 
	}

}
