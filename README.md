markdown
# 🍽️ Restaurant Management App (Version 1)

## 📌 Project Overview
This is **Version 1** of a Restaurant Management System built with **Spring Boot (backend)** and **HTML/CSS/JavaScript (frontend)**.  
It demonstrates a complete flow from table assignment to order placement, delivery, billing, and freeing tables.

---

## 🚀 Features
- **Dashboard (index.html)**  
  View all tables with status (Available / Occupied).  
  Assign customers or place orders directly.

- **Customer Page (customer.html)**  
  Assign customer details (name, phone) to a table.

- **Order Page (order.html)**  
  - Fetch menu dynamically from backend (`/api/menu`).  
  - Place orders for a table.  
  - View all orders placed.  
  - Mark orders as delivered.  
  - Generate bill with total amount.  
  - Mark bill as paid → frees the table.

---

## 🛠️ Tech Stack
- **Backend**: Spring Boot, REST APIs
- **Frontend**: HTML, CSS, JavaScript (served via Spring Boot `static/`)
- **Database**: (Your choice, e.g., MySQL/PostgreSQL)
- **Tools**: Git, Postman (for API testing)

---

## 📂 Project Structure
restaurant-app/
├── src/main/java/...        # Spring Boot backend code
├── src/main/resources/
│    ├── static/             # Frontend pages
│    │    ├── index.html
│    │    ├── customer.html
│    │    ├── order.html
│    │    └── (admin.html planned for v2)
│    └── application.properties
└── pom.xml                  # Maven build file

Code

---

## 📖 How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/<your-username>/restaurant-app-v1.git
Navigate into the project folder:

bash
cd restaurant-app-v1
Run the Spring Boot app:

bash
mvn spring-boot:run
Open in browser:

Dashboard → http://localhost:8080/index.html

Customer → http://localhost:8080/customer.html?tableId=1

Order → http://localhost:8080/order.html?tableId=1

🏷️ Future Enhancements (Version 2)
Admin Page with centralized controls.

Itemized bill printing with customer details.

Authentication & role-based access (Admin vs Waiter).

More polished UI with reusable components.

👨‍💻 Author
Ninad Purkar  
Java Backend Developer | Payments & Real-Time Systems

Code
https://layers-take-order-app.onrender.com/restaurant/
---
