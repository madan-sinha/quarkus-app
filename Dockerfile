FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/quarkus-app-1.0.0-SNAPSHOT.jar quarkus-app-1.0.0-SNAPSHOT.jar
WORKDIR /opt/app
ENTRYPOINT ["java","-jar","/quarkus-app-1.0.0-SNAPSHOT.jar"]
EXPOSE 8080