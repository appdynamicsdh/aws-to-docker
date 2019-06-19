FROM alpine AS builder

RUN apk --no-cache add unzip

FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade

COPY target/DockerBridge-2.1.0.RELEASE.jar DockerBridge-2.1.0.RELEASE.jar

ENTRYPOINT ["java","-jar","DockerBridge-2.1.0.RELEASE.jar"]
