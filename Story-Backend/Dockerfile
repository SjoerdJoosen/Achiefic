FROM maven:3.5-jdk-11 as BUILD

COPY ./ ./

RUN mvn --batch-mode -f Story-Backend/pom.xml clean package
RUN cd /Story-Backend
RUN dir
FROM openjdk:11-jdk
EXPOSE 8080
COPY --from=BUILD /Story-Backend/target ./target
WORKDIR ./target

CMD ["java", "-jar", "Story-BackEnd-Docker.jar"]
