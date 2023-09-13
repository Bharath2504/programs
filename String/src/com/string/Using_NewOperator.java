package com.string;

public class Using_NewOperator {
	 
	public static void main(String[]args) {
		
		String s1=new String("Badri").intern();
		String s2=new String("Badri").intern();
		 
		if(s1==s2) {
			System.out .println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
	}

}
