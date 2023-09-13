package com.example.FirstSample;

public class BillCollector {

	private PayMent p;
	
	
	
	public PayMent getP() {
		return p;
	}



	public void setP(PayMent p) {
		this.p = p;
	}



	public void bill() {
		
		String pay = p.pay();
		System.out.println(pay);
	}
}
