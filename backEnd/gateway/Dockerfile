
FROM  openjdk:17

EXPOSE 8065

ADD target/gateway-0.0.1-SNAPSHOT.jar gateway.jar

ENTRYPOINT ["java", "-jar","gateway.jar"]
