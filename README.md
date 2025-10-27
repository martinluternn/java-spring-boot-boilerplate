# Java Spring Boot Boilerplate

A lightweight starting point for building RESTful services with Spring Boot 3 and Java 21. The template keeps only the essentials so you can add your own persistence, security, or messaging layers as needed.

## What's included
- Spring Boot 3.2 with Actuator, Validation, and Web starters
- Java 21 toolchain configuration
- Simple health endpoint (`/api/health`) for smoke testing
- Utility helpers for AES encryption and random string generation
- Dockerfile and Docker Compose setup for rapid local execution

## Getting started

### Prerequisites
- Java 21
- Maven 3.9+
- Docker (optional, for containerized runs)

### Build and run locally
```bash
mvn clean spring-boot:run
```

### Build an executable jar
```bash
mvn clean package
java -jar target/java-spring-boot-boilerplate-1.0.0.jar
```

### Run with Docker Compose
```bash
docker compose up --build
```

### Run tests
```bash
mvn test
```

## Environment configuration
The project includes dedicated Spring profiles and sample environment variable files for staging and production deployments.

1. Copy the sample file for the environment you want to run:
   ```bash
   cp env/staging.env.example env/staging.env       # for staging
   cp env/production.env.example env/production.env # for production
   ```
2. Update the copied file with the correct database credentials, ports, and any other overrides your environment requires.
3. Load the variables before starting the application. For example, on macOS/Linux:
   ```bash
   set -a
   source env/staging.env
   set +a
   mvn spring-boot:run
   ```
   When running the packaged jar, you can also pass the profile inline:
   ```bash
   SPRING_PROFILES_ACTIVE=production java -jar target/java-spring-boot-boilerplate-1.0.0.jar
   ```

The active profile automatically picks up the matching configuration file (`application-staging.yml` or `application-production.yml`) under `src/main/resources/`.

## Next steps
Use this project as a baseline and plug in your preferred persistence, messaging, or security modules. The codebase intentionally stays minimal so you can tailor it to your application's needs.
