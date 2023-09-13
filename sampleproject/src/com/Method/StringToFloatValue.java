package com.Method;

import java.io.*;

public class StringToFloatValue {

	public static void main(String[] args) {
		
		String str="1.0";
		
		float floatVlaue;
		
		floatVlaue=convertStringToFloat(str);
		
		System.out.println(+floatVlaue);
	}

	private static float convertStringToFloat(String str) {
		// TODO Auto-generated method stub
		return Float.valueOf(str);
	}

}
