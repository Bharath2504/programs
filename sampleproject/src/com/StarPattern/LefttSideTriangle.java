package com.StarPattern;

public class LefttSideTriangle {

	public static void main(String[] args) {

		
		        int rows = 5; // Number of rows in the triangle

		        for (int i = 1; i <= 5; i++) {
		            // Print spaces
		            for (int j = 1; j <= 5 - i; j++) {
		                System.out.print(" ");
		            }

		            // Print asterisks
		            for (int k = 1; k <= i; k++) {
		                System.out.print("*");
		            }

		            System.out.println(); // Move to the next line
		        }
	}
}
		    
		