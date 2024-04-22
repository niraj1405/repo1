# Use OpenJDK 17 as the base image
FROM openjdk:17

# Create the directory /APP
RUN mkdir -p /APP

# Set the working directory to /APP
WORKDIR /APP

# Copy the JAR file from the relative path into the container's /APP directory
COPY TicketBookApp/target/TicketBookApp.jar /APP/

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "TicketBookApp.jar"]

# Expose the port that the application runs on (assuming it runs on port 8081)
EXPOSE 8081
