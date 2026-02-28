package com.lld.order.good;


import com.lld.order.good.model.Order;
import com.lld.order.good.notification.EmailNotificationService;
import com.lld.order.good.notification.NotificationService;
import com.lld.order.good.payment.PaymentMethod;
import com.lld.order.good.payment.UpiPayment;
import com.lld.order.good.repository.MySQLOrderRepository;
import com.lld.order.good.repository.OrderRepository;
import com.lld.order.good.service.OrderService;

public class GoodDesignMain {

    public static void main(String[] args) {

        Order order = new Order(1, 1000);

        OrderRepository repository = new MySQLOrderRepository();
        PaymentMethod paymentMethod = new UpiPayment();
        NotificationService notificationService = new EmailNotificationService();

        OrderService orderService =
                new OrderService(repository, paymentMethod, notificationService);

        orderService.createOrder(order);
    }
}
