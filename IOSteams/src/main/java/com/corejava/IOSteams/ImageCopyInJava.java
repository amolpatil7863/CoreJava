package com.corejava.IOSteams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopyInJava {

	public ImageCopyInJava() {
	}

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(new File("/media/amol/Entertainment/Images/morgan.png"));
			os = new FileOutputStream(new File("/media/amol/Entertainment/Images/c/copy-morgan.png"));
			byte[] buffer = new byte[1024];
			int length;
			/*int a;
			while((a=is.read(buffer))!=-1) {
				System.out.println("byte data:--"+a);
			}
			*/
			
			
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
