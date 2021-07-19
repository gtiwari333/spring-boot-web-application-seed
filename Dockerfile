FROM adoptopenjdk/openjdk11
VOLUME /tmp
VOLUME /X/attachments
# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/spring-boot-mongo-1.0.jar $PROJECT_HOME/spring-boot-mongo.jar
CMD ["java" ,"-jar","./spring-boot-mongo.jar"]
