package com.array;

public class SumOf3_3Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{123,456,789},{147,258,369},{987,654,321}};
		int sum=0;
		
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					sum=sum+arr[i][j];
					
				}
			}
			System.out.println("The total sum of matrix:"+sum);
	}
		}
