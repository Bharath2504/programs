package com.Thread;

public class PrintEvenAndOddNum implements Runnable {

	@Override
	public void run() {
		
		for (int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println("even num:" +i);
			}else {
				System.out.println("odd num:" +i);
			}
		}
	}

		public static void main (String []args) {
			
			PrintEvenAndOddNum eo= new PrintEvenAndOddNum();
			
			Thread t=new Thread(eo);
			t.start();
		}
		}