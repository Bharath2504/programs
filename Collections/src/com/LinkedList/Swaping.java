package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Swaping {

	public static void main(String[] args) {
		
		LinkedList<String> mn= new LinkedList<>();
		
		mn.add("ntr");
		mn.add("pavan kalyan");
		mn.add("prabas");
		mn.add("maheshbabu");
		
		System.out.println("the linkedList "+ mn);
		
		Collections.swap(mn, 3, 0);
		
		System.out.println(mn);
	}

}
