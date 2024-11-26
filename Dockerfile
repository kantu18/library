FROM openjdk:21
ADD target/bookstore.jar bookstore.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/bookstore.jar" ]
