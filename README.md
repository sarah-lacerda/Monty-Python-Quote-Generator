
# Monty Python Quote Generator

Monty python was one of the most honored comedians in the history of television. Here is an API that generates random quotes from the episodes.

## Getting Started

With this API, you can generate a random quote from a random actor or a random quote from a specific actor.

### Details

This project makes use of:

- Spring Boot

- JPA (Java Persistence API)

- Java 8

- H2 Database with table named "scripts" with the following structure:

```
CREATE TABLE IF NOT EXISTS "scripts" (
  "id" INTEGER PRIMARY KEY,
  "episode" INTEGER,
  "episode_name" TEXT,
  "segment" TEXT,
  "type" TEXT,
  "actor" TEXT,
  "character" TEXT,
  "detail" TEXT,
  "record_date" TIMESTAMP,
  "series" TEXT,
  "transmission_date" TIMESTAMP
);
CREATE INDEX "ix_scripts_index"ON "scripts" ("index");

```
Where "detail" stores the quotes that are presented by the API

### How to use

This API should respond through the following URLs:
```
/v1/quote
```
GET METHOD
Returns a random quote from any actor

AND

```
/vi/quote/{actor}
```
GET METHOD
Returns a random quote from the actor specified as the argument


The expected return format from both URLs is a JSON Response:
Example:
```
{"actor":"John Cleese","quote":"Yes, cigarettes. My hovercraft is full of eels."}
```

To run the application, use:
```
grandlew bootRun
```
It will accessible with the following URL:
```
http://localhost:8080
```


## Authors

This was part of a coding challenge created by "Daniel Blank" https://www.linkedin.com/in/db-dblank , and implemented by me.


