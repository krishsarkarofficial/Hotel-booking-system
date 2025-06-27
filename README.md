# Hotel-booking-system
A basic code on java that tests the fundamental functionalities of Java
# 🏨 Hotel Reservation System - Java Application

This Java application is a **Hotel Reservation System**, allowing users to view available rooms, make bookings, and cancel reservations.

---

## ✨ Features

1. **Room Types**  
   - The hotel supports two room types: **Suite Room** and **Standard Room**.  
   - Each room has attributes like **room number**, **price**, and **availability status**.

2. **Reservation Options**  
   - **View Available Rooms**:  
     Displays rooms that are currently available, showing room numbers and prices.  
   - **Book a Room**:  
     Users input the room number and customer details (name, email, phone).  
     If the room is available, a `Reservation` object is created linking the customer and the room.  
   - **Cancel Reservation**:  
     Users can cancel an existing reservation by entering the room number.  
     The room's availability status is updated accordingly.

3. **Exit Option**  
   - Cleanly exits the system.

> The main loop offers these options continuously, allowing users to manage reservations efficiently.  
> The application ensures that only available rooms can be booked and only reserved rooms can be cancelled.

---

## 🛠️ Software & Hardware Requirements

### 1. IDE
- **IntelliJ IDEA** or **Eclipse**  
  These are recommended IDEs for Java development, offering features like code completion, debugging, and project management.

### 2. Java Version
- **Java 8** or later  
  Compatible with Java SE 8.  
  Using **Java 11** or **Java 17** (LTS versions) is recommended for modern enhancements and better runtime performance.

### 3. Libraries
- Uses only **standard Java libraries**  
  - e.g., `java.util.Scanner`  
  - No external dependencies required.

### 4. Execution Platform
- **Java Virtual Machine (JVM)**  
  Runs on any OS (Windows, macOS, Linux) with the correct Java version installed.
  
- **Command-Line Interface (CLI)**  
  Can be compiled and executed via terminal or command prompt without needing an IDE.

---

## 📦 How to Run

```bash
javac Main.java
java Main
