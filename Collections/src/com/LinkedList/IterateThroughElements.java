package com.LinkedList;

import java.util.LinkedList;

public class IterateThroughElements {

	public static void main(String[] args) {
		
		LinkedList<Integer> mn= new LinkedList<>();
		
		mn.add(10);
		mn.add(50);
		mn.add(30);
		mn.add(20);
		
		for (Integer Num:mn) {
			System.out.println(Num);
		}
	}

}
