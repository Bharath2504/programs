package com.ArrayLIst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparingTwoArrayList_II {

	public static void main(String[] args) {
		
		ArrayList<String> arr1= new ArrayList<>();
		
		arr1.add("Int");
		arr1.add("Shourt");
		arr1.add("Byte");
		arr1.add("Long");
		
		ArrayList<String> arr2= new ArrayList<>();
		
		arr1.add("Long");
		arr1.add("Char");
		arr1.add("Byte");
		arr1.add("Int");
		
		ArrayList<String> arr3= new ArrayList<>();
		
		arr1.add("Long");
		arr1.add("Shourt");
		arr1.add("Byte");
		arr1.add("Int");
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		
		System.out.println("Comparing ArrayList :"+ arr1.equals(arr2));
		System.out.println("Comparing ArrayList :"+ arr2.equals(arr3));
		
		
	}

}
