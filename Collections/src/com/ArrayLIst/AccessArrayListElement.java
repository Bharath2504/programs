package com.ArrayLIst;

import java.util.ArrayList;

public class AccessArrayListElement {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<>();
		
		cars.add("Bmw");
		cars.add("Swift");
		cars.add("Kia");
		cars.add("Tata");
		
		System.out.println("Array list :" + cars);
		
		String str= cars.get(2);
		System.out.println("Elements at index: " + str);

	}

}
