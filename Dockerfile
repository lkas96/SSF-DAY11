FROM eclipse-temurin:23-jdk

LABEL description="Day 11 docker practice, mama a girl behind you"
LABEL name="vttp-day11-lecture"

ARG APP_DIR=/APP_DIR
COPY pom.xml .
COPY mvnw .
COPY nvmw.cmd .
COPY src src
COPY .mvn .

RUN mvn package -Dmaven.test.skip=true

ENV SERVER_PORT 2980

EXPOSE ${SERVER_PORT}

ENTRYPOINT SERVER_PORT=${SERVER_PORT} java -jar target/vttp-day11-lecture-0.0.1-SNAPSHOT.jar