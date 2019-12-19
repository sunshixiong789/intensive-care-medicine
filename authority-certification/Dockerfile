FROM store/oracle/serverjre:8
MAINTAINER "authority-certification"
VOLUME /tmp
ADD "/target/authority-certification-0.0.1-SNAPSHOT.jar" "authority-certification-0.0.1-SNAPSHOT.jar"
EXPOSE 8800
ENV JAVA_OPTS="-server -Xmx512m -Xms512m -Djava.awt.headless=true"
ENTRYPOINT ["sh", "-c","java $JAVA_OPTS -jar /authority-certification-0.0.1-SNAPSHOT.jar"]
