package com.array;

import java.util.Arrays;

public class MergeTwoArrays {

	public MergeTwoArrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//array which should be merged
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {9,18,27,36,45};
		
		
		//create new array
		int newArray[]=new int[arr1.length+arr2.length];
		
		//copy first to new array from 0to arr1.length
		System.arraycopy(arr1, 0, newArray, 0, arr1.length);
		
		//copy second array to new array
		System.arraycopy(arr2, 0, newArray, 0, arr1.length);	
		System.arraycopy(arr2, 0, newArray, 0, arr1.length);
		//display all arrays
		System.out.println("Array1= "+ Arrays.toString(arr1));
		System.out.println("Array2="+ Arrays.toString(arr2));
		System.out.println("Merged Array="+ Arrays.toString(newArray));
		
		
		
					
		}
		

	}


