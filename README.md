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
- GET /books/{id} — retrieve a single book by ID
- GET /books/search?status={status} — retrieve books filtered by status
- GET /books/completed — retrieve completed books (Streams filter)
- GET /books/summaries — retrieve title/author summaries (Streams map)
- POST /books — add a new book
- PUT /books/{id} — update a book
- DELETE /books/{id} — delete a book

## Changelog
- **June 10, 2026** — Initial CRUD API with H2 + JPA
- **June 13, 2026** — Custom exception handling, GET by ID, filter by status
- **June 27, 2026** — Streams filter() — completed books endpoint
- **June 29, 2026** — Streams map() — book summaries endpoint