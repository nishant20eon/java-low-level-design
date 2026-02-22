package com.lld.payment.good.strategy;

import com.lld.payment.good.model.Payment;

public interface PaymentMethod {
    void pay(Payment payment);
}
