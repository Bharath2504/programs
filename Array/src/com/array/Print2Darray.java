package com.array;

public class Print2Darray {
	
	public static void main(String[]args) {
	
	int arr[][]= {{55,66,44,},{11,22,33,}};
	
	
	for(int []k:arr) {
		for (int i:k) {
			
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
