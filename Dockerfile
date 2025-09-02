# Dockerfile para aplicación Java
FROM openjdk:24-jdk-slim
WORKDIR /app
COPY build/install/TPS/ ./
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "./bin/TPS && tail -f /dev/null"]
