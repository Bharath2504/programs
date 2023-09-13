package com.array;

public class SmallestNumber {
	public static void main (String[]args) {
		
		int []arr = {3,5,8,4,9,7,3,4,14};
	int	min = arr[0];
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
			
		}
	}
	
		
		System.out.println("SmallNumber: " +min  );
		
	}

}
