package com.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Add {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar= new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(50);
		ar.add(60);
		
		System.out.println("ArrayList :" +ar);
		
		
		ListIterator<Integer> lte= ar.listIterator();
		
		while (lte.hasNext()) {
			lte.add(40);
			
			lte.next();
		}
		
		
		System.out.println("After adding:" +ar);
	}

}
