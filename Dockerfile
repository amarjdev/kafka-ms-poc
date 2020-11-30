FROM openjdk:8-jdk-alpine
EXPOSE 9000
ADD target/Kafka-ms-poc-1.0.jar Kafka-ms-poc-1.0.jar
ENTRYPOINT ["java","-jar","Kafka-ms-poc-1.0.jar"]