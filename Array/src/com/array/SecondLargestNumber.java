package com.array;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main (String []args) {
    	
    	int []arr= {58,2,6,8,65,41,25,84,59,369};
    		Arrays.sort(arr);
    	
    	
    	//System.out.println(Arrays.toString(arr));
    	System .out.println("second largest num is:" +arr[arr.length-2]);
    }
}
