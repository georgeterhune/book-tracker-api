# Book Tracker API

A RESTful API built with Spring Boot for tracking books and reading status.

## Tech Stack
- Java 17
- Spring Boot 4.0.6
- Spring Data JPA
- H2 Database
- Maven

## Endpoints
- GET /books — retrieve all books
- POST /books — add a new book
- PUT /books/{id} — update a book
- DELETE /books/{id} — delete a book

## Changelog
- **June 10, 2026** — Initial CRUD API with H2 + JPA
- **June 13, 2026** — Custom exception handling, GET by ID, filter by status