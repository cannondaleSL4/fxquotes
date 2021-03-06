#!/usr/bin/env bash

chmod +x ./stop.sh
./stop.sh

mvn clean package

chmod +x ./gateway/target/gateway-1.0-SNAPSHOT.jar
chmod +x ./identity/target/identity-1.0-SNAPSHOT.jar
chmod +x ./request/target/request-1.0-SNAPSHOT.jar

nohup java -jar ./gateway/target/*.jar &
nohup java -jar ./identity/target/*.jar &
nohup java -jar ./request/target/*.jar &

#run angular
cd ./angular/
ng build --prod
ng server --open

