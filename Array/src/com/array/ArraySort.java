package com.array;

import java.util.Arrays;

public class ArraySort {

	public ArraySort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//declare and initialize arrays
		int arr [] = {25,54,15,10,99,1,23,12,8,5,75};
		
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		
		//sorting array
		Arrays.sort(arr);
		
		System.out.println("After Sorting:"+ Arrays.toString(arr));
		 

	}

}
 