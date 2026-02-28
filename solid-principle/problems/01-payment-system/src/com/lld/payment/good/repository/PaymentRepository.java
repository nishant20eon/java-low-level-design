package com.lld.payment.good.repository;

import com.lld.payment.good.model.Payment;

public interface PaymentRepository {
    void save(Payment payment);
}
