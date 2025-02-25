FROM openjdk:17
EXPOSE 8045
ADD target/candidat-0.0.1-SNAPSHOT.jar candidat.jar
LABEL authors="emnac"

ENTRYPOINT ["java", "-jar","candidat.jar"]