package com.Method;

public class StringToBoolean {
	 
	
	public static void main (String []args) {
		
		printprimeBetween(10,30);
	
	}
	
	public static boolean booleanisprime(int n) { 
		
		for (int i=2;i<=n/2;i++)
			if (n%2==0)
				
			return false;
		return true;
	}
	private static void printprimeBetween(int i, int j) {
		
		for (int i1=i;i1<=j;i1++)
			if (booleanisprime(i1))
				
				System.out.println(i+" ");
		
	}

}
