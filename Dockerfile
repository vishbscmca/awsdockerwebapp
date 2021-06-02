FROM java:8
EXPOSE 8080
ADD /target/awsdockerwebapp-0.0.1-SNAPSHOT.jar awsdockerwebapp.jar
ENTRYPOINT ["java","-jar","/awsdockerwebapp.jar"]