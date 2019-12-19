FROM store/oracle/serverjre:8
MAINTAINER "nursing-system"
VOLUME /tmp
ADD "/target/nursing-system-0.0.1-SNAPSHOT.jar" "nursing-system-0.0.1-SNAPSHOT.jar"
EXPOSE 8802
ENV JAVA_OPTS="-server -Xmx512m -Xms512m -Djava.awt.headless=true"
ENTRYPOINT ["sh", "-c","java $JAVA_OPTS -jar /nursing-system-0.0.1-SNAPSHOT.jar"]
