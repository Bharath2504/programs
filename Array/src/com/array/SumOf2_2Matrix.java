package com.array;

public class SumOf2_2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[][]= {{159,357,456},{741,852,963}};
		int sum=0;
		  	for (int i=0;i<arr.length;i++) {
		  		for( int j=0;j<arr.length;j++) {
		  			sum=sum+arr[i][j];
		  		}
		  		
		  	}
		  		System.out.println("Total sum of the matrix:" +sum);
	}

}
