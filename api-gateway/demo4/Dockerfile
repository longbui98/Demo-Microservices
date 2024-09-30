# Use a lightweight Java image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/cloud-gateway-0.0.1-SNAPSHOT.jar /app/target/cloud-gateway-0.0.1-SNAPSHOT.jar

# Expose the port
EXPOSE 8080

# Set the command to run the service
ENTRYPOINT ["java", "-jar", "/app/cloud-gateway-0.0.1-SNAPSHOT.jar"]