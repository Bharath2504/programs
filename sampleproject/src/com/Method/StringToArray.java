package com.Method;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		 
		String str []= {"15698437"};
		for (int i=0;i<str.length;i++) {
			System.out.println(str[i]+ "  ");
			
			//method calling 
			StringToIntArray(str);
		}

	}

	private static void StringToIntArray(String[] str) {
		// TODO Auto-generated method stub
		int size = str.length;
		int []arr= new int [size];
		for (int i =0;i<str.length;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println();
		System.out.println("String Array;" +Arrays.toString(arr));
	}

}
