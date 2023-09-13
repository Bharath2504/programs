package com.List;

import java.util.*;

public class AccessingElements {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		
		li.add("sai");
		li.add("shiva");
		li.add("Badri");
		li.add("kishore");
		
		System.out.println(li);
		
		String first = li.get(2);
		String second = li.get(1);
		String third = li.get(3);
		String forth = li.get(0);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(forth);

	}

}
