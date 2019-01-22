package com.corejava.ExceptionHandllingDemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 FileReader file = new FileReader("C:\\test\\a.txt"); 
         BufferedReader fileInput = new BufferedReader(file); 
           
         // Print first 3 lines of file "C:\test\a.txt" 
         for (int counter = 0; counter < 3; counter++)  
             System.out.println(fileInput.readLine()); 
           
         fileInput.close(); 
    }
}
