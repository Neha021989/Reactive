FROM openjdk:8-jre-alpine
COPY ./target/reactive-0.0.1-SNAPSHOT.jar /usr/src/demo/
WORKDIR /usr/src/demo
CMD ["java", "-jar", "reactive-0.0.1-SNAPSHOT.jar"]
