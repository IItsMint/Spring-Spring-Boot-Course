FROM amazoncorretto:21-alpine
COPY target/job-app.jar job-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "job-app.jar"]