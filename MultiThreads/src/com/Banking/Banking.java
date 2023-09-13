package com.Banking;

public class Banking {
	
	float balance = 8000.00f;
	float amount;
	boolean condition=false;
	
	synchronized void withdraw(float amount)throws InterruptedException{
		
		System.out.println("withdraw started......");
		
		if (balance < amount) {
			System.out.println("you have less balance...,plz chwck your balance......");
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(4000);
		balance -=amount;
		condition=true;
		System.out.println("withdraw completed......");
	}
	
	synchronized void deposit(float amount) throws InterruptedException{
		
		System.out.println("Deposit started..........");
		if(!condition) {
			
		}
		Thread.sleep(4000);
		balance += amount;
		System.out.println("deposit completed........");
	}

}
