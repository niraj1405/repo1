# Use OpenJDK 17 as the base image
FROM openjdk:17

# Create the directory /APP
RUN mkdir -p /APP

# Set the working directory to /APP
WORKDIR /APP

# Copy the WebApp.jar file from the target directory into the container's /APP directory
COPY target/YmlKubApp.jar /APP/
# Define the command to run the application
ENTRYPOINT ["java", "-jar", "YmlKubApp.jar"]

# Expose the port that the application runs on (assuming it runs on port 8081)
EXPOSE 8081
