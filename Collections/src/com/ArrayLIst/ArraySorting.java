package com.ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
			
		
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(10);
		
		System.out.println("Before sorting :"+ al);
		
		Collections.sort(al);
		
		System.out.println("After sorting : "+ al);
	}

}
