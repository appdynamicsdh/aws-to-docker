FROM alpine AS builder

RUN apk --no-cache add unzip

COPY AppServerAgent-4.5.6.24621.zip /
RUN unzip -oq AppServerAgent-4.5.6.24621.zip -d /tmp 

FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade
COPY --from=builder /tmp /opt/appdynamics

VOLUME /tmp

COPY target/spring-boot-sample-web-freemarker-2.1.0.RELEASE.jar spring-boot-sample-web-freemarker-2.1.0.RELEASE.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-javaagent:/opt/appdynamics/javaagent.jar","-Dappagent.install.dir=/opt/appdynamics","-Dappdynamics.agent.nodeName=SpringNode1","-Dappdynamics.agent.tierName=SpringTier","-Dappdynamics.controller.hostName=192.168.86.57","-Dappdynamics.controller.port=32774","-Dappdynamics.agent.applicationName=SpringDev","-Dappdynamics.agent.accountAccessKey=SJ5b2m7d1$354","-jar","/spring-boot-sample-web-freemarker-2.1.0.RELEASE.jar"]


