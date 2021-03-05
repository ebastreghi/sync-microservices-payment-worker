FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-oauth-0.0.1-SNAPSHOT.jar hr-oauth.jar
ENTRYPOINT ["java","-jar","/hr-oauth.jar"]


#mvnw clean package -DskipTests

#docker build -t hr-oauth:v1 .

#docker run -P --network hr-net hr-oauth:v1