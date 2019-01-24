package com.corejava.IOSteams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingUsingInputSteam {

	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		try {
			 fileInputStream=new FileInputStream(new File("C:\\Amol\\task.txt"));
			
				int i= fileInputStream.read();
				System.out.println("daa:-"+i);
				while ((i=fileInputStream.read())!=-1) {
					char ch=(char) i;
					String s=String.valueOf(ch);
					System.out.println(s);
				}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
		}finally {
			try {
				fileInputStream.close();
				System.out.println("Closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
