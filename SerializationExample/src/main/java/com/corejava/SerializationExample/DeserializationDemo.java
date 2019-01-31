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
	// final static String filepath = "/media/amol/Education/Java/GIT/Core
	// Java/CoreJava/test.txt";
	final static String filepath = "C:\\Amol\\CoreJava\\SerializationExample\\test.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream oi = null;
		File file = null;
		Student student = null;
		try {
			file = new File(filepath);
			fis = new FileInputStream(file); // read byte stream from data from
												// file
			/*
			 * int i; while ((i = fis.read()) != -1) {
			 * System.out.println("byte Stream:- " + i); }
			 */ // file

			oi = new ObjectInputStream(fis); // read object
			student = (Student) oi.readObject();

			/*
			 * file=new File("C:\\Users\\HP\\Desktop\\Track.jpg"); InputStream
			 * inputStream = new FileInputStream(file); OutputStream
			 * outputStream = new
			 * FileOutputStream("C:\\Users\\HP\\Desktop\\Track1.jpg");
			 * 
			 * Integer c;
			 * 
			 * //continue reading till the end of the file while ((c =
			 * inputStream.read()) != -1) {
			 * 
			 * //writes to the output Stream outputStream.write(c); }
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
			oi.close();

		}

		System.out.println("Deserialized Object:-" + student);
	}
}
