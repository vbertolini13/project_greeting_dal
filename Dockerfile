FROM openjdk:8-jdk-alpine
VOLUME /tmp

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

# Default copy (Gradle)
COPY build/libs/project-greeting-dal-0.0.1-SNAPSHOT.jar app.jar

#Add JVM heap limits
ENV JAVA_OPTS="-Dspring.profiles.active=prod -Djava.security.egd=file:/dev/./urandom "

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
