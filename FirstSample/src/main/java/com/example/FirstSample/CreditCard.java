package com.example.FirstSample;

public class CreditCard implements PayMent{

	@Override
	public String pay() {
		
		return "Payment done through CreditCard";
	}

}
