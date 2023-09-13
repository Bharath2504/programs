package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Removee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Integer> al = new ArrayList<>();
			
			al.add(2);
			al.add(6);
			al.add(8);
			al.add(10);
			al.add(1);
			
			Iterator<Integer> it = al.iterator();
			
			while(it.hasNext()) {
				Integer i =it.next();
				if (i<10) {
					it.remove();
					
					System.out.println(al);
				}
			}
	}

}
