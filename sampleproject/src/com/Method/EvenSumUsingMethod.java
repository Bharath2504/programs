package com.Method;

public class EvenSumUsingMethod {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i= 0; i<arr.length;i++) {
			System.out.println(arr [i]+" "+"\n");
				
			}
			
			FindEvenNum(arr);
			
		}
		
	

	private static void FindEvenNum(int[] arr) {
		// TODO Auto-generated method stub
		
		int evensum=0;
		int oddsum=0;
		
		for(int num :arr) {
			if (num%2==0)
			{
				evensum +=num;
			}
			else {
				oddsum+=num;
			}
		}
	
	System.out.println("Even num are:" +evensum+"\n");
	System.out.println("Odd num are:" +oddsum);

}
}
