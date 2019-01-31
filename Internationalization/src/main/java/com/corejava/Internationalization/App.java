package com.corejava.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();  
		//Locale locale=new Locale("fr","fr");//for the specific locale  
		  
		System.out.println(locale.getDisplayCountry());  
		System.out.println(locale.getDisplayLanguage());  
//		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());  
		
		
	
		
		  Locale locale1 = new Locale("EN");

		  NumberFormat numberFormat = NumberFormat.getInstance(locale1);
		  System.out.println("numberFormat:="+numberFormat.getCurrency());
		  
		  Class.forName(");
	}
}
