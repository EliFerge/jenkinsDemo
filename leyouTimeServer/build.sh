mvn clean

mvn package -DskipTests

docker rmi -f act

mvn dockerfile:build -t act

docker images