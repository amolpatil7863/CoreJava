package com.corejava.IOSteams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriter {

	public static void main(String[] args) {
		File file = null;
		File file1 = null;
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
//			file = new File("C:\\Amol\\task.txt");
			file=new File("/media/amol/Education/MyLaptopConfiguration.txt");
			
			String str="amol";
			
			System.out.println("bytes :-"+str.getBytes("UTF-16"));
			
//			file1 = new File("C:\\Amol\\task1.txt");
			file1=new File("/media/amol/Education/newone.txt");
			fileReader = new FileReader(file);         //read character from byte streAm
			if (!file1.exists()) {
				file1.createNewFile();
			}
			fileWriter = new FileWriter(file1);
//			System.out.println("--------------------------------------"+fileReader.getEncoding());
//			System.out.println("--------------------------------------"+fileReader.read());
			
			 int i;  
			 while ((i=fileReader.read()) != -1) {
				 System.out.println("g");
					System.out.println("Data " + i);
					fileWriter.write(i);
				} 
//	          while(( i=fileReader.read())!=-1)  {  
//				System.out.println("--------------------------------------"+(char)fileReader.read());
//				System.out.println(fileReader.read());
//				fileWriter.write(fileReader.read());
//
//			}
	          
	           
	          
	          
			fileReader.read();

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
