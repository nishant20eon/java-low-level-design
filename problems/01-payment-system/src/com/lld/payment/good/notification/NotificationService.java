package com.lld.payment.good.notification;

import com.lld.payment.good.model.Payment;

public interface NotificationService {
    void notifyUser(Payment payment);
}
