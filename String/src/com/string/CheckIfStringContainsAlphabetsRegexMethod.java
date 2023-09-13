package com.string;

public class CheckIfStringContainsAlphabetsRegexMethod {
		
	 public static boolean isStringOnlyAlphabet(String str){
	    
	 
	        return ((str != null) && (!str.equals(""))
	                && (str.matches("^[a-zA-Z]*$")));
	    }
	 
	    public static void main(String[] args) {
	    
	 
	        
	        System.out.println("Test Case :");
	        // Input string
	        String str1 = "GeeksforGeeks";
	        System.out.println("Input: " + str1);
	 
	        System.out.println("Output: "+ isStringOnlyAlphabet(str1));
	                           
	 
	
	
		

	}

}
