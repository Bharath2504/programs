package com.array;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// Sum of even numbers
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int even_sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_sum=even_sum+arr[i];
		}
		}
				System.out.println("Total sum of even numbers:"+ even_sum);
				
		//Sum of odd numbers
				int arr1 []= {1,2,3,4,5,6,7,8,9,};
				int odd_sum=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				odd_sum=odd_sum+arr1[i];
		}
		}
				System.out.println("Total sum of odd numbers:"+ odd_sum);
					
	}

}
