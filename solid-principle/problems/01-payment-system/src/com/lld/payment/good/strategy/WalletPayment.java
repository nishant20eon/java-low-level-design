package com.lld.payment.good.strategy;

import com.lld.payment.good.model.Payment;

public class WalletPayment implements PaymentMethod {

    @Override
    public void pay(Payment payment) {
        System.out.println("Processing Wallet payment of " + payment.getAmount());
    }
}
