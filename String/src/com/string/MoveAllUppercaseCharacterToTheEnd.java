package com.string;

public class MoveAllUppercaseCharacterToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="BirdaBHARthwaj";
		String newstr="";
		String upper="";
		
		for (int i=0;i<str.length();i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				upper +=str.substring(i,i+1);
				 
			}
			else {
				newstr +=str.substring(i,i+1);
			}
		}
		System.out.println(newstr+upper);
	}

}
