package com.string;

public class ReplaceMultipulCharactersIn_String {

	public static void main(String[] args) {
		// Using replace all method 
		
		String Str =new String ("KOMATI BHARATHWAJ");
		
		 System.out.print("Original string ;");
		System.out.println(Str);
		
		System.out.print("After raplacing the sentence ;");
		System.out.println(Str.replaceAll("(.*)KOMATI(.*)" ,"BADRI"));
	}

}
