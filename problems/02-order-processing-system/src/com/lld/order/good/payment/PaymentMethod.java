package com.lld.order.good.payment;

import com.lld.order.good.model.Order;

public interface PaymentMethod {

        void pay(Order order);
}
