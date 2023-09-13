package com.string;

public class EqualsOnStringAndStringBufferObjects {

	public static void main(String[] args) {
		
		//equals method in string buffer
	
		StringBuffer sb1= new StringBuffer("kbn");
		StringBuffer sb2 =new StringBuffer("kbn");
		System.out.println(sb1.equals(sb2));
		
		//equals method in string
		
		String s1="kbn";
		String s2="kbn";
		
		System.out.println(s1.equals(s2));
	}

}
