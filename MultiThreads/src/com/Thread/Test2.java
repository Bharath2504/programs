package com.Thread;

public class Test2 {

	public Test2() {
		
		Cartoon c= new Cartoon();
		Thread t=new Thread(c);
		
		
		t.start();
		
		for (int i=0;i<10;i++) {
			System.out.println("main");
		}
	}

}
