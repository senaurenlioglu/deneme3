# Base image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file to the container
COPY target/deneme2-0.0.1-SNAPSHOT.jar /app/deneme2.jar

# Expose the application port
EXPOSE 8080

# Command to run the jar file
CMD ["java", "-XX:+EnableDynamicAgentLoading", "-jar", "/app/deneme2.jar"]
