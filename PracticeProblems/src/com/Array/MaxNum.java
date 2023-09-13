package com.Array;

public class MaxNum {

	public static void main(String[] args) {
		int arr[]= {55,22,68,99,48,63,24};
		int max= arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				
				max=arr[i];
				
				System.out.println("max num :"+ max);
			}
			
		}

	}

}
