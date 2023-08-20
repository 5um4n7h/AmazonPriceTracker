# Use an official OpenJDK runtime as the base image
FROM openjdk:18-jdk-alpine3.14

# Set the working directory within the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY amazonpricetracker-1.0.0-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]