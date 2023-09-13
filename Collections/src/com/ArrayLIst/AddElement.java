package com.ArrayLIst;

import java.util.ArrayList;

public class AddElement {

	public static void main(String[] args) {
		
		ArrayList<String> language = new ArrayList<>();

			language.add("Telugu");
			language.add("English");
			language.add("Mathematics");
			
			System.out.println("ArrayList :" +language);
			
			
// Adding Element at specified position
			language.add(3,"Hindi");
			System.out.println("ArrayList :" +language);
			
	}

}
