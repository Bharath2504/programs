package com.string;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String s1="badri";
		String s2="Badri";
		String s3="badri";

		boolean result1= s1.equals(s2);
		System.out.println("string s1 and string s2 are equal;" +result1);
		
		boolean result2= s1.equals(s3);
		System.out.println("string s1 and string s3 are equal;" +result2);
	}

}
