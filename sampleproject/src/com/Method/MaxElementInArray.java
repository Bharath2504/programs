package com.Method;

public class MaxElementInArray {
	

	static int arr []= {88,99,66,44,514,486,387};
	
	static int largest()
	{
	int i;
	int max =arr[0];
	
	for ( i=1;i<arr.length;i++) {
		if (arr[i]>max)
			max =arr[max];
		
	}	
		
	
	return max;
	
		
	}
	public static void main(String[] args) {
	
		System.out.println("max element in array is;"+largest());
	}
}