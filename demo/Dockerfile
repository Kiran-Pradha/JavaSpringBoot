# Use a lightweight JDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Gradle wrapper and build files first (for caching)
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Give permission to gradlew
RUN chmod +x gradlew

# Copy the rest of the source code
COPY src src

# Build the application
RUN ./gradlew bootJar

# Expose port
ENV APP_PORT=8080
EXPOSE ${APP_PORT}

# Run the JAR
CMD ["sh", "-c", "java -jar build/libs/*.jar --server.port=${APP_PORT}"]
