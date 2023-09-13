package com.Filter;

import java.util.Arrays;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Badri","Shiva","nikhil","Kishora","BHARATHWAJ","SHILPA");
		
		names.stream().filter(i->i.equals(i.toUpperCase()))
		.forEach(System.out::println);
		
	}

}
