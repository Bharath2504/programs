package com.string;

public class CountRepetedWordsInTheCharacterInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="KOMATI BHARATHWAJ";
		
		int totalcount=str.length();
		int totalcount_afterRemove= str.replace("A","").length();
		int count =totalcount-totalcount_afterRemove;
		
		System.out.println("Repeted words in the character is:" +count);

	
	}

}
