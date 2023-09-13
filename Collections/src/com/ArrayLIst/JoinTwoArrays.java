package com.ArrayLIst;

import java.util.ArrayList;

public class JoinTwoArrays {

	public static void main(String[] args) {
		
		ArrayList<String> mn= new ArrayList<>();
		
		mn.add("badri");
		mn.add("shiva");
		mn.add("kishore");
		mn.add("sai");
		
		System.out.println("the first arrayLIst" + mn);
		
		ArrayList<String> mn2= new ArrayList<>();
		
		mn2.add("shilpa");
		mn2.add("siri");
		mn2.add("mani");
		mn2.add("dolly");
		
		System.out.println("the first arrayLIst" + mn2);
		
		ArrayList<String> k= new ArrayList<>();
		
		k.addAll(mn);
		k.addAll(mn2);
		
		System.out.println("New ArrayList"+ k);

	}

}
