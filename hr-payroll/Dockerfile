FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-payroll-0.0.1-SNAPSHOT.jar hr-payroll.jar
ENTRYPOINT ["java","-jar","/hr-payroll.jar"]


#mvnw clean package -DskipTests

#docker build -t hr-payroll:v1 .

#docker run -P --network hr-net hr-payroll:v1