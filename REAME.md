# Error handling in Spring web using RFC-9457 specification

This is the code repository for the article [Error handling in Spring web using RFC-9457 specification](https://abdelrani.com/blog/the-standard-way-for-handling-error-responses-in-spring-web).
This project is a simple example of how to handle errors in a Spring web application using the RFC-9457 specification.

## Pre-requisites
- Java 17
- Maven 3.8.3
- Spring boot 3 (Spring web, Spring valifation)
- Lombok

## How to run
```shell
mvn spring-boot:run
```

## How to test
Using http.client:

```shell
GET http://localhost:8080/api/users/1
content-type: application/json

###
GET http://localhost:8080/api/users/2
content-type: application/json

###

POST http://localhost:8080/api/users
content-type: application/json

{
  "id": 1,
  "name": "",
  "email": "hi.sou"
}
```