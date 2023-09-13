package com.Method;

public class SumOfDigits {
	
	static int findSum(int number) {
		int sum =0;
		
		while (number!=0) {
			sum=sum+number%10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int number=548961;
		
		System.out.println("the sum digits;"+findSum(number));
		
	}

}
