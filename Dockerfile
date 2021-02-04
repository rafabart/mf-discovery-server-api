FROM openjdk:11
VOLUME /tmp
ADD ./build/libs/mf-discovery-server-api-0.0.1-SNAPSHOT.jar mf-discovery-server-api.jar
ENTRYPOINT ["java","-jar","/mf-discovery-server-api.jar"]