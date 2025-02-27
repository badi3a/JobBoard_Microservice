FROM openjdk:17
#le port de projet est 8050
EXPOSE 8050
ADD target/job-0.0.1-SNAPSHOT.jar job.jar
ENTRYPOINT ["java", "-jar", "job.jar"]