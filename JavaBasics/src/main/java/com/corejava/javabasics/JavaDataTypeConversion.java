package com.corejava.javabasics;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class JavaDataTypeConversion {

	public JavaDataTypeConversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		byte a=127;
		
		char ch=(char) a;
		
		System.out.println("character:- "+ ch);
		
/*		
		Charset cs  = Charset.forName("UTF-8");
		CharBuffer cb  = CharBuffer.wrap("A");
		ByteBuffer encodedData   = cs.encode(cb);
		System.out.println(""+encodedData.get());*/
		/*CharBuffer decodedData   = cs.decode(encodedData);
		System.out.println("Decode:--"+decodedData);*/
		
		System.out.println("Default Characters set:----"+Charset.defaultCharset().displayName());
		
	}

}
