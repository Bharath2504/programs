package com.Method;
import java.util.*;
public class CountNumOfDigitsInInteger {
	
	
	static int countDigits(long n) {
		
		int count =0;
		while (n!=0) {
			n=n/10;
			count++;
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		long n =25489314;
		
		System.out.print("numberof digits;" + countDigits(n));
		

	}

}
