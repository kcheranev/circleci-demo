FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ARG BUILD_DIR
COPY ${BUILD_DIR}/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]