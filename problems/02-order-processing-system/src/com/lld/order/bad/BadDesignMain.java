package com.lld.order.bad;

public class BadDesignMain {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.createOrder(1, 1000, "UPI");
    }
}
