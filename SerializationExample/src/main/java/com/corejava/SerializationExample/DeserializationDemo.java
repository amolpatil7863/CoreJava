package com.corejava.SerializationExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Hello world!
 *
 */
public class DeserializationDemo {
	final static String filepath = "/media/amol/Education/Java/GIT/Core Java/CoreJava/test.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream oi = null;
		Student student = null;
		try {
			fis = new FileInputStream(new File(filepath));	//read byte stream from specified file
			oi = new ObjectInputStream(fis);	//read object 
			student = (Student) oi.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis.close();
			oi.close();
		}

		System.out.println("Deserialized Object:-"+student);
	}
}
