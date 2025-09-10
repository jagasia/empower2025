FROM eclipse-temurin:21-jdk
VOLUME /tmp
EXPOSE 5000
ADD target/book-service-oracle-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
