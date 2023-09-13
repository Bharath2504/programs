package com.Method;

public class EvenOrOddNum {
	
	private static int number;

	static int evenNum(String string) {
		
		int number=35;
		
		if (number%2==0)
			System.out.println(number+ "is even");
		else
			System.out.println(number+ "is odd ");
		
		return number;
		
	}

	public static void main(String[] args) {
		
System.out.print(evenNum(number+ " even or odd"));
	}

}
