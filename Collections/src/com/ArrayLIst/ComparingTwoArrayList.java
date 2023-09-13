package com.ArrayLIst;

import java.util.ArrayList;

public class ComparingTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> A1 = new ArrayList<>();
		
		A1.add("RRR");
		A1.add("SVP");
		A1.add("AVP");
		A1.add("KGF");
		
		ArrayList<String> A2 = new ArrayList<>();
		
		A1.add("RRR");
		A1.add("SYP");
		A1.add("AVP");
		A1.add("KGF");
		
		System.out.println("Comparing Two ArrayList :" + A1.equals(A2));
	}

}
