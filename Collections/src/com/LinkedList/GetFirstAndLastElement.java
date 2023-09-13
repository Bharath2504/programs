package com.LinkedList;

import java.util.LinkedList;

public class GetFirstAndLastElement {

	public static void main(String[] args) {

		LinkedList<String> mn= new LinkedList<>();
			
		mn.add("maaTv");
		mn.add("E Tv");
		mn.add("Z Tv");
		mn.add("Gemini Tv");
		
		System.out.println("The Linked List");
		
		String first_Element=mn.getFirst();
		System.out.println("First element:-" + first_Element);
		
		String last_Element=mn.getLast();
		System.out.println("First element:-" + last_Element);
	}

}
