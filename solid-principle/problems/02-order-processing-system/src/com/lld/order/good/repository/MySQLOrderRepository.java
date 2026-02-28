package com.lld.order.good.repository;

import com.lld.order.good.model.Order;

public class MySQLOrderRepository implements OrderRepository {

    public void save(Order order) {
        System.out.println("Saving order" + order + "in MySQL");
    }
}
