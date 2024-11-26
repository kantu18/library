FROM eclipse-temurin:21-jdk
ADD target/bookstore.jar bookstore.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/bookstore.jar" ]
