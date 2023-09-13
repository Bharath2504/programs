package com.string;

public class Replace_a_Character_at_SpecificIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Tomati Badri";
		 
		int index= 0;
		
		char ch ='K';
		
		System.out.println("original string ;"  +s1);
		
		s1 = s1.substring(0,index) + ch + s1.substring(index+1);
		 
		System.out.println("modified string ;" + s1);
	}

}
