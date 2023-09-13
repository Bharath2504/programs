package com.string;

import java.util.Arrays;
import java.util.List;


public class ConvertCharacterListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character>str=Arrays.asList('B','A','D','R','I');
		
		System.out.println("LIST-" +str);
		
		StringBuilder sb=new StringBuilder();
		
		for( Character ch : str) {
			sb.append (ch);
		}
		
		String string= sb.toString();
		
		System.out.println("String:- " +string);
	}

}
