# Step 1: Build the app
FROM gradle:8.4-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build --no-daemon

# Step 2: Run the app
FROM openjdk:17-jdk-slim
COPY --from=build /home/gradle/project/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
