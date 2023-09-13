package com.string;

public class CheckForStringRotationInJava {

	static boolean areRotations(String str1 , String str2) {
		return (str1.length()==str2.length())&&((str1+str2).contains(str2));
	}
	public static void main(String[]args){
		
		String str1 = "BADRI";
		String str2 ="ABDIR";
		
		if (areRotations(str1,str2)) 
			System.out.println("yes");
			else
			System.out.println("no");
		}
			
	
	}
 
	

