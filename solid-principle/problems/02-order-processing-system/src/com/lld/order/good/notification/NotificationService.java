package com.lld.order.good.notification;

import com.lld.order.good.model.Order;

public interface NotificationService {

        void sendNotification(Order order);
}
