package com.string;

import java.util.*;
public class ListOfStringToCommaseparetedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>List= new ArrayList<>(Arrays.asList("komati","badri","nath"));
		
		System.out.println("List of string:"+List);
		
		String string = String .join(",", List);
		
		System.out.println("Comma seperated  string ;" + string);
	}

}
