package com.ArrayLIst;

import java.util.ArrayList;

public class GetIndexMethod {

	public static void main(String[] args) {
		
		ArrayList<String> str= new ArrayList<>();
		
		str.add("Encapsulation");
		str.add("Abstraction");
		str.add("Inheritance");
		str.add("Polymorprisum");
		
		System.out.println("ArrayListElements :" +  str);
		
		String Element = str.get(3);

		System.out.println("The element at index 3 is "+ Element);
		
	}

}
