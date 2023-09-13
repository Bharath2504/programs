package com.array;

public class LargeNumber {

	public static void main(String [] args) {
		int[]arr= {122,55,9999,66,4587,357,6581,21568}; 
		int max =0;
		 
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			
		}
		}
		System.out.println( "The large num is:" +max);
	}
                   
}
