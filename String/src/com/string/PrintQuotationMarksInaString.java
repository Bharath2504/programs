package com.string;

public class PrintQuotationMarksInaString {

	public static void main(String[] args) {
		// Using escape sequence character 
		
		String str="\"KOMATI BHARATHWAJ\"";
		System.out.println(str);
		
		
		//Using char method
		
		char value ='"';
		String s1 =value+"KOMATI BHARTHWAJ"+value;
		
		System.out.println(s1);
	}

}
