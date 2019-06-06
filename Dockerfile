FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ARG BUILD_DIR
COPY ${BUILD_DIR}/${JAR_FILE} app.jar
COPY ${BUILD_DIR}/newrelic.jar /newrelic/newrelic.jar
COPY ${BUILD_DIR}/newrelic.yml /newrelic/newrelic.yml
ENTRYPOINT ["java","-javaagent:/newrelic/newrelic.jar","-jar","/app.jar"]