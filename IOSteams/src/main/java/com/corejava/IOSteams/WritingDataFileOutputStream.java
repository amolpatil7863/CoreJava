package com.corejava.IOSteams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataFileOutputStream {

	public static void main(String[] args) {
		String data = "Java";
		File file = null;
		FileOutputStream fileOutputStream = null;

		file = new File("C:\\Amol\\task.txt");
		try {
		fileOutputStream=new FileOutputStream(file);
		byte[] byteArray = data.getBytes();
		
			if (!file.exists()) {

				file.createNewFile();
				fileOutputStream.write(byteArray);

			} else {
				System.out.println(byteArray);
				fileOutputStream.write(byteArray);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

//		}
		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			/*try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
