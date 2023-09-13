package com.ArrayLIst;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> str1 = new ArrayList<>();
		
		str1.add(1);	
		str1.add(2);
		str1.add(3);
		str1.add(4);
		
		System.out.println("ArrayList elements 1");
		for(Integer number: str1) {
			System.out.println("Numbers :"+ number);
		}
		
		
		ArrayList<Integer> str2 = new ArrayList ();
		
		str2.add(5);
		str2.add(6);
		str2.add(7);
		str2.add(8);
		
		System.out.println("ArrayList Elemnts 2");
		
		for(Integer number : str2) {
			System.out.println("Numbers:" + number);
			
			str1.addAll(str2);
			
			System.out.println("Print all elements");
			
		for(Integer number1 : str1) {
			System.out.println("Number :"+ number1);
			
		}
		}
		
	}

}
