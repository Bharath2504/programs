package com.string;

public class ComaparingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("badrinath");
		String str2 = new String("badri");
		String str3 = new String("badrinarh");
		String str4 = new String("badrinath");
		
		System.out.println("Comapring  " + str1+"  and "+str2+" : "+ str1.equals(str2));
		
		System.out.println("Comapring  " + str3+"  and "+str4+" : "+ str3.equals(str4));
		
		System.out.println("Comapring  " + str4+"  and "+str1+" : "+ str4.equals(str1));
		
		System.out.println("Comapring  " + str2+"  and "+str3+" : "+ str2.equals(str3));

	}

}
