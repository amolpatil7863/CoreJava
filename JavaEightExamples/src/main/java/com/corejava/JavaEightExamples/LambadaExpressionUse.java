package com.corejava.JavaEightExamples;

public class LambadaExpressionUse implements MyFunctionalInterface {
	

	   public static void main(String args[]) {
	        // lambda expression
	    	MyFunctionalInterface msg = () -> {
	    		return 72;
	    	};
	        System.out.println(msg.show());
	        
	        
	        
	    }

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

	
