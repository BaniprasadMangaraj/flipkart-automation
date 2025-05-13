# Use official Maven image with JDK
FROM maven:3.9.6-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy the pom.xml and download dependencies first to leverage Docker cache
COPY pom.xml .
COPY testng.xml ./testng.xml


# Download dependencies (this will be cached unless pom.xml or dependencies change)
RUN mvn dependency:go-offline

# Now copy the rest of the application
COPY . .

# Compile and test the application
RUN mvn clean compile

# Run the tests
CMD ["mvn", "verify"]
