package com.corejava.DataTypesAndTypeCasting;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//widening conversion
    	
    	byte b=127;    //-127 to 128
    	System.out.println("byte: "+ b);
    	short s=b;
    	System.out.println("byte to short: "+s);
    	int i=b;
    	System.out.println("byte to int:"+i);
    	long l=b;
    	System.out.println("byte to long:"+l);
    	float f=b;
    	System.out.println("byte to float:"+f);
    	double d=b;
    	System.out.println("byte to double:"+d);
    	
    	
//    	narrowing Conversion
    	
    	double dconv=29.20d;
    	int i1=(int) dconv;
    	System.out.println("double to int casting:"+i1);
    	
    	
    	
    char ch='A';
    double ds=ch;
    System.out.println(ds);
    
    
    
    
    	
    	
    }
}
