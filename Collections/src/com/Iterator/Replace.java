package com.Iterator;

import java.util.List;
import java.util.ListIterator;

public class Replace {

	public static void main(String[] args) {
		
		ArrayList<String> me= new ArrayList<>();
		
		me.add("B");
		me.add("A");
		me.add("G");
		me.add("R");
		me.add("I");
		
		ListIterator <String> lt= me.listIterator();
		
		While(listIterator.hasNext()){
			 
			String element=ListIterator.next();
			
		if(element.equals("G"))	{
			listIterator.set("D");
		}
		}

	}

}
