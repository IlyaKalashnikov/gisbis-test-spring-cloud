#stage 1
#Start with a base image containing Java runtime
FROM openjdk:19-slim as build

# Add Maintainer Info
LABEL maintainer="Ilya Kalashnikov <kalashilya@yandex.ru>"

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]