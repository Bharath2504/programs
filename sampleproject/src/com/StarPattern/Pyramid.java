package com.StarPattern;

public class Pyramid {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
			
			for (int j=i;j<=5-i;j++) {
				System.out.println(" ");
			}
			for (int k=1;k<=2*i-1;k++) {
				System.out.println("*");
			}
			
			System.out.println();
		}
	}	
}	
		
			
		
		
		
			