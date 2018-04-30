#!/usr/bin/env bash

chmod +x ./stop.sh
./stop.sh

#mvn clean package
ng build --prod

chmod +x ./gateway/target/gateway-1.0-SNAPSHOT.jar
chmod +x ./identity/target/identity-1.0-SNAPSHOT.jar
chmod +x ./request/target/request-1.0-SNAPSHOT.jar

nohup java -jar ./gateway/target/*.jar &
nohup java -jar ./identity/target/*.jar &
nohup java -jar ./request/target/*.jar &

java -jar ./gateway/target/*.jar &
java -jar ./identity/target/*.jar &
java -jar ./request/target/*.jar &

#run angular
cd ./angular/
ng server --open

