package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveWhitespscesUsingRegex {

	public static String removingWhite(String s) {
		
		Pattern patt=Pattern.compile("[\\s]");
		
		Matcher mat=patt.matcher(s);
		
		return mat.replaceAll("");
	}
		public static void main(String []argv) {
			
			String s= "hello badri";
			
			System.out.println(removingWhite(s));

	}

}
