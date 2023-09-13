package com.ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		
		ArrayList<String> mn = new ArrayList<>();
		
		mn.add("B");
		mn.add("R");
		mn.add("D");
		mn.add("A");
		mn.add("I");
		
		System.out.println("Before Swaping" + mn);
		
		Collections.swap(mn, 1, 3);
		System.out.println("After Swaping");
		
		for (String a:mn) {
			System.out.println(a);
		}
		
	}

}
