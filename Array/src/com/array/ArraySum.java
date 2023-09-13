package com.array;

public class ArraySum {
	
	public static void main(String[]args) {
		int arr[]= {8,6,2,22,88,66,};
		
		int sum=0;
		
		for(int i=0;i<6;i++) {
			sum += arr[i];
			
			
			System.out.println("Sum of array elements= "+ sum);
		}
		
	}

}
