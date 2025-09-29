# build stage
FROM gradle:8-jdk21 AS builder
WORKDIR /app
COPY --chown=gradle:gradle . /app
RUN gradle --no-daemon bootJar -x test

# runtime stage
FROM eclipse-temurin:21-jre
WORKDIR /app
ARG JAR_FILE=build/libs/*.jar
COPY --from=builder /app/${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
