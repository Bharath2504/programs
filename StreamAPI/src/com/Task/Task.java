package com.Task;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		
		        int[] arr1 = {1, -5, 3, 14, -2, 17};

		        int[] sortedArr = Arrays.stream(arr1)
		                .sorted()
		                .toArray();

		        int secondMin = sortedArr[1];
		        int secondMax = sortedArr[sortedArr.length - 2];

		        int sum = secondMin + secondMax;
		        System.out.println("Sum of second min and second max: " + sum);
		    }
		


	}


