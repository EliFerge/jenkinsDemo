docker images
docker rmi -f act
echo====================开始构建镜像
mvn dockerfile:build -t act

docker images