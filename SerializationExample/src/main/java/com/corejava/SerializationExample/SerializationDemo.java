package com.corejava.SerializationExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {

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
}
