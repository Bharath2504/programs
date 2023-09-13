package com.string;

import java.util.regex.*;
import java.util.Scanner;

public class CheckIfMobileNumberIsValid {

	public static boolean isValid(String s) {
		
		
		Pattern p =Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		Matcher m=p.matcher(s);
		
		return (m.find()&&m.group().equals(s));
		// TODO Auto-generated method stub
	}
	
	public static void main(String []args) {
		
		String s="9063057881";
		
		if (isValid(s)) 
			System.out.println("valid number");
		else
				System.out.println("invalid number");
	
	
	}
}
