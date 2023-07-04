FROM amazoncorretto:11-alpine-jdk
MAINTAINER EYDAN
COPY target/pkmn-0.0.1-SNAPSHOT.jar pkmn.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/pkmn.jar"]