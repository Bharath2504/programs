/**
 * 
 */
package com.array;

import java.util.Arrays;


public class CopyArray {

	public CopyArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {20,40,60,80,100,120,140};
		 
		int newArr[]= arr;
		
		System.out.println("Original Array=" +Arrays.toString(arr));
		System.out.println("Copied ARRAY="+Arrays.toString(newArr)); 

	}

}
