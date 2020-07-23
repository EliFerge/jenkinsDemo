docker ps -a
docker stop actdemo
docker rm -f actdemo
docker run -d --name actdemo -p 8000:8000 -p 5005:5005 act
docker ps -a
docker ps
yes | docker image prune
docker images
