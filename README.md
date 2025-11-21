## 📄 Description - Exercise Statement

This is the seventh task for **Sprint 1 Java Language** in the **Backend Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

### Level 1

#### Exercise 1

Create a hierarchy of objects with three classes: Worker, OnlineWorker, and InPersonWorker.

The Worker class has the attributes name, surname, price/hour, and the method calculateSalary() that takes as a parameter the number of hours worked and multiplies it by the price/hour. The child classes must override this method using @Override.

From the main() method of the Main class, make the necessary calls to demonstrate the functioning of the @Override annotation.

In InPersonWorkers, the method to calculate their salary will receive the number of hours worked in the month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute called fuel that we will add in this class.

In online workers, the method to calculate their salary will receive the number of hours worked in the month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour and the price of a flat-rate Internet service, which will be a constant in the OnlineWorker class, will be added.

#### Exercise 2

Add some deprecated methods to the child classes and use the corresponding annotation. Invoke the deprecated methods from an external class, suppressing the “warnings” for being deprecated using the corresponding annotation.

### Level 2

#### Exercise 1

Create a custom annotation that allows a Java object to be serialized into a JSON file. The annotation must receive the directory where the resulting file will be placed.

### Level 3

#### Exercise 1

Add the possibility for the annotation created in the previous level to be registered by the Virtual Machine at runtime. Demonstrate that the reading of the annotation is executed using **Java Reflection.**

## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under *Java version* : openjdk 21.0.8 2025-07-15.


