package com.LinkedList;

import java.util.LinkedList;

public class InsertElements {

	public static void main(String[] args) {
		
		LinkedList<String> mn= new LinkedList<>();
		
		mn.add("ironman");
		mn.add("spiderman");
		mn.add("captainAmerica");
		mn.add("hulk");
		
		System.out.println("the linkedList  "+ mn);
		
		LinkedList<String> newlist= new LinkedList<>();
		
		newlist.add("thor");
		newlist.add("loki");
		
		mn.addAll(1,newlist);
		
		System.out.println("new linkedList :-"+ mn);
	}

}
