package com.lld.payment.good.repository;

import com.lld.payment.good.model.Payment;

public class MySQLPaymentRepository implements PaymentRepository {

    @Override
    public void save(Payment payment) {
        System.out.println("Saving payment " + payment.getId() + " in MySQL DB");
    }
}
