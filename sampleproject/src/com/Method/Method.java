package com.Method;

public class Method {

	public static void main(String[] args) {

		Method m1=new Method();
		String str="Bharathwaj";
		
		String reverseString=m1 .reverseString(str);
		System.out.println(reverseString);
	}

		private static String reverseString(String s1) {
			String result =" ";
			for (int i=s1.length()-1;i>=0;i--) {
				result=result+s1.charAt(i);
			}
			return result;
			
		}
}
