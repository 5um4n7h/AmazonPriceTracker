# Use an official Maven image as the base image
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory within the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the Maven project
RUN mvn clean package -DskipTests

# Use an official OpenJDK runtime as the base image for running the JAR
FROM openjdk:17-slim

# Set the working directory within the container
WORKDIR /app

# Copy the built JAR from the build stage to the runtime stage
COPY --from=build /app/target/amazonpricetracker-1.0.0-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]