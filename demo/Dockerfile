# Use Java 17 base image
FROM openjdk:17-jdk-slim

# Set environment variable (optional default)
ENV APP_PORT=8080

# Set working directory
WORKDIR /app

# Copy built JAR file
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port (for documentation)
EXPOSE ${APP_PORT}

# Start app using environment variable
CMD ["sh", "-c", "java -jar app.jar --server.port=${APP_PORT}"]
