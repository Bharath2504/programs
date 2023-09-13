package com.Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {
		
		List<String> countryNames= Arrays.asList("india","pakisthan","england","srilanka");
		
		//Print uppercase
		countryNames.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		
		System.out.println("================");
		//Print length of the elements
		
		countryNames.stream().map(name-> name.length()).forEach(System.out::println);
		System.out.println("================");
		
	}

}
 