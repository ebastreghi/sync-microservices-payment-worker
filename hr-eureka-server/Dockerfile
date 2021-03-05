FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/hr-eureka-server-0.0.1-SNAPSHOT.jar hr-eureka-server.jar
ENTRYPOINT ["java","-jar","/hr-eureka-server.jar"]

#mvnw clean package

#docker build -t hr-eureka-server:v1 .

#docker run -p 8761:8761 --name hr-eureka-server --network hr-net hr-eureka-server:v1