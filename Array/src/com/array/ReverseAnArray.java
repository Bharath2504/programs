package com.array;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		int []arr = new int[] {90,80,70,60,50,40,30,20,10};
		
		System.out.println("The original arrays are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"    ");
		}
		System.out.println("The reversed arrays are");
		for(int i=arr.length-1;i>0;i--) {
			System.out.println(arr[i]+"    ");
			
		}
	}

}
