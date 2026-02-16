package com.lld.payment;

import com.lld.payment.model.CreditCardPayment;
import com.lld.payment.model.DebitCardPayment;
import com.lld.payment.model.Payment;
import com.lld.payment.model.UpiPayment;
import com.lld.payment.model.WalletPayment;

public class Main {
	
	public static void main(String[] args) {
		
		Payment paymentType;
		
		PaymentProcessor process = new PaymentProcessor();
		
		paymentType = new CreditCardPayment();
		process.processPayment(paymentType, 8585.78);
		
		paymentType = new DebitCardPayment();
		process.processPayment(paymentType, 8585.78);
		
		paymentType = new UpiPayment();
		process.processPayment(paymentType, 8585.78);
		
		paymentType = new WalletPayment();
		process.processPayment(paymentType, 5000);

		
	}

}
