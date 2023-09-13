package com.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo_1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(66,22,41,32,12,15);
		
		list.stream().filter(i->i>18).forEach(u->System.out.println(u));
	}

}
