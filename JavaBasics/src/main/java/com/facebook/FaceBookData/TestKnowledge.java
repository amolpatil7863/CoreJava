package com.facebook.FaceBookData;

public class TestKnowledge {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name:-  "+name);
		if(name.equals("Amol")) {
			this.name = name;	
		}else {
			this.name=null;
		}	
	}
	
	public void show(double a) {
	//Automatically type promiting to double
		System.out.println("int:- "+a);
	}
	
	public void show() {
		System.out.println("default method");
	}
	
	public void show(int d) {
		System.out.println("float method:- "+d);
	}
	
	public float display(float a) {
		return a;
	}
	public double display(float s,int d) {
		return s+d;
	}
	
	// adding three integer values. 
    public int add(int a, int b, int c){ 
           
        int sum = a+b+c; 
        return sum; 
    } 
       
    // adding three double values. 
    public double add(double a, double b, double c){ 
           
        double sum = a+b+c; 
        return sum; 
    } 

	public static void main(String[] args) {
		TestKnowledge tsest = new TestKnowledge();
/*		tsest.getName();
		tsest.setName("Amol");
		System.out.println("Returning name:- "+tsest.getName());*/
		
		
		
		
	}

}
