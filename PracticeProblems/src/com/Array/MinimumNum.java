package com.Array;

public class MinimumNum {
	
	public static void main(String []args) {
		
		
		int []arr= {5,8,4,9,6,2,7,1,7};
		int min=arr[0];
		
		for (int i=0;i<arr.length;i++) {
			if( arr[i]<min) {
				min=arr[i];
				
				
				System.out.println("min Num :" +min);
			}
		}
	}

}
