 package com.string;

public class Remove_A_Given_Word_From_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str ="doremon shinchan pokemon";
		
		String word="shinchan";
				
			str=str.replace("shinchan", "");
			
			str =str.trim();
					
					System.out.print(str);

	
	}
	
	}


