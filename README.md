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
