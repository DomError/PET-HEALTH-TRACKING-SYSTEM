# 🐕 Pet Health Tracking System

> An Object-Oriented Java application for monitoring pet health metrics

## 👥 Team Members
- **Earl John Lingon**
- **Jim Ruzzel Marasigan**
- **Amiel Harold**

**Course:** IT 2112

## 📝 Overview

The Pet Health Tracking System is a Java-based software project that implements Object-Oriented Programming principles to help pet owners and veterinarians monitor pets' overall health. The system maintains comprehensive health records including vaccinations, weight changes, allergies, medications, and general health risks.

This project addresses a practical need for pet owners—especially those with pets having sensitive health conditions—by providing an organized way to track and analyze pet health data.

## ✨ Features

### ➕ **Add Pet Health Profile**
Create new pet records with essential details including name, weight, and vaccination history.

### ⚖️ **Update Weight**
Modify and track changes in a pet's weight over time with complete change history.

### 💉 **Add Vaccination**
Record new vaccinations with dates and types for accurate health monitoring.

### ⚠️ **Check Health Risks**
Automatically detect health concerns including underweight/overweight conditions and missing vaccinations.

### 📄 **Generate Health Report**
Create comprehensive health summaries displaying weight, vaccination history, and risk alerts.

# Pet Health Monitoring System 🐾

A Java-based application for tracking and managing pet health information including weight monitoring, vaccination records, and health risk assessment.

## 🏗️ Project Structure

### **1. HealthProfile (Main Class)**
The core data model that manages all pet health information and business logic.

**Responsibilities:**
- Holds pet attributes: `petName`, `currentWeight`, `vaccinations`
- Provides health assessment and reporting methods
- Manages data validation and business rules

**Key Methods:**
- `checkRisk()` - Assesses health risks based on weight and vaccination status
- `generateReport()` - Creates comprehensive health reports
- `addVaccination()` - Updates vaccination records
- `setCurrentWeight()` - Updates weight with validation

### **2. Main (Controller Class)**
The user interface controller that manages all user interactions.

**Features:**
- 6-option menu system for complete program control
- Comprehensive input validation and error handling
- Clean user interface with formatted output
- Program flow management and HealthProfile method coordination

## 🧩 System Components

| Component | Class | Responsibility |
|-----------|-------|----------------|
| **Data Layer** | `HealthProfile.java` | Stores and processes pet health information |
| **Interface Layer** | `Main.java` | Handles user input and displays output |
| **Validation** | Both Classes | Ensures data integrity through input validation |

## 🔗 Class Relationship

- **Main class** creates and uses HealthProfile objects
- **HealthProfile class** contains all pet health logic
- Clear separation of concerns between data management and user interface

## 🎯 Key Features

- **Weight Monitoring**: Track and validate pet weight changes
- **Vaccination Management**: Maintain up-to-date vaccination records
- **Health Risk Assessment**: Automated health risk evaluation
- **Comprehensive Reporting**: Detailed health status reports
- **Robust Validation**: Input validation for data integrity

## 📋 Usage

1. Create a new `HealthProfile` for your pet
2. Use the interactive menu system to:
   - Update weight information
   - Add vaccination records
   - Check health risks
   - Generate health reports
   - View all stored information

## 🛠️ Technical Design

The system follows a clear MVC-inspired pattern where:
- **Model**: `HealthProfile` (data + business logic)
- **Controller**: `Main` (user interaction + flow control)
- **View**: Console output (managed by Main class)

This separation ensures maintainable code where health logic is isolated from user interface concerns, making the system easy to extend and modify.


### 🩺 **HealthProfile Class**
Core class that manages pet health data with the following attributes:
- `petName` (String): Name of the pet
- `currentWeight` (double): Current weight in kilograms
- `vaccinations` (List<String>): List of vaccinations received

**Key Methods:**
- `updateWeight(double newWeight)`: Updates and tracks weight changes
- `addVaccination(String vaccine)`: Adds new vaccination records
- `checkRisk()`: Analyzes weight and vaccination status for potential risks
- `generateReport()`: Creates detailed health summary

### 📋 **Menu System**
Interactive console interface providing the following options:
1. Add new pet profile
2. Update pet weight
3. Add vaccination record
4. Check health risks
5. Generate health report
6. Exit system

## 🧠 Object-Oriented Principles Implemented

### 🔒 **Encapsulation**
All attributes in the `HealthProfile` class are declared as `private` with controlled access through public getter and setter methods:

```java
public class HealthProfile {
    private String petName;
    private double currentWeight;
    private List<String> vaccinations = new ArrayList<>();
    
    public String getPetName() { return petName; }
    public double getCurrentWeight() { return currentWeight; }
    public void setCurrentWeight(double weight) { this.currentWeight = weight; }
}

## 🎭 Abstraction
The `HealthProfile` class provides a clear, high-level interface for managing pet health data without exposing internal implementation details. Methods like `checkRisk()` and `generateReport()` offer simplified interaction with complex health data.

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or higher**
- **Command-line interface (Terminal/CMD)**

### Installation & Execution

1. **Clone or download the project files**
   ```bash
   git clone [repository-url]
   cd Pet-Health-Tracking-System
