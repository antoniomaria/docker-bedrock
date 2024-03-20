FROM eclipse-temurin:21-jdk AS builder

WORKDIR /opt/java-app
COPY .mvn/ .mvn
COPY pom.xml pom.xml
COPY mvnw mvnw
COPY src src
RUN ./mvnw dependency:go-offline
RUN ./mvnw package

FROM eclipse-temurin:21-jre

WORKDIR /opt/java-app
COPY --from=builder /opt/java-app/target/*.jar ./java-app.jar

EXPOSE 9090
CMD ["java", "-jar", "java-app.jar"]

