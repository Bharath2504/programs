package com.string;

public class JoingTwoJavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="KOMATI";
		System.out.println("First string;" +s1);
		
		String s2=" BHARATHWAJ";
		System.out.println("Second string;" +s2);
		
		 
		//joining two strings
		String joinedString=s1.concat(s2);
		System.out.println("Joined strings are;" +s1.concat(s2));
	}

}
