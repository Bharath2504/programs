package com.Filter;

import java.util.stream.Stream;

public class Task_2 {

	public static void main(String[] args) {
		
		Stream<Integer> num = Stream.of(1,2,3,4,5,6,7,8,9);
		
		num.filter(i->i%2==0).forEach(i->System.out.println(i));

	}

}
