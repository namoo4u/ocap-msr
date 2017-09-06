
FROM openjdk:8-jdk-alpine
 
COPY ${PWD}/msr-api/target/msr-api-1.0.0.jar /deployments/

CMD java -jar -Dspring.profiles.active=docker /deployments/msr-api-1.0.0.jar
