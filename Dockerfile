FROM openjdk:18
COPY ./target/TestProject-1.0-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "TestProject-1.0-jar-with-dependencies.jar"]