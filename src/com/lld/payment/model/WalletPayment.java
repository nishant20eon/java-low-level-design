package com.lld.payment.model;

public class WalletPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of amount - "+amount+" processed by Wallet Payment");
	}

}
