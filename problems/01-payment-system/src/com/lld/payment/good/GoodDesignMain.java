package com.lld.payment.good;

import com.lld.payment.good.model.Payment;
import com.lld.payment.good.notification.EmailNotificationService;
import com.lld.payment.good.repository.MySQLPaymentRepository;
import com.lld.payment.good.service.PaymentService;
import com.lld.payment.good.strategy.UpiPayment;

public class GoodDesignMain {
    public static void main(String[] args) {

        Payment payment = new Payment(1, 1000);

        PaymentService service = new PaymentService(
                new UpiPayment(),
                new MySQLPaymentRepository(),
                new EmailNotificationService()
        );

        service.processPayment(payment);
    }
}
