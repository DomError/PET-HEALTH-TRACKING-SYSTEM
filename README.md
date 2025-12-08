# 🐕 Pet Health Tracking System

### *An Object-Oriented Java application for monitoring pet health metrics*

---

## 👥 Team Members

* **Earl John Lingon**
* **Jim Ruzzel Marasigan**
* **Amiel Harold Manalo**
  **Course:** IT 2112

---

## 📝 Overview

The **Pet Health Tracking System** is a Java OOP project that allows pet owners and veterinarians to record and monitor essential pet health information.
It supports multiple pet types using inheritance (`Dog`, `Cat`) and an abstract class (`Pet`).

The system monitors:

* Weight history
* Vaccination records
* Health risk evaluation
* Auto-generated health reports

---

## ✨ Features

### ➕ Create Pet Profile

Choose pet type (dog/cat), set name, and assign initial weight.

### ⚖️ Update Weight

Record changes in pet weight, which may indicate health issues.

### 💉 Add Vaccination

Store vaccinations and track if the pet has incomplete immunization.

### ⚠️ Check Health Risks

Automatic risk assessment based on:

* Weight category (underweight/overweight)
* Number of vaccinations
* Pet-specific risk rules (dog/cat)

### 📄 Generate Health Report

Prints a full summary of:

* Name
* Weight
* Vaccinations
* Risk evaluation

---

# 🐾 System Architecture

## 🏗️ Project Structure

| Component / Layer     | Class File              | Description                                                         |
| --------------------- | ----------------------- | ------------------------------------------------------------------- |
| **Data Layer**        | `HealthProfile.java`    | Stores and processes pet health data (weight, vaccines, risk logic) |
| **Abstraction Layer** | `Pet.java` (abstract)   | Base class for all pet types                                        |
| **Subclasses**        | `Dog.java`, `Cat.java`  | Implement pet-specific behaviors and risk rules                     |
| **Controller / UI**   | `PetHealthTracker.java` | User menu, inputs, interactions                                     |

---

# 🔗 Class Relationships

* `PetHealthTracker` creates objects of `Dog` or `Cat`
* Each `Dog`/`Cat` has a `HealthProfile`
* `Pet` (abstract) is the parent class of all pet types
* Method overriding is used for polymorphic risk checks and sounds

---

# 🧠 Object-Oriented Principles Implemented

## 🔒 **Encapsulation**

Sensitive data (name, weight, vaccinations) is stored privately inside `HealthProfile`.
Data can only be modified through public methods:

```java
private String petName;
private double currentWeight;
private List<String> vaccinations;
```

## 🧬 **Inheritance**

`Dog` and `Cat` extend the abstract `Pet` class:

```java
class Dog extends Pet { ... }
class Cat extends Pet { ... }
```

This allows specialized pet behavior while reusing base logic.

## 🎭 **Polymorphism**

Different pet types override `makeSound()` and `checkRisk()`:

```java
@Override
public void checkRisk() {
    System.out.println("\nDog-specific health check...");
    super.checkRisk();
}
```

The program calls these methods using **pet references**, not subclass names.

## 🧩 **Abstraction**

`Pet` is an *abstract class* that defines basic requirements for all pet types:

```java
public abstract class Pet {
    public abstract void makeSound();
}
---
```
# 🎯 MAIN MENU (Updated)

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6):
