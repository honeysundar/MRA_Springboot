FROM openjdk:23-oraclelinux9

WORKDIR /app

COPY target/bootproject-0.0.1-SNAPSHOT.jar .

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

CMD ["java", "-jar", "bootproject-0.0.1-SNAPSHOT.jar"]
