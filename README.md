## QuantityManagementSystem♨️📈

A Maven-based Java application that demonstrates object-oriented design principles
by implementing length equality comparison across multiple development stages (UC1, UC2, UC3).

The project evolves incrementally using Git branches to demonstrate refactoring,
DRY principle, abstraction, polymorphism, and clean architecture.

---


### 📌 Project Overview

A generic, extensible, and SOLID-compliant Java application for performing measurement operations across multiple categories:

- Length
- Weight
- Volume
- Temperature (with selective arithmetic support)

The system evolves incrementally from **UC1 to UC14**, demonstrating clean architecture, generics, functional interfaces, lambda expressions, and interface refactoring principles.

Design a scalable and type-safe measurement system that:

- Supports unit conversion
- Maintains cross-category isolation
- Centralizes arithmetic logic
- Enforces operation validity constraints
- Demonstrates real-world object-oriented design

---

### Project Structure🏗 

#### 🏗 Project Structure (Maven)

```
quantity-measurement-app/
│
├── pom.xml
├── .gitignore
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/quantity/
│   │           ├── app/
│   │           └── domain/
│   │               ├── length/
|   |               └── weight/
│   │
│   └── test/
│       └── java/
│           └── com/quantity/
│               └── domain/
│                   └── length/
│
└── target/
```

---

## 🌿 Branch Structure

The project follows incremental development across branches:

### 🚀 Features Overview (UC1 – UC14)

#### 🔹 UC1 – Equality for Same Unit
- Compare same-unit quantities.

#### 🔹 UC2 – Null Handling
- Null unit validation.
- equals(null) handling.

#### 🔹 UC3 – Different Value Inequality
- Detect unequal quantities.

#### 🔹 UC4 – Cross Unit Comparison (Length)
- Feet ↔ Inch comparison.
- Base unit conversion introduced.

#### 🔹 UC5 – Additional Length Units
- Yard, Centimeter support.
- Scalable enum design.

#### 🔹 UC6 – Weight Measurement
- Gram, Kilogram support.
- Cross-category restriction.

#### 🔹 UC7 – Volume Measurement
- Liter, Milliliter, Gallon.
- Generic isolation via `<U extends IMeasurable>`.

#### 🔹 UC8 – Addition Operation
- Add compatible quantities.
- Base-unit arithmetic logic.

#### 🔹 UC9 – Subtraction Operation
- Subtract quantities.
- Precision rounding.

#### 🔹 UC10 – Division Operation
- Division with zero validation.

#### 🔹 UC11 – Volume Arithmetic Support
- Extended arithmetic support for volume.

#### 🔹 UC12 – Centralized Arithmetic Enum
- Introduced `ArithmeticOperation`.
- Used `DoubleBinaryOperator`.
- Removed duplication.

#### 🔹 UC13 – Arithmetic Refactoring
- Unified `performArithmetic()` method.
- Clean reusable design.

#### 🔹 UC14 – Temperature Measurement (Selective Arithmetic)
