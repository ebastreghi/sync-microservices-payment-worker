FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-worker-0.0.1-SNAPSHOT.jar hr-worker.jar
ENTRYPOINT ["java","-jar","/hr-worker.jar"]

#mvnw clean package -DskipTests

#docker build -t hr-worker:v1 .

#docker run -P --network hr-net hr-worker:v1