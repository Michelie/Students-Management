FROM openjdk:11
COPY target/student*.jar /usr/src/students.jar
COPY src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/students.jar", "--spring.config.location=file:/opt/conf/application.properties"]

