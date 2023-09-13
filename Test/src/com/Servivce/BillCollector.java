package com.Servivce;

import com.Payment.DebitCard;
import com.Payment.Payment;

public class BillCollector {
	
		
	public Payment p = new DebitCard();
	
	public void billpay(double amount) {
		String result = p.pay();
		System.out.println(result);
		
	}
}
