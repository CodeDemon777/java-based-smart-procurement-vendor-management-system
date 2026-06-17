# ==========================================================
# Build Stage
# ==========================================================
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (caching optimization)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy project source and build application
COPY src ./src
RUN mvn clean package -DskipTests -B

# ==========================================================
# Run Stage
# ==========================================================
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copy built jar from the Build Stage
COPY --from=build /app/target/*.jar app.jar

# Expose default port
EXPOSE 8082

# Start the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
