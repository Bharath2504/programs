package com.string;

import java.util.*;

public class ConvertStringIntoCommaSeperatedLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" komati bharath";
		
		System.out.println("String "+ s1);
		
		String[] elements=s1.split("  ");
		
		List <String>list=Arrays.asList(elements);
		
		System.out.println("Comma seperted list ;" + list);
	}

}
