FROM openjdk
WORKDIR docker_demo
ADD target/docker_demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar app.jar