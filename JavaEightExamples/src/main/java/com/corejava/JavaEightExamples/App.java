package com.corejava.JavaEightExamples;

/**
 * Hello world!
 *
 */
public class App implements MyFunctionalInterface
{
    public static void main( String[] args )
    {
    	System.out.println("main");
    	MyFunctionalInterface myInterface=new App();
    	MyFunctionalInterface.execute();
    	
    	myInterface.display();
    }

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*public static void execute() {
		System.out.println("min method");
	}*/
	public  void display(){
		System.out.println("Overridenf");
	}
	
	
}
