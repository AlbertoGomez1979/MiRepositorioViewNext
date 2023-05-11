From openjdk:8-jdk-slim
COPY "./target/rest-api-jdbc-0.0.1-SNAPSHOT.jar" "rest-api-jdbc.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","rest-api-jdbc.jar"]