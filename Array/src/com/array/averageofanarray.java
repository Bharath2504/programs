package com.array;

public class averageofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[]arr= {60,70,80,90,100};
		double sum=0.0;
		double avg=0.0;
		
		
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
			
			avg =sum/arr.length;
			
			System.out.println("Average:");
			System.out.println(+avg);
		}
	}

}
