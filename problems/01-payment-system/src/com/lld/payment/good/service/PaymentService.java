package com.lld.payment.good.service;

import com.lld.payment.good.model.Payment;
import com.lld.payment.good.notification.NotificationService;
import com.lld.payment.good.repository.PaymentRepository;
import com.lld.payment.good.strategy.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;
    private PaymentRepository paymentRepository;
    private NotificationService notificationService;

    public PaymentService(PaymentMethod paymentMethod,
                          PaymentRepository paymentRepository,
                          NotificationService notificationService) {
        this.paymentMethod = paymentMethod;
        this.paymentRepository = paymentRepository;
        this.notificationService = notificationService;
    }

    public void processPayment(Payment payment) {

        validate(payment);

        paymentMethod.pay(payment);

        paymentRepository.save(payment);

        notificationService.notifyUser(payment);

        System.out.println("Payment Successful!");
    }

    private void validate(Payment payment) {
        if (payment.getAmount() <= 0) {
            throw new RuntimeException("Invalid amount");
        }
        System.out.println("Validating payment...");
    }
}
