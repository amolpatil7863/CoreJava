package com.corejava.SerializationExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*Serialization is usually used When the need arises to send your data over network or stored in files.
By data I mean objects and not text.Now the problem is your Network infrastructure and your Hard disk 
are hardware components that understand bits and bytes but not JAVA objects.*/


public class SerializationDemo {
	public static void main(String[] args) {
		FileOutputStream fileStream = null;
		Student student = null;
		ObjectOutputStream objectOut = null;
		try {
			String filepath = "/media/amol/Education/Java/GIT/Core Java/CoreJava/test.txt";
			File file = new File(filepath); // this will create file
			if (file.exists()) {
				System.out.println("exist");
			} else {
				file.createNewFile();
			}
			fileStream = new FileOutputStream(file); // this will write bytestream to file
			objectOut = new ObjectOutputStream(fileStream); // this will write object to file
			student = new Student("Amol", "Patil", 24);
			System.out.println("Writing object to file");
			objectOut.writeObject(student);
			System.out.println("The Object  was succesfully written to a file");

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fileStream.close();
				objectOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
