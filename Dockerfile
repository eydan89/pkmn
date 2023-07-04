
FROM amazoncorretto:11-alpine-jdk
MAINTAINER eydan89
COPY target/pkmn-0.0.1-SNAPSHOT.jar pkmn.jar

ENTRYPOINT ["java", "-jar", "/pkmn.jar"]