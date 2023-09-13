package com.string;

public class CompareTwoStringsLexicographically {
	
		public static int stringComapare(String s1,String s2) {
			
		for  (int i1=0;i1<s1.length()&&i1<s2.length();i1++) {
			
			if ((int)s1.charAt(i1)==(int)s2.charAt(i1)){
				continue ;
			
			}
			else {
				int i = 0;
				return (int)s1.charAt(i)-s2.charAt(i);
			}
		}
			if (s1.length()<s2.length()) {
				return (s1.length()-s2.length());
			
			}
			else if(s1.length()>s2.length()) {
				return (s1.length()-s2.length());
			}
			else {
				return 0;
			}	
		}

	public static void main(String[] args) {
		
		String str1=new String("badri");
		String str2=new String("nath");
		String str3=new String("bharathwaj");
		String str4=new String("komati");
		

		System.out.println(stringComapare(str1,str2));
		System.out.println(stringComapare(str1,str3));
		System.out.println(stringComapare(str2,str1));
		
		System.out.println(stringComapare(str1,str4));
		System.out.println(stringComapare(str4,str1));
		
	}

}
