package com.corejava.IOSteams;

public class StringTokenizer {

	public static void main(String[] args) {
		String s="Amol,Amol";
		
		java.util.StringTokenizer token=new java.util.StringTokenizer(s,",",false);
		while (token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}

}
