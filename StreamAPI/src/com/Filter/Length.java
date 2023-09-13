package com.Filter;

import java.util.ArrayList;
import java.util.List;

public class Length {

	public static void main(String[] args) {
		
		List<String> name = ArrayList.class("Badri","Shiva","Kishore","Sai","Pavan");

		name.stream().filter(i -> i.length()<5).forEach(System.out::println);
	
	}

}
