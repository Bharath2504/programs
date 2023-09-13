package com.Task;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,-5,3,14,-2,17,-2}; 
		
		int secondMax = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
          System.out.println("Second maximum num is: " +secondMax);  
          
        int secondMin = Arrays.stream(arr1).boxed().sorted().distinct().skip(1).findFirst().get();
          System.out.println("Second minimum num is: " +secondMin);             
		
        int Total= secondMin+secondMax;
        
		 System.out.println("Total ;"+ Total);
	}

}
