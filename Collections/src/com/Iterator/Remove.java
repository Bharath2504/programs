package com.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Remove {

	public static void main(String[] args) {
		
		ArrayList<String> player= new ArrayList<>();
		
		player.add("Dhoni");
		player.add("Virat");
		player.add("Rohit");
		player.add("Sky");
		player.add("Gill");
		
		ListIterator<String>ite= player.listIterator();	
		
		System.out.println("Before REMOVE :" +player);
		
		for(int i=0;i<4;i++) {
			ite.next();
		}
		ite.remove();
		
		System.err.println("AFTER REMOVE :" + player);

	}

}
