package com.Map;

import java.util.Arrays;
import java.util.List;

public class Task_1 {

	public static void main(String[] args) {
		
		List<Integer>number = Arrays.asList(2,5,6,3,4,8,9);
		
		number.stream().map(num -> num*2).forEach(System.out::println);

	}

}
