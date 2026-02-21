package com.llm.order.bad;

public class OrderService {

    public void createOrder(int orderId, double amount, String paymentType) {

        // 1. Validate
        if (amount <= 0) {
            throw new RuntimeException("Invalid amount");
        }

        System.out.println("Validating order...");

        // 2. Process Payment (IF-ELSE HELL)
        if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI payment");
        } else if (paymentType.equals("CARD")) {
            System.out.println("Processing Card payment");
        } else {
            throw new RuntimeException("Unsupported payment type");
        }

        // 3. Save to DB (Tightly coupled to MySQL)
        System.out.println("Connecting to MySQL...");
        System.out.println("Saving order " + orderId + " in MySQL DB");

        // 4. Send Email
        System.out.println("Sending confirmation email");
    }
}
