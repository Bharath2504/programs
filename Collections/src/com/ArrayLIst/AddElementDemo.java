package com.ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class AddElementDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> kbn = new ArrayList();
		
		kbn.add(5);
		kbn.add(2);
		kbn.add(4);
		kbn.add(1);
		kbn.add(3);
		
		System.out.println("The ArrayList Elements :" + kbn);
		
		kbn.add(4,6);
		
		System.out.println("Adding element at 4 index :" + kbn);
		Collections.sort(kbn);
		
		
		for (Integer  elements : kbn) {
			
			System.out.println("The ArrayList Elements :" + elements);
		}
		
	}

}
