package com.array;

public class RepetedElements {

	public RepetedElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,9,6,3,1,4,7,5,3,7,4,2,1};
		int temp[]=new int[arr.length];
		System.out.println("Repeted elements are ;");
		for(int i=0;i<temp.length;i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
				
			}else
			{
				temp[arr[i]]++;
			}
		}

	}

}
