FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-devops.jar spring-boot-devops.jar
ENTRYPOINT ["java","-jar","/spring-boot-devops.jar"]