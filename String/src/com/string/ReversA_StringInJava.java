package com.string;

public class ReversA_StringInJava {
	public static void main (String[]args) {
		
		
		String str= "Badri" , nstr="";
		char ch;
		
		System.out.print("Original word ;" );
		System.out.println("Badri");
		
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reversed word ;" +nstr);
	}

}
