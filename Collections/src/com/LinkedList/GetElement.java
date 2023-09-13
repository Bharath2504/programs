package com.LinkedList;

import java.util.LinkedList;

public class GetElement {

	public static void main(String[] args) {
		
		LinkedList<String> mn = new LinkedList<>();
		
		mn.add("Encapsulation");
		mn.add("polymorprisum");
		mn.add("Inheritance");
		mn.add("Abstraction");
		
		System.out.println("The Linked List"+ mn);
		
		String ng = mn.get(1);
		
		System.out.println("the element ata index 1 :-"+ ng);

	}

}
