# Etapa de build: compila la app con Gradle
FROM gradle:8.1.1-jdk17 AS build
WORKDIR /app

# Copia archivos de configuración y descarga dependencias primero (optimiza cache)
COPY build.gradle settings.gradle ./
COPY gradle ./gradle
RUN gradle dependencies

# Copia el resto del proyecto y compila
COPY . ./
RUN gradle clean installDist

# Etapa final: solo la app lista para ejecutar
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia la distribución generada por Gradle
COPY --from=build /app/build/install/TPS/ ./

EXPOSE 8080

# Ejecuta la app y mantiene el contenedor vivo
ENTRYPOINT ["sh", "-c", "./bin/TPS && tail -f /dev/null"]