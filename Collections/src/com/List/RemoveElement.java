package com.List;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		
		li.add("thirupathi");
		li.add("tejaDurga");
		li.add("Revanth");
		li.add("Aruna");
		
		System.out.println("list"+li);
		
		li.add(2, "Smirithi");
		
		System.out.println("After Adding" + li);
		
		li.remove(2);
		System.out.println("Removing index 2 "+ li);
		
		li.remove("Aruna");
		System.out.println("Removing object " + li);
		

	}

}
