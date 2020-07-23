FROM java:8
MAINTAINER wz
ADD ./target/leyouTimeServer-1.0.jar demo.jar
EXPOSE 8000
EXPOSE 5005
CMD ["java","-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","demo.jar"]
