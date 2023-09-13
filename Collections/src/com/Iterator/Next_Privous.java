package com.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Next_Privous {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(15);
		arr.add(25);
		arr.add(35);
		arr.add(45);
		
		ListIterator ite= arr.listIterator();
		
		System.out.println("Elements in Forward Direction");
		
		while(ite.hasNext())
			System.out.println(ite.next() + " ");
		
		System.out.println("Elements in Forward Direction");
		
		while(ite.hasPrevious())
			System.out.println(ite.previous() + " ");
		
		
				
	}

}
