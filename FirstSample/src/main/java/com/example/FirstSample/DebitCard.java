package com.example.FirstSample;

public class DebitCard implements PayMent{

	@Override
	public String pay() {
		
		return "PayMent done through DebitCard";
	}

}
