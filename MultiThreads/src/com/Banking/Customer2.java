package com.Banking;

public class Customer2 extends Thread {
	
	Customer2(Banking b){
		this.b=b;	
	}
		Banking b;
		
		public void run() {
			try {
				b.deposit(11000.00f);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}

}
