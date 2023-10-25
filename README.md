<h1 align="center"> Employee Address </h1>

>## Database
* [MySQL](https://www.mysql.com/downloads/)

>## Framework
* [SpringBoot](javatpoint.com/spring-boot-tutorial)

>## Language
* [Java](https://www.java.com/en/download/help/whatis_java.html)

>## Data flow
In this project, we have 4 layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer maintains the MySQL-database on which CRUD operations are performed
* **Model** - This layer consists basically the class level things - the various classes required for the project and these classes consists the attributes to be stored.
## Data Structure

* **Employee Address Model**: The Employee Address model represents the data structure for storing employee address information. It typically includes attributes such as employeeId, address, city, state, and postalCode.

## Project Summary

The Employee Address Management system is designed to manage and perform CRUD operations on employee address data. It provides a RESTful API for interacting with employee addresses. The application is built using Spring Boot and uses MySQL as the database for storing employee address information. The API endpoints can be explored and tested using Swagger UI.

## Installation and Usage

* Clone the repository to your local machine.
* Make sure you have Java, Maven, and MySQL installed.
* Set up the database configuration in the application.properties file.
* Run the application using Maven or your preferred IDE.
* Access the API endpoints using Swagger UI by navigating to the appropriate URL (e.g., `http://localhost:8080/swagger-ui.html`).
