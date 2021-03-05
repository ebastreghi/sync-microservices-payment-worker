FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-user-0.0.1-SNAPSHOT.jar hr-user.jar
ENTRYPOINT ["java","-jar","/hr-user.jar"]


#mvnw clean package -DskipTests

#docker build -t hr-user:v1 .

#docker run -P --network hr-net hr-user:v1

#docker logs -f hr-user-pg12