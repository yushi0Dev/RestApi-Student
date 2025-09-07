# RestApi-Student

A simple **Spring Boot REST API** project for managing student data with **DTO (Data Transfer Object)** support.  
The API provides full **CRUD operations** and now uses **DTOs to filter and control the exposed data**.

---

##  Features

- **Spring Boot** based RESTful API
- **CRUD operations** for student management
- **DTO implementation** to filter and structure the data returned to the client
- **Maven** for dependency management
- Uses **Java 17+** (can be adjusted based on your environment)
---

##  Technologies Used

- **Java** — 21+
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

---

##  API Endpoints

| Method | Endpoint             | Description          |
|--------|----------------------|----------------------|
| GET    | `/api/student`       | Get all students     |
| GET    | `/api/student/{id}`  | Get student by ID    |
| POST   | `/api/student/create`| Create new student   |
| PUT    | `/api/student/update/{id}` | Update student |
| DELETE | `/api/student/delete/{id}` | Delete student |

---

##  DTO Implementation

DTOs are now used to **filter and expose only the necessary data**.  
This improves **security**, **data integrity**, and **API flexibility**.
