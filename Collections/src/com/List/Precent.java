package com.List;

import java.util.*;

public class Precent {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList <>();
		
		li.add("Badri");
		li.add("Shiva");
		li.add("Kishore");
		li.add("Sai");
		
		System.out.println(li);
		
		boolean  isPrecent = li.contains("Shiva");
		
		System.out.println(isPrecent);
		
		

	}

}
