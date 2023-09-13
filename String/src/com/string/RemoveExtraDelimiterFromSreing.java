package com.string;

public class RemoveExtraDelimiterFromSreing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =" komati,badri,nath_";
		
		char delimiter= '_';
		
		int index =str.lastIndexOf(delimiter);
		
		str = str.substring(0, index)+ str.substring(index+ 1);
		
		System.out.println("String with extra "+"Delimiter removed;"+ str);

	}

}
