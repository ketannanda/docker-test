
FROM openjdk:17

COPY target/demo_dock.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demo_dock.jar"]