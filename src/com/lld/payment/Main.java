package com.lld.payment;

public class Main {
	
	public static void main(String[] args) {
		
		PaymentProcessor process = new PaymentProcessor();
		
		process.processPayment(25.56, "creditCard");
		process.processPayment(45.56, "debitcard");
		process.processPayment(25.56, "upi");
		process.processPayment(25.56, "crypto");
		
	}

}
