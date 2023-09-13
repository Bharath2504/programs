package com.example.FirstSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//UPI upi = context.getBean("upi",UPI.class);
		//System.out.println(upi.hashCode());
		
		//CreditCard creditCard = context.getBean("credit",CreditCard.class);
		//System.out.println(creditCard.hashCode());
		
		BillCollector bc = context.getBean("bc",BillCollector.class);
		bc.bill();
	}	
}