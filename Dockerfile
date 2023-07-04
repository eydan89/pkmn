FROM amazoncorretto:11-alpine-jdk
COPY target/pkmn-0.0.1-SNAPSHOT.jar  pkmn-app.jar
ENTRYPOINT ["java","-jar","/pkmn-app.jar"]