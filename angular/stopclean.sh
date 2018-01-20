# !/bin/bash
docker stop $(docker ps -a -q)
docker build -t angular:prod .
docker system prune -a

