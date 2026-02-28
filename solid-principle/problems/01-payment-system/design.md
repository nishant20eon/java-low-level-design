# Payment System -- Design Document

## 1. Objective

Design a payment system that:

-   Validates payment
-   Processes payment
-   Saves transaction
-   Sends notification

The system must be extensible and SOLID compliant.

------------------------------------------------------------------------

# 2. High-Level Design

PaymentService orchestrates:

PaymentService -\> PaymentMethod (Strategy) -\> PaymentRepository
(Persistence) -\> NotificationService (Notification)

------------------------------------------------------------------------

# 3. Component Breakdown

## 3.1 Payment (Model)

Represents payment entity with id and amount.

------------------------------------------------------------------------

## 3.2 PaymentMethod (Strategy Pattern)

Interface: void pay(Payment payment);

Implementations: - UpiPayment - CardPayment - WalletPayment

Purpose: - Avoid if-else logic - Follow Open-Closed Principle

------------------------------------------------------------------------

## 3.3 PaymentRepository

Interface: void save(Payment payment);

Implementation: - MySQLPaymentRepository

Purpose: - Decouple database layer - Follow Dependency Inversion
Principle

------------------------------------------------------------------------

## 3.4 NotificationService

Interface: void notifyUser(Payment payment);

Implementation: - EmailNotificationService

Purpose: - Decouple notification mechanism - Easily extend to SMS or
Push

------------------------------------------------------------------------

# 4. Workflow

1.  PaymentService.processPayment()
2.  Validate payment
3.  PaymentMethod.pay()
4.  PaymentRepository.save()
5.  NotificationService.notifyUser()

------------------------------------------------------------------------

# 5. Conclusion

This design demonstrates clean LLD principles and is suitable for
interviews and production-level backend systems.
