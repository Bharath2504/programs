package com.string;

public class NumberOfDigitsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "my mobile number is:9063057881";
		
		int digits= 0;
		for (int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				
				digits++;
				
			}
			System.out.println("Total num of digits is=" +digits);
		}

	}

}
