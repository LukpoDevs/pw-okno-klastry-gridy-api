FROM openjdk:11
EXPOSE 8080
ADD target/okno-api.jar okno-api.jar
ENTRYPOINT ["java","-jar","/okno-api.jar"]