FROM openjdk:8-jdk
COPY build/libs/discovery-1.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]