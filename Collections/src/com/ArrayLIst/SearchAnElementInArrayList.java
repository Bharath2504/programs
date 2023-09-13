package com.ArrayLIst;

import java.util.ArrayList;

public class SearchAnElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> mn = new ArrayList<>();
		 
		mn.add("badri");
		mn.add("shiva");
		mn.add("kishore");
		mn.add("kittamma");
		mn.add("sai");
		mn.add("dolly");
		mn.add("siri harika");
		mn.add("mani harika");
		
		if(mn.contains("sai")) {
			System.out.println("Found the element"+ "....."+ mn.contains("sai"));
		}else {
			System.out.println("element not found"+ "....." +  mn.contains("sai"));
		}

	}

}
