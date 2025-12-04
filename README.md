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

## 🏗️ Project Structure
📦 Pet-Health-Tracking-System/
├── 📂 src/                           # Source code directory
│   ├── 📄 HealthProfile.java        # Main class with pet health logic
│   │   ├── Attributes: petName, currentWeight, vaccinations
│   │   ├── Methods: checkRisk(), generateReport(), addVaccination()
│   │   └── Responsibility: Encapsulates all pet health data and business logic
│   │
│   └── 📄 Main.java                 # Console-based menu system
│       ├── Menu with 6 options
│       ├── Input validation and error handling
│       └── Program flow and user interaction
│
├── 📄 README.md                     # Project documentation (this file)
└── (Optional) 📄 .gitignore         # Git exclusion rules for compiled files
