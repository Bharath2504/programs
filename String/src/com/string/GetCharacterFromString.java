package com.string;

public class GetCharacterFromString {

	
	public static char getCharFromString(String str, int index) {
		return  str.charAt(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str =" komati bharathwaj";
		
		int index =9;
		
		char ch= getCharFromString(str,index);
		
		System.out.println("Character from "+ str +"  at index  " + index +   " is " + ch);
	}

}
