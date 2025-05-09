#  Pharmacy Inventory Management API

A RESTful API built with Spring Boot for managing the stock of products in a newly established pharmacy. This system enables efficient CRUD operations (Create, Read, Update, Delete) for pharmacy products to optimize inventory management.

---

##  Features

-  Add new pharmacy products to the inventory
-  Update product details such as quantity, price, and description
-  Delete obsolete or unnecessary products
-  View the list of all available products in real-time

---

##  Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** or **PostgreSQL**
- **Postman** (for API testing)
- **Maven** (for project management)

---

##  API Endpoints

| Method | Endpoint            | Description                        |
|--------|---------------------|------------------------------------|
| `POST` | `/api/products`     | Add a new product                  |
| `GET`  | `/api/products`     | Retrieve all products              |
| `GET`  | `/api/products/{id}`| Get product by ID                  |
| `PUT`  | `/api/products/{id}`| Update product information         |
| `DELETE`| `/api/products/{id}`| Delete a product by ID             |



