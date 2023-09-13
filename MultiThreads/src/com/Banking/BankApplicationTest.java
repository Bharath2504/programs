package com.Banking;

public class BankApplicationTest {

	public static void main(String[] args) {
		
		Banking b=new Banking();
		Customer1 c1=new Customer1(b);
		Customer2 c2=new Customer2(b);
		
		
		c1.start();
		c2.start();
	}

}
