# 🐕 Pet Health Tracking System

> An Object-Oriented Java application for monitoring pet health metrics

## 👥 Team Members

* **Earl John Lingon**
* **Jim Ruzzel Marasigan**
* **Amiel Harold Manalo**

**Course:** IT 2112

---

## 📝 Overview

The **Pet Health Tracking System** is a Java-based application designed to help pet owners and veterinarians monitor essential pet health data.
It uses Object-Oriented Programming to maintain:

* Weight history
* Vaccination records
* Allergies and medications
* Health risk assessments

The system is especially useful for pets with chronic or sensitive health issues.

---

## ✨ Features

### ➕ Add Pet Health Profile

Store essential pet information including name, weight, and vaccinations.

### ⚖️ Update Weight

Track changes in pet weight over time.

### 💉 Add Vaccination

Record new vaccinations with date and type.

### ⚠️ Check Health Risks

Analyze potential health concerns such as weight issues or missing shots.

### 📄 Generate Health Report

Produce a detailed summary of pet health records.

---

# 🐾 Pet Health Monitoring System

A Java-based OOP project for reliable pet health tracking.

---

## 🏗️ Project Structure

### **1. HealthProfile (Model Class)**

Stores pet data and performs health-related logic.

### **2. Main (Controller Class)**

Handles user menu, input, and program flow.

---

## 🧩 System Components

| Component           | Class                | Role                               |
| ------------------- | -------------------- | ---------------------------------- |
| **Data Layer**      | `HealthProfile.java` | Stores & processes pet health data |
| **Interface Layer** | `Main.java`          | Manages user input/output          |
| **Validation**      | Both                 | Ensures data integrity             |

---

## 🔗 Class Relationship

* `Main` **creates and controls** `HealthProfile` objects
* `HealthProfile` **contains all logic**
* UI is cleanly separated from data logic

---
# 🧠 Object-Oriented Principles Implemented

### 🔒 Encapsulation

```java
public class HealthProfile {
    private String petName;
    private double currentWeight;
    private List<String> vaccinations = new ArrayList<>();

    public String getPetName() { return petName; }
    public double getCurrentWeight() { return currentWeight; }
    public void setCurrentWeight(double weight) { this.currentWeight = weight; }
}
```

Encapsulation protects data by keeping attributes private and exposing only safe public methods.

---

### 🧬 Inheritance

The system uses inheritance by having `Pet` or other specialized classes extend a base `HealthProfile` class.

Example:

```java
public class Pet extends HealthProfile {
    // Pet inherits all fields and methods from HealthProfile
}
```

This allows subclasses to reuse and expand the parent class’s functionality — reducing code duplication and improving structure.

---

### 🎭 Polymorphism

Methods such as `checkRisk()` or `generateReport()` may be overridden by subclasses to customize behavior.

Example:

```java
@Override
public void checkRisk() {
    // Custom risk checking for a specific animal type
}
```

---

### 🧩 Abstraction

The system may use an **abstract class** like `HealthProfile` to provide a template for essential behavior while hiding internal logic.

Example:

```java
public abstract class HealthProfile {
    public abstract void checkRisk();
    public abstract void generateReport();
}
```

Abstraction hides complexity and forces subclasses to implement only the necessary behaviors.

## 💻 Example Usage

Below is an example of how the system behaves through the console.

---

## 🧮 Update Weight

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6): 2
Enter new weight for Bella (kg): 24.5
✓ Weight updated from 23.8 kg to 24.5 kg
```

---

## 💊 Add Vaccination

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6): 3
Enter vaccination name to add: Rabies 2025
✓ Added vaccination: Rabies 2025
```

---

## ⚠️ Check Health Risks

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6): 4
Checking health risks for Bella...
⚠ Warning: Overweight! (24.5 kg)
```

---

## 📊 Generate Health Report

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6): 5
========================================
         Health Report for Bella
========================================
Name: Bella
Weight: 24.5 kg
Vaccinations:
  - Rabies 2024
  - Distemper
  - Rabies 2025
========================================
```

---

## 👋 Exit Program

```
===== MAIN MENU =====
1. Create Pet Profile
2. Update Weight
3. Add Vaccination
4. Check Health Risks
5. Generate Health Report
6. Exit

Enter your choice (1-6): 6
Thank you for using Pet Health Tracker!
Goodbye!
```

---

# 🤝 Acknowledgment

We sincerely thank our instructor for the guidance, support, and feedback throughout this project.
We also appreciate our classmates and peers for their cooperation and encouragement.

---

# ⚠️ Disclaimer

This project is for **educational use only**.
It is not intended to replace real veterinary assessments.
Always consult a licensed veterinarian for actual pet health concerns.
