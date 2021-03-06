# ocap-msr

## Introduction

It contains several components

* swagger.yaml : This file is a documentation for MSR-API written on http://docs.msrapi2.apiary.io
* Dockerfile : This is supposed to be used when dockering the application
* docker : this folder contains docker-compose.yml which is specifying mysql and msr-api 
* build-docker-image.sh : This can be used when building docker image of msr-api application
* msr-api : This is a spring-boot project generated by swagger-codegen with swagger.yaml
* msr-api/my-schema.sql: this file is generated by hibernate for Seat, User, and Reservation entities 
* msr-api/database/master-data-mysql.sql : It has some sample datas for testing the app

## Generate msr-api project 
You can create the msr-api project which is based on Spring Boot as following

```
swagger-codegen generate -v -i ./swagger.yaml -v -o msr-api \
    -l "spring" \
    --api-package "ocap.msr.api" \
    --model-package "ocap.msr.model" \
    --model-name-suffix "VO" \
    --artifact-id "msr-api" \
    --group-id "ocap.msr"
```

whenever you execute the command above, pom.xml and application.properties will be re-generated.

And I added .gitignore file and its content looks like following and it came from any projects generated by STS as a spring-boot project
```
target/
!.mvn/wrapper/maven-wrapper.jar

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
nbproject/private/
build/
nbbuild/
dist/
nbdist/
.nb-gradle/
``` 

## Packaging and Run the spring-boot application
```
$ cd msr-api

$ mvn package
```

## Run MSR-API application

### Run with mysqlcs profile
```
$ cd msr-api

$ mvn spring-boot:run -Drun.profiles=mysqlcs

$ java -jar -Dspring.profiles.active=mysqlcs target/msr-api-1.0.0.jar
```

### Run with docker profile
```
$ cd msr-api

$ mvn package

$ cd ..

$ docker image ls
$ docker image rm $(docker image ls --format "{{.Repository}}:{{.Tag}}" | grep msr-api)

$ ./build-docker-image.sh

$ cd docker

$ docker-compose up -d

```

## MSR-API ENDPOINT deployed on ACCS

BASE_URL: [https://MSRAPI-gse00013250.apaas.us6.oraclecloud.com](https://MSRAPI-gse00013250.apaas.us6.oraclecloud.com)

### cURL test
```
curl --include \
     --header "Content-Type: application/json" \
     --header "Accept: application/json;charset=UTF-8" \
  'https://msrapi-gse00013250.apaas.us6.oraclecloud.com/v1/seats?seatNo=&limit='
``` 