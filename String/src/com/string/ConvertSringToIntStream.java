package com.string;

import java.util.stream.IntStream;

public class ConvertSringToIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="BHADRI";
		System.out.println("String :"+str);
		
		IntStream intStream=str.chars();
		
		intStream.forEach(System.out::println);
	}

}
