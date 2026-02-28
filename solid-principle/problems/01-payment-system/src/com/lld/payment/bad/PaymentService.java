package com.lld.payment.bad;
// BAD DESIGN - Monolithic and tightly coupled

public class PaymentService {

    public void processPayment(int paymentId, double amount, String paymentType) {

        // 1. Validate
        if (amount <= 0) {
            throw new RuntimeException("Invalid payment amount");
        }

        System.out.println("Validating payment...");

        // 2. Process Payment (IF-ELSE HELL)
        if (paymentType.equalsIgnoreCase("UPI")) {
            System.out.println("Connecting to UPI gateway...");
            System.out.println("Processing UPI payment of " + amount);
        }
        else if (paymentType.equalsIgnoreCase("CARD")) {
            System.out.println("Validating card...");
            System.out.println("Processing CARD payment of " + amount);
        }
        else if (paymentType.equalsIgnoreCase("WALLET")) {
            System.out.println("Checking wallet balance...");
            System.out.println("Processing WALLET payment of " + amount);
        }
        else {
            throw new RuntimeException("Unsupported payment type");
        }

        // 3. Save to Database (Hardcoded MySQL)
        System.out.println("Connecting to MySQL...");
        System.out.println("Saving payment " + paymentId + " in DB");

        // 4. Send Notification (Hardcoded Email)
        System.out.println("Sending confirmation email...");

        System.out.println("Payment Successful!");
    }
}