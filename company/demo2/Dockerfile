# Use a lightweight Java image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/company-service-0.0.1-SNAPSHOT.jar /app/company-service-0.0.1-SNAPSHOT.jar

# Expose the port
EXPOSE 8100

# Set the command to run the service
ENTRYPOINT ["java", "-jar", "/app/company-service-0.0.1-SNAPSHOT.jar"]
