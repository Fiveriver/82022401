
# Base image
FROM cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

# Set the working directory
WORKDIR /app

# Copy the Java application JAR file
COPY target/template-0.0.1-SNAPSHOT.jar .

# Expose the application port (예: 8080)
EXPOSE 8080

# Command to run the Java application
CMD ["java", "-jar", "myapp.jar"]