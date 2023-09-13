package com.string;

public class PrintNewLineInString {

	public static void main(String[] args) {
		
		// Using system.lineSeperater()
		
		String newline=System.lineSeparator();
		
		System.out.println("Badri" + newline + "BHARATH");
		
		
		//Using platform-dependent new line character
		
		//Using new line character \n
		
		System.out.println("BADRI" + '\n' +"BHARATHWAJ");
		
		//Using System. get.proparty
		
		String name =System.getProperty(newline);
		
		System.out.println("premitive" + newline + "non premitive");
		
		
		//Using %n new line method
		
		System.out.printf("HTML%nSQL");
		
		//Using System.out.println();
		
		System.out.println("VIRAT");
		System.out.println("DHONI");
		
	}

}
