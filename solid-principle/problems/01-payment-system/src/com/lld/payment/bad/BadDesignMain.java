package com.lld.payment.bad;

public class BadDesignMain {
    public static void main(String[] args) {

        PaymentService service = new PaymentService();
        service.processPayment(1, 1000, "UPI");
    }
}
