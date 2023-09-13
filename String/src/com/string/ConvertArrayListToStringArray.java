package com.string;

import java.util.*;

public class ConvertArrayListToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<String>al=new ArrayList<String>();
		
		al.add("mangamma");
		al.add("venkateshwarlu");
		al.add("badri");
		
		String k[]= al.toArray(new String [al.size()]);
		 
		for ( String str :k) {
			
			System.out.println(str);
		}
	}

}
