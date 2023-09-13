package com.Thread;

public class A extends Thread {
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
		System.out.println("chaid thread");
		}
	}
	

	public static void main(String[] args) {
		
		A a=new A();
		
		Thread t=new Thread(a);
		t.start();
		
		for(int i=0;i<=10;i++) {
			
		}
		System.out.println("main thread");
		

	}

}
