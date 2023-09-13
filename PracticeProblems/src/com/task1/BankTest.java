package com.task1;

public class BankTest {

	public static void main(String[] args) {
		
		BankAccount BA=new BankAccount();
		
		BA.setAccountNumber(1326101655);
		BA.setBalance(50.000);
		
		System.out.println("Account Number :" +BA.getAccountNumber());
		System.out.println("Balance:" +BA.getBalance());
	}

}
