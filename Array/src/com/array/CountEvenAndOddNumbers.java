package com.array;

public class CountEvenAndOddNumbers {

	public CountEvenAndOddNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,4,8,9,7};
		
		System.out.println("Even numbers are....");

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("odd numbers are....");

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
