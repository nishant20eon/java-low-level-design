package com.lld.order.good.service;

import com.lld.order.good.model.Order;
import com.lld.order.good.notification.NotificationService;
import com.lld.order.good.payment.PaymentMethod;
import com.lld.order.good.repository.OrderRepository;

public class OrderService {

    private OrderRepository orderRepository;
    private PaymentMethod paymentMethod;
    private NotificationService notificationService;

    public OrderService(OrderRepository orderRepository, PaymentMethod paymentMethod, NotificationService notificationService) {
        this.orderRepository = orderRepository;
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public void createOrder(Order order) {

        validateOrder(order);

        paymentMethod.pay(order);

        orderRepository.save(order);

        notificationService.sendNotification(order);

    }

    private void validateOrder(Order order) {
        if(order.getAmount() <= 0) {
            throw new IllegalArgumentException("Order amount must be greater than zero");
        }

        System.out.println("Validation successful for order ");
    }

}
