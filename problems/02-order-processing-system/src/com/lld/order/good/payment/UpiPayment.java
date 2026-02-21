package com.lld.order.good.payment;

import com.lld.order.good.model.Order;

public class UpiPayment implements PaymentMethod {

    @Override
    public void pay(Order order) {
        System.out.println("Paying for order " + order + " using UPI");
    }
}
