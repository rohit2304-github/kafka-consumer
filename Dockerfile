FROM openjdk:8
COPY target/kafka-consumer-0.0.1-SNAPSHOT.jar ./service.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /service.jar