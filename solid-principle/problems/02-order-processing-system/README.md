# Payment System LLD -- Bad vs Good Design

## Overview

This module demonstrates:

1.  ❌ BAD Design (Monolithic, tightly coupled, violates SOLID)
2.  ✅ GOOD Design (Clean Low-Level Design applying SOLID principles)

The goal is to clearly understand how design decisions impact
scalability, testability, and maintainability.

------------------------------------------------------------------------

# 🔴 PART 1 -- BAD DESIGN

## Characteristics

-   Everything inside one class (`OrderService`)
-   If-else payment handling
-   Hardcoded database dependency (MySQL)
-   Hardcoded notification logic
-   No abstraction
-   No dependency injection

## Why It Is Bad

  -----------------------------------------------------------------------
Problem                        Explanation
  ------------------------------ ----------------------------------------
Violates SRP                   One class handles validation, payment,
DB, notification

Violates OCP                   Adding new payment requires modifying
existing code

Violates DIP                   Direct dependency on MySQL

Hard to test                   Cannot mock payment or DB

Hard to extend                 Every new feature modifies same class
-----------------------------------------------------------------------

## Risk

If tomorrow you add: - Wallet payment - SMS notification - MongoDB

You must modify `OrderService`.

That increases regression risk in production systems.

------------------------------------------------------------------------

# 🟢 PART 2 -- GOOD DESIGN

This design applies SOLID principles and clean architecture thinking.

## Structure

-   `Order` → Model
-   `OrderRepository` → Database abstraction
-   `PaymentMethod` → Strategy pattern
-   `NotificationService` → Notification abstraction
-   `OrderService` → Orchestration layer

------------------------------------------------------------------------

## SOLID Principles Applied

Principle   Applied Where
  ----------- ---------------------------------------------------
SRP         OrderService only controls workflow
OCP         New payment methods via strategy
LSP         All PaymentMethod implementations interchangeable
ISP         Small focused interfaces
DIP         Constructor injection using abstractions

------------------------------------------------------------------------

## Benefits

-   Easy to extend
-   Easy to test
-   Easy to switch database
-   Clean separation of concerns
-   Production-ready architecture pattern

------------------------------------------------------------------------

## Interview Explanation

"In the bad design, OrderService was tightly coupled and violated
multiple SOLID principles. I refactored using Strategy Pattern for
payment handling, introduced repository abstraction for database
interaction, and injected dependencies via constructor to follow DIP.
Now the system is extensible without modifying core business logic."
