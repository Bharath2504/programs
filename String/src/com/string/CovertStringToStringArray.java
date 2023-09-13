package com.string;

public class CovertStringToStringArray {

	public static void main(String[] args) {
		//Using str.split() method
		
		String str="we love india";
		
		String strArray[]= str.split(" ");
		
		
		System.out.println("String :" +str);
		System.out.println("String array :[ ");
		
		for (int i=0;i<strArray.length;i++) {
		
		System.out.print(strArray[i]+ "_");
	}
	 System.out.println(" ] ");
}

}