package com.lld.payment;

import com.lld.payment.model.Payment;

public class PaymentProcessor {
	
	public void processPayment(Payment payment, double amount) {
		
		payment.pay(amount);
		
	}

}
