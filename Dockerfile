FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM OpenJDK:17.0.1-jdk-slim
COPY --from=build /target/students_web_api-0.0.1-SNAPSHOT.jar students_web_api.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","students_web_api.jar"]