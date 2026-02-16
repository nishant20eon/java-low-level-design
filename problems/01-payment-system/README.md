## Problem: Payment Processing System

We need to design a system that can process different types of payments.

### Supported Payments (Initial Version)

* Credit Card
* Debit Card
* UPI

### Requirements

1. A user should be able to make a payment using any method.
2. The system should print confirmation of the payment.
3. In future, we must support new payment types like:

   * Wallet
   * NetBanking
   * Crypto
4. Adding new payment types should NOT break existing code.

### Goal

Design this system using SOLID principles so it is easy to extend.

## Design Evolution — Payment System

### Step 1: Initial Naive Design

We started with a single `PaymentProcessor` class:

* Used `if-else` to decide payment type.
* Contained all business logic.
* Looked simple but had serious design issues.

#### Problems Identified

1. **Violates Single Responsibility Principle (SRP)**

   * `PaymentProcessor` was deciding type AND executing payment logic.

2. **Violates Open/Closed Principle (OCP)**

   * Adding a new payment (e.g., Wallet) required modifying the class.
   * This risks breaking existing functionality.

3. **Hardcoded Behavior**

   * Logic tightly coupled to string values like `"CREDIT"`.

4. **Not Scalable**

   * With 10+ payment types, the class would become unmaintainable.

---

### Step 2: Refactoring Toward SOLID

We introduced an abstraction:

```
Payment (interface)
```

Each payment type now implements its own behavior:

* `CreditCardPayment`
* `DebitCardPayment`
* `UpiPayment`

#### Improvements

✅ Applied **Single Responsibility Principle**

* Each class now has only one reason to change.

✅ Behavior moved to polymorphic implementations.

* Removed conditional complexity.

---

### Step 3: Refactored Processor to Use Abstraction

`PaymentProcessor` now depends on:

```
Payment interface instead of concrete classes
```

This means:

* Processor does not know *how* payment happens.
* It only triggers the behavior.

#### Improvements

✅ Applied **Dependency Inversion Principle (DIP)**
High-level module depends on abstraction, not details.

---

### Current Status

System is now:

* Extensible
* Loosely coupled
* Ready to support new payment methods without modification.

