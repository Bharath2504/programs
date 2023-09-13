package com.Thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			
			System.out.println(i);
			System.out.println("chaid thread");
		}
		
	}


public static void main (String []args) {
		MyRunnable R=new MyRunnable();
		
		Thread t= new Thread(R);
		t.start();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("main thread");
		}
}
	
}

		

	