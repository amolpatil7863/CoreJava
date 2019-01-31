package com.corejava.IOSteams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingUsingBuffer {

	public static void main(String[] args) {
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			file = new File("C:\\Amol\\task.txt");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			String s;
			while ((s = bufferedReader.readLine()) != null) {
				System.out.println("Data " + s);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				fileReader.close();
				try {
					if (bufferedReader != null)
						bufferedReader.close();

				} catch (IOException ioe) {
					System.out.println("Error in closing the BufferedReader");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
