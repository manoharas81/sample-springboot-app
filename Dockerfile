FROM eclipse-temurin:latest
EXPOSE 8080
ADD target/first-spring-boot-app-0.0.1-SNAPSHOT.jar first-spring-boot-app-1.jar
ENTRYPOINT ["java","-jar","/first-spring-boot-app-0.0.1-SNAPSHOT.jar"]