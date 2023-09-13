package com.Array;

public class OddAndEvenNum {

	public static void main(String[] args) {
		
		int arr[]= {5,6,4,8,9,7,3,2,1,45,12,55,36,77};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
	
				System.out.println("Even num :"+ arr[i]);
				
		for (int i1=0;i1<arr.length;i1++) {
			if(arr[i1]%2!=0) {
				
				System.out.println("Odd Num :"+ arr[i1]);
				
			}
		}
			
			}
		}
	}

}
