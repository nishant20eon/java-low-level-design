# 01 - Payment System (Bad vs Good Design)

## Overview

This module demonstrates:

1.  BAD Design (Monolithic, tightly coupled)
2.  GOOD Design (SOLID-based clean architecture)

The goal is to understand how poor design leads to rigid systems and how
applying SOLID principles improves maintainability and scalability.

------------------------------------------------------------------------

# BAD DESIGN

## Characteristics

-   One large PaymentService class
-   If-else payment handling
-   Hardcoded database logic
-   Hardcoded notification logic
-   No abstraction
-   No dependency injection

## SOLID Violations

Principle     Violation
  ------------- ---------------------------------------------------------
SRP           One class handles validation, payment, DB, notification
OCP           Adding new payment requires modifying class
DIP           Direct dependency on MySQL and Email
Testability   Cannot mock dependencies

------------------------------------------------------------------------

# GOOD DESIGN

## Architecture Components

-   Payment (Model)
-   PaymentMethod (Strategy Pattern)
-   PaymentRepository (Persistence abstraction)
-   NotificationService (Communication abstraction)
-   PaymentService (Orchestrator)

## SOLID Applied

Principle   Where Applied
  ----------- --------------------------------------
SRP         Each class has single responsibility
OCP         New payment types via strategy
LSP         All payment methods interchangeable
ISP         Small focused interfaces
DIP         Constructor injection

------------------------------------------------------------------------

## Benefits

-   Easy to extend
-   Easy to test
-   Easy to change database
-   Clean separation of concerns
-   Interview-ready architecture

------------------------------------------------------------------------

## Interview Summary

"In the bad design, PaymentService was tightly coupled and violated
multiple SOLID principles. I refactored using Strategy pattern for
payment processing and introduced abstractions for repository and
notification layers. Dependencies are injected via constructor, ensuring
extensibility and maintainability."
