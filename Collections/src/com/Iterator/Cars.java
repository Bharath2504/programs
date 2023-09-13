package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Swift");
		
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
