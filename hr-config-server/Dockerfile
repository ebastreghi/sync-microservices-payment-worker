FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/hr-config-server-0.0.1-SNAPSHOT.jar hr-config-server.jar
ENTRYPOINT ["java","-jar","/hr-config-server.jar"]

#docker build -t hr-config-server:v1 .

#docker run -p 8888:8888 --name hr-config-server --network hr-net hr-config-server:v1