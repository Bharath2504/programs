package com.ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class SwapingTwoElements {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> A1 = new ArrayList<>();
		
		A1.add(10);
		A1.add(20);
		A1.add(40);
		A1.add(30);
		A1.add(50);
		
		System.out.println("Before Swaping :" + A1);
		
		Collections.swap(A1, 2, 3);
		
		System.out.println("After Swaping :" + A1);
	}

}
