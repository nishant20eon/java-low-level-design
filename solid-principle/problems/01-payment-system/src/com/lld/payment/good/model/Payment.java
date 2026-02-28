package com.lld.payment.good.model;

public class Payment {

    private int id;
    private double amount;

    public Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() { return id; }
    public double getAmount() { return amount; }
}
