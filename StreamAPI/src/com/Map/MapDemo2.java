package com.Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Badri","Shiva","Kishore","Sai");

		names.stream().filter(name -> name.startsWith("S")).map(name->name.length()).forEach(System.out::println);
	}

}
