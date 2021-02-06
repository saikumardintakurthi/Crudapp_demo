FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/
COPY ${JAR_FILE} saiapp.jar

ENTRYPOINT ["java","-jar","/"]