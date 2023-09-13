package com.string;

import java.util.stream.IntStream;

public class ConvertInstreamToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream intStream ="badri".chars();
		
		StringBuilder string = intStream.collect(StringBuilder :: new
												,StringBuilder::appendCodePoint ,
												StringBuilder::append);
		
		
			System.out.println("String;"+ string);
	}

}
