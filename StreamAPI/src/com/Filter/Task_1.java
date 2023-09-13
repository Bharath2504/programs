package com.Filter;

import java.util.stream.Stream;

public class Task_1 {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("MaheshBabu","Ntr","Prabas","Ram Chran","Pawan Kalyan");
		
		names.filter(i->i.startsWith("P") && i.endsWith("n"))
		.forEach(i->System.out.println(i));
	}

}
