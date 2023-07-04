FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests



FROM openjdk:11-jdk-slim
COPY target/pkmn-0.0.1-SNAPSHOT.jar pkmn.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/pkmn.jar"]