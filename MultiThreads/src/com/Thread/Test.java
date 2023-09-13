package com.Thread;

public class Test {

	public static void main(String []args) {
		
		Hangama h= new Hangama();
		h.setPriority(10);
		h.start();
		
		for (int i=0;i<=10;i++) {
			
			System.out.println("main thread");
		}
		
	}
}
