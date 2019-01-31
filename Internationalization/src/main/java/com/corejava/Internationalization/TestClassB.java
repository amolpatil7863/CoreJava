package com.corejava.Internationalization;

public class TestClassB extends TestClassA {
    public TestClassB() {
        super();
        System.out.println("Created a new instance of the TestClassB class");
    }
 
    public static void main(String[] args) {
        TestClassB b = new TestClassB();
    }
}
