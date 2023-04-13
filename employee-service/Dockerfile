FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/employeeService-0.0.1-SNAPSHOT.jar employeeService-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","employeeService-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082