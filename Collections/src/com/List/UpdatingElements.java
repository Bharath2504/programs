package com.List;

import java.util.*;

public class UpdatingElements {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		
		li.add("badri");
		li.add("Kishore");
		li.add("shiva");
		
		System.out.println(li);
		
		li.set(1,"shiva" );
		
		System.out.println(li);
		

	}

}
