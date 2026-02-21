# order processing system -- Design Document

## 1. System Goal

Design an order processing system that:

-   Validates order
-   Processes payment
-   Saves order
-   Sends notification

The system must be:

-   Extensible
-   Testable
-   Maintainable
-   SOLID compliant

------------------------------------------------------------------------

# 2. High-Level Design

OrderService orchestrates the workflow:

OrderService → PaymentMethod (Strategy) → OrderRepository (Persistence
abstraction) → NotificationService (Communication abstraction)

------------------------------------------------------------------------

# 3. Component Breakdown

## 3.1 Order (Model)

Represents domain entity.

Responsibilities: - Store order id - Store order amount

------------------------------------------------------------------------

## 3.2 PaymentMethod (Strategy Pattern)

Interface: void pay(Order order);

Implementations: - UpiPayment - CardPayment - WalletPayment (future
extension)

Why Strategy? - Enables Open-Closed Principle - Avoids if-else logic
explosion

------------------------------------------------------------------------

## 3.3 OrderRepository (Repository Pattern)

Interface: void save(Order order);

Implementation: - MySQLOrderRepository

Benefits: - Can switch to MongoDB without modifying OrderService -
Follows Dependency Inversion Principle

------------------------------------------------------------------------

## 3.4 NotificationService

Interface: void notifyUser(Order order);

Implementation: - EmailNotificationService

Can extend: - SMSNotificationService - PushNotificationService

------------------------------------------------------------------------

# 4. Workflow Sequence

1.  OrderService.createOrder()
2.  Validate order
3.  PaymentMethod.pay()
4.  OrderRepository.save()
5.  NotificationService.notifyUser()

------------------------------------------------------------------------

# 5. Design Improvements Over Bad Version

Feature            Bad Design              Good Design
  ------------------ ----------------------- ------------------------
Payment Handling   if-else                 Strategy Pattern
Database           Hardcoded MySQL         Repository Abstraction
Notification       Hardcoded Email         Interface-based
Testability        Hard                    Easy via mocking
Extensibility      Modify existing class   Add new implementation

------------------------------------------------------------------------

# 6. Extensibility Examples

To add Wallet Payment: - Create class implementing PaymentMethod - No
modification in OrderService

To add MongoDB: - Create MongoOrderRepository - Inject in main

No core business logic changes required.

------------------------------------------------------------------------

# 7. Conclusion

This design demonstrates clean Low-Level Design principles used in
real-world backend systems.

It is suitable for: - Interviews - Production-grade systems -
Microservice architecture foundation
