package com.string;

public class InterningOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("kbn");
		
		String s2=s1.intern();
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s3= "kbn";
		
		System.out.println(s2==s3);
		

	}

}
