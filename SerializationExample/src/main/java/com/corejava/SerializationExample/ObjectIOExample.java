package com.corejava.SerializationExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class ObjectIOExample {
	public void WriteObjectToFile(Object serObj) {

		try {

			String filepath = "C:\\Amol\\test.txt";

			FileOutputStream fileOut = new FileOutputStream(new File(filepath));
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public void getFromFile() throws IOException, ClassNotFoundException{
		String filepath = "C:\\Amol\\test.txt";
		FileInputStream fis = new FileInputStream(new File(filepath));
		ObjectInputStream oi = new ObjectInputStream(fis);
		Student student = (Student) oi.readObject();

        fis.close();
//        fos.close();
        System.out.println(student);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// final String filepath="C:\\Users\\nikos7\\Desktop\\obj";

		ObjectIOExample objectIO = new ObjectIOExample();

//		Student student = new Student("John", "Frost", 22);
//		objectIO.WriteObjectToFile(student);
		
		
		objectIO.getFromFile();

	}
}
