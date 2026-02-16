package com.lld.payment;

public class PaymentProcessor {
	
	public void processPayment(double payment, String paymentType) {
		
		if(paymentType.equalsIgnoreCase("creditcard")) {
			System.out.println("Payment of amount - "+payment+" processed by credit card");;
		}
		
		else if(paymentType.equalsIgnoreCase("upi")) {
			System.out.println("Payment of amount - "+payment+" processed by UPI");;
		}
		
		else if (paymentType.equalsIgnoreCase("debitcard")) {
			System.out.println("Payment of amount - "+payment+" processed by debit card");;
		}
		
		else {
			System.out.println("Invalid payment type");
		}
		
	}

}
