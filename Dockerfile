#
# Build stage
#

# Usar una imagen base con JDK 11
FROM amazoncorretto:11-alpine-jdk

#dueño del proyecto
MAINTAINER eydan89



# Copiar archivos de tu proyecto al directorio de trabajo
COPY target/pkmn-0.0.1-SNAPSHOT.jar pkmn.jar


# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/pkmn.jar"]