FROM openjdk:17
VOLUME /tmp
EXPOSE 7654
ARG JAR_FILE=build/libs/provider-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} provider-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/provider-0.0.1-SNAPSHOT.jar"]