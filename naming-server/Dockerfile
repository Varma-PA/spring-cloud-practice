FROM gradle:jdk23-alpine as build

WORKDIR /home/app

COPY ./*.gradle ./
COPY ./src/main/java/com/spring_cloud/microservices/naming_server/NamingServerApplication.java ./src/main/java/com/spring_cloud/microservices/naming_server/NamingServerApplication.java

RUN gradle rebuild

# Next Stage

COPY . /home/app
RUN gradle rebuild

FROM openjdk:23-jdk
EXPOSE 8000
COPY --from=build /home/app/build/libs/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

