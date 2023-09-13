package com.string;

public class SumOfEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "B8jtaa57nagtx67dr67";
		int sum =0;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='0'&& s1.charAt(i)<='9'){
			
			sum+= (s1.charAt(i)-'0' );
			}
		}
			System.out.println("Sum of each string " +sum);
		}

	}


