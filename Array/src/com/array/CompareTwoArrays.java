package com.array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4};
		int [] arr2= {1,2,3,4,5};
		int [] arr3= {1,2,3,4,5};
		
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr3, arr1));
		

	}
}
