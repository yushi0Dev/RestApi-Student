# REST API CRUD Project

This project is a **RESTful API** developed using **Java Spring Boot**.  
Its main purpose is to **practice**, **strengthen** knowledge, and **gain experience** in API development.  
It performs full **CRUD (Create, Read, Update, Delete)** operations and integrates with a **PostgreSQL** database.

> **Note:** DTO (Data Transfer Object) is **not implemented yet**, but it will be added soon.

---

## Features

-  **RESTful API** built with Spring Boot
-  Full **CRUD** operations
-  **PostgreSQL** integration
-  **JPA / Hibernate** ORM support
-  JSON-based data exchange
-  Configurable via `application.properties`

---

##  Technologies Used

- **Java** — 17+
- **Spring Boot** — 3.x
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

---

##  Project Structure

crud
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.api.crud
│ │ │ ├── CrudApplication.java # Main Spring Boot application
│ │ │
│ │ │ ├── controller
│ │ │ │ ├── IStudentController.java # Controller interface
│ │ │ │ └── StudentControllerImpl.java # Controller implementation
│ │ │
│ │ │ ├── entities
│ │ │ │ └── Student.java # JPA entity
│ │ │
│ │ │ ├── repository
│ │ │ │ └── IStudentRepository.java # JPA repository interface
│ │ │
│ │ │ └── service
│ │ │ ├── IStudentService.java # Service interface
│ │ │ └── StudentServiceImpl.java # Service implementation
│ │ │
│ │ └── resources
│ │ └── application.properties # Spring Boot configuration
│ │
│ └── test
│ └── java # Unit tests (optional)
│
├── pom.xml # Maven configuration file
└── README.md # Project documentation
