package com.lld.order.good.notification;

import com.lld.order.good.model.Order;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(Order order) {
        // Logic to send email notification
        System.out.println("Sending Email for order " + order.getOrderId());
    }
}
