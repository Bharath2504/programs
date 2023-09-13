package com.Filter;

import java.util.Arrays;
import java.util.List;

public class Tasks_4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Dhoni","virat","rohit","jadeja","gill");
		
		int minLength=3;
		int maxLength=6;
		
		list.stream().filter(li ->li.length() >=minLength && li.length() <= maxLength)
		.forEach(System.out::println);
	}

}
