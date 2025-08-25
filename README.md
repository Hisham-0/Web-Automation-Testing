# Web Automation Task – Checkout Flow Validation

## 📌 Project Overview

An automated **web testing project** using **Selenium WebDriver** and **TestNG** in **IntelliJ IDEA**.  
The project validates the **checkout flow** on the demo e-commerce website:  
🔗 [Practice Software Testing](https://practicesoftwaretesting.com/)

The test ensures **registration, login, product selection, checkout process, shipping/billing input, and order confirmation** all work as expected.

---

### 🔹 1. Test Scope & Flow

1. **User Registration & Login**

   - Register a new user account (data-driven).
   - Log in with registered credentials.

2. **Product Selection & Cart Addition**

   - Navigate to product catalog.
   - Select product (parameterized for multiple products).
   - Add product to cart.

3. **Checkout Process**

   - Proceed to checkout page.

4. **Shipping & Billing Information**

   - Input shipping and billing details (data-driven).

5. **Order Completion**
   - Submit order.
   - Verify confirmation page/message is displayed.

---

### 🔹 2. Technical Details

- **IDE**: IntelliJ IDEA
- **Framework**: TestNG
- **Automation Tool**: Selenium WebDriver
- **Language**: Java
- **Build Tool**: Maven

---

### 🔹 3. Features

- **Data-Driven Testing** – supports multiple datasets (users, products, shipping, billing).
- **Parameterized Inputs** – registration fields, login credentials, products, shipping & billing fields handled dynamically.
- **Verification Points**:
  - User registered and logged in successfully
  - Product successfully added to cart
  - Checkout page loads correctly
  - Order confirmation displayed

---

### 🔹 4. How to Set Up & Run

1. **Create a Project in IntelliJ IDEA**

   - Download & install JDK → [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
   - Setup IntelliJ IDE
   - Create new project with build system: **Maven**

2. **Clone the Repository**

   - IntelliJ → File → New → Project from Version Control
   - URL: `https://github.com/Hisham-0/Web-Automation-Testing.git`
   - Click **Clone**

3. **Get Maven Dependencies**

   - Open the project in IntelliJ
   - IntelliJ will automatically detect and **import dependencies** from `pom.xml`
   - If not, manually reload Maven:
     - View → Tool Windows → Maven → 🔄 Refresh

4. **Run Tests (IntelliJ)**

   - Create a Run Configuration:
     - Test kind: **Suite**
     - Suite: `./testng.xml`
     - JRE: **Java 23 or higher**
   - From IntelliJ → Run `TestNG`.

5. **View Reports**
   - **Console Report**: displayed in IntelliJ terminal

---

## 🎥 Demo Video (Test Script)

https://github.com/user-attachments/assets/b9e66b60-cefa-46be-99ae-812f247379a1

---
