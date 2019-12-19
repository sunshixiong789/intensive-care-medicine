FROM store/oracle/serverjre:8
MAINTAINER "basic-service"
VOLUME /tmp
ADD "/target/basic-service-0.0.1-SNAPSHOT.jar" "basic-service-0.0.1-SNAPSHOT.jar"
EXPOSE 8801
ENV JAVA_OPTS="-server -Xmx512m -Xms512m -Djava.awt.headless=true -Dspring.profiles.active=env"
ENTRYPOINT ["sh", "-c","java $JAVA_OPTS -jar /basic-service-0.0.1-SNAPSHOT.jar"]
