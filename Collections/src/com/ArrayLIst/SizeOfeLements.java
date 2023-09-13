package com.ArrayLIst;

import java.util.ArrayList;

public class SizeOfeLements {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(5);
		al.add(6);
		al.add(2);
		al.add(3);
		
		int  a= al.size();
		
		System.out.println("The Size Of Elements is :" + a);
	}

}
