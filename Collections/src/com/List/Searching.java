package com.List;

import java.util.*;

public class Searching {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(6);
		li.add(5);
		li.add(3);
		li.add(4);
		li.add(2);
		
		System.out.println("List " + li);
		
		int index = li.indexOf(4);
		
		System.out.println("Element in index  ;" + index);
		
		int lastIndex = li.lastIndexOf(5);
		System.out.println("Last index ;" + lastIndex);
		

	}

}
