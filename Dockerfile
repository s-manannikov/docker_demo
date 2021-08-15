FROM openjdk
WORKDIR demo_docker
ADD target/demo_docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar app.jar