# Build stage
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /workspace/target/java-spring-boot-boilerplate-1.0.0.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./app.jar"]
