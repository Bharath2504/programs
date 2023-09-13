package com.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveZerosFromString {
	
	public static void main(String[] args) {
		
		String str ="0000019998888";
		String newstr= " ";
		
		int ind =0;
		
		for (int i=0;i<str.length();i++){
			char p =str.charAt(i);
			if (p!='0') {
				ind =i;
				break;
				
				
			}
		
			
		}
		
		newstr=str.substring(ind,str.length());
		
		System.out.println(newstr);

	}

}
