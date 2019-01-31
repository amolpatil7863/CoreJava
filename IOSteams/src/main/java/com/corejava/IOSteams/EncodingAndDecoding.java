package com.corejava.IOSteams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) {
		/*Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "username:password";
		String encodedString = encoder.encodeToString(
		        normalString.getBytes(StandardCharsets.UTF_8) );
		System.out.println("---------"+encodedString);*/
		
		File f=null;
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
		
				//encode image to Base64 String
				 f = new File("C:\\Users\\HP\\Desktop\\Track.jpg");		//change path of image according to you
				 fis = new FileInputStream(f);
				byte byteArray[] = new byte[(int)f.length()];
				fis.read(byteArray);
				String imageString = Base64.getEncoder().encodeToString(byteArray); 
				
				System.out.println("-----------------"+imageString);
				
				//decode Base64 String to image
				 fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Track7.jpg"); //change path of image according to you
				byteArray =  Base64.getDecoder().decode(imageString);
				fos.write(byteArray);
		 System.out.println("Image Decodded");
				
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
		}
	}

}
