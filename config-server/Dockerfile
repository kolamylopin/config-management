FROM openjdk:8-jdk
COPY build/libs/config-server-1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]