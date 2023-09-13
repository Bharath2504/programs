package com.string;

public class CheckIfStringContainsOnlyAlphabetsUsingLambdaExprestion {

	public static boolean isStringOnlyAlphabet(String str) {
		
		return ((str !=null)&&(!str.equals(" "))&&(str.chars().allMatch(Character::isLetter)));
	}
	
	public static void main (String[]args) {
		
		System.out.println("case 1;");
		
		String str="Bharathwaj";
		// INPUT
		System.out.println("input :" +str);
		// OUTPUT
		System.out.println("Output ;" +isStringOnlyAlphabet(str));
	}

}
