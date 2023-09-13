package com.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo_2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Badri","Shiva","Kishora","Shilpa");
		
		names.stream().filter(i->i.startsWith("S")).forEach(i->System.out.println(i));
	}

}
