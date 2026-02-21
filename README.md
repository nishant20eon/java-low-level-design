# 🧠 Java Low Level Design (LLD) Repository

This repository contains structured implementations of Low Level Design
(LLD) problems with a strong focus on:

-   SOLID Principles
-   Design Patterns
-   Clean Code Practices
-   Refactoring (Bad Design → Good Design)
-   Backend-Oriented System Modeling
-   Interview-Level Design Thinking

------------------------------------------------------------------------

# 🎯 Purpose of This Repository

This repo is built to:

-   Strengthen Low Level Design fundamentals
-   Demonstrate refactoring capability
-   Practice real-world backend system design
-   Prepare for Product-Based & FinTech companies
-   Showcase engineering maturity

Each problem is intentionally implemented in two stages:

-   Naive / Bad Design
-   Refactored Clean Design (Applying SOLID)

------------------------------------------------------------------------

# 📂 Repository Structure
```text
java-low-level-design/
│
├── README.md                → Root documentation (this file)
├── .gitignore
│
├── common/                  → Reusable utilities / shared components
│   └── diagrams/            → UML diagrams, architecture diagrams
│
├── problems/                → Each LLD problem is a separate folder
│
│   ├── 01-payment-system/
│   ├── 02-notification-system/
│   ├── 03-parking-lot/
│   ├── 04-splitwise/
│   └── XX-new-problem/
│
└── notes/
    ├── solid-principles.md
    ├── mistakes.md
    └── patterns-cheatsheet.md
```

📌 How to Add a New LLD Problem

Whenever adding a new system:

```text
problems/
   └── 05-order-processing-system/

```
Each problem MUST contain:

```text
05-order-processing-system/
│
├── README.md         → Problem explanation
├── design.md         → Thought process & refactoring notes
└── src/
    └── com/lld/<problem-name>/
```

🔴 How to Structure BAD vs GOOD Design

Inside each problem:

```text
src/com/lld/<problem-name>/
│
├── bad/              → Initial naive implementation
│   ├── OrderService.java
│   └── Main.java
│
└── good/             → Refactored clean design
    ├── model/
    ├── repository/
    ├── service/
    ├── strategy/
    ├── factory/      (if needed)
    └── Main.java
```
Rules:

-   BAD and GOOD must compile independently
-   BAD version should clearly violate design principles
-   GOOD version must apply SOLID and design patterns
-   Keep responsibilities separated

------------------------------------------------------------------------

# 🧠 Development Workflow (MANDATORY)

Step 1 -- Implement Naive Design\
Commit: git commit -m "Initial naive implementation - violates SOLID"

Step 2 -- Analyze Problems\
Document violations in design.md

Step 3 -- Refactor Using SOLID\
Commit: git commit -m "Refactored design applying SOLID principles"

------------------------------------------------------------------------

# 📘 What Goes in Problem README.md?

-   Problem description
-   Functional requirements
-   Non-functional considerations
-   Bad design explanation
-   Refactoring summary
-   Final architecture overview

------------------------------------------------------------------------

# 📘 What Goes in design.md?

-   Initial flawed approach
-   Identified design smells
-   Refactoring steps
-   Design patterns used
-   Final design reasoning
-   Future improvements

------------------------------------------------------------------------

# 📊 What Goes in common/diagrams?

-   UML Class Diagrams
-   Sequence Diagrams
-   Component Diagrams
-   draw.io files
-   Architecture sketches

------------------------------------------------------------------------

# 📚 What Goes in notes/?

-   SOLID explanation
-   Design pattern summaries
-   Common LLD mistakes
-   Interview storytelling tips
-   Refactoring checklist

------------------------------------------------------------------------

# 🏗 Coding Standards

-   Use meaningful package names
-   Keep classes small & focused
-   Prefer constructor injection
-   Avoid tight coupling
-   No God classes
-   No long if-else chains
-   Keep code readable & modular

------------------------------------------------------------------------

# 🔥 Design Checklist Before Marking Good Design

-   Single Responsibility maintained
-   No class doing multiple jobs
-   Interfaces used properly
-   Easy extensibility
-   Dependencies injected via constructor
-   Code testable
-   No tight coupling

If not satisfied → refactor again.

------------------------------------------------------------------------

# 🏆 Long-Term Goal

This repository should reflect:

-   Backend engineering thinking
-   Architectural clarity
-   Clean separation of concerns
-   Real-world extensibility
-   Interview-level explanation readiness

------------------------------------------------------------------------

# 👨‍💻 Author

-   Nishant Kumar
-   Java Backend Developer
-   Focused on Clean Architecture, SOLID, and System Design
