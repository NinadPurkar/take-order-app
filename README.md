# 🍽️ FineDine - Restaurant Order Management System

A modern web application for managing restaurant orders, built with **Java Spring Boot**, **MySQL**, and **Thymeleaf**.

## 🎯 Project Overview

FineDine is a comprehensive restaurant order management system designed to streamline the process of taking orders from multiple tables simultaneously. With support for multi-tab sessions, real-time order updates, and automated bill generation, FineDine helps restaurants operate more efficiently.

## ✨ Features

- **🔐 User Authentication** - Secure login with JWT tokens
- **📋 Multi-Table Management** - Serve multiple tables simultaneously in separate browser tabs
- **🛒 Real-time Cart Updates** - AJAX-based shopping cart without page reloads
- **📱 Responsive Design** - Works on desktop, tablet, and mobile devices
- **🧾 Automated Bill Generation** - Instant bill calculation with tax and service charges
- **💳 Payment Integration Ready** - Support for multiple payment methods
- **☁️ Cloud-Ready** - Easily deployable to AWS, Heroku, or Google Cloud

## 🛠️ Tech Stack

### Backend
- **Java 17** - Programming language
- **Spring Boot 3.2** - Web framework
- **Spring Security** - Authentication & Authorization
- **Spring Data JPA** - Database ORM
- **JWT (JSON Web Tokens)** - Token-based authentication
- **Maven** - Build automation tool

### Frontend
- **Thymeleaf** - Server-side HTML templating
- **HTML5** - Markup language
- **CSS3** - Styling
- **JavaScript (Vanilla)** - Frontend interactivity
- **AJAX/Fetch API** - Asynchronous HTTP requests

### Database
- **MySQL 8.0+** - Relational database

### Deployment
- **Docker** - Containerization
- **Git** - Version control

## 📋 Prerequisites

Before you begin, ensure you have installed:

- **Java JDK 17 or higher** ([Download](https://www.oracle.com/java/technologies/downloads/))
- **Apache Maven 3.8+** ([Download](https://maven.apache.org/download.cgi))
- **MySQL 8.0+** ([Download](https://www.mysql.com/downloads/mysql/))
- **Git** ([Download](https://git-scm.com/))
- **Visual Studio Code** ([Download](https://code.visualstudio.com/))

### Verify Installation

```bash
java -version
mvn -version
mysql --version
git --version