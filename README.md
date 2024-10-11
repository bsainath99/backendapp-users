
#  BackendApp Users - User Management Service


BackendApp Users is a backend service designed to manage user accounts, authentication, and profile data. Built using Java and Spring Boot, it provides secure, scalable, and efficient user registration, login, and profile management features. The service includes features like JWT-based authentication, CRUD operations for user profiles, and password encryption. Perfect for developers looking to integrate robust user management into their applications.
## Features
- CRUD Operations: Create, Read, Update, and Delete blog posts and comments.
- Exceptions: Executes an exception folder when user is not found
- MySQL Database: Uses MySQL for data storage, with Spring Data JPA for ORM.
- Swagger Documentation: Automatically generated API documentation for easier testing and exploration.


## Technologies Used
- Java: Programming language for building the application.
- MySQL: Relational database management system for data persistence.
- Spring Boot: Framework for creating the RESTful API.
- Spring Security: For securing API endpoints and handling user authentication.
- Postman: Tool for testing the API endpoints.
## API Reference

#### POST Mapping 

```http
  POST /addUser
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| User  | Object | Pass an user object in request body  |

#### GET Mapping 
```http
  GET /user/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| User with Id  | Long | Pass an user id as path variable |

```http
  GET /users
```
Returns all Users

#### PUT Mapping 
```http
  PUT /user/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| User with Id  | Long | Pass an user id as path variable |

#### DELETE Mapping 
```http
  DELETE /user/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| User with Id  | Long | Pass an user id as path variable |



## Deployment

To deploy this project run

```bash
 Open file which conatins mail.java method() and click "Run as" --> Spring Boot App
```


## Installation

- Clone the repository: git clone https://github.com/bsainath99/blog-app-apis.git
- Navigate to the project directory: cd blog-app-apis
- Set up the MySQL database and configure your application.properties file with the database credentials.
- Run the application:  Open file which conatins mail.java method() and click "Run as" --> Spring Boot App
