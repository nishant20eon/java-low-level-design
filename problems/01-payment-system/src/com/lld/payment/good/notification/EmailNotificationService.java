package com.lld.payment.good.notification;

import com.lld.payment.good.model.Payment;

public class EmailNotificationService implements NotificationService {

    @Override
    public void notifyUser(Payment payment) {
        System.out.println("Sending email for payment " + payment.getId());
    }
}
