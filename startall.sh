#!/usr/bin/env bash

chmod +x ./stop.sh
./stop.sh

#package for entity module
mvn -f ./entity/ package
#make gateway module
mvn -f ./gateway/ package
#make identity module
mvn -f ./identity/ package
#make and run request module
mvn -f ./request/ package

chmod +x ./gateway/target/gateway-1.0-SNAPSHOT.jar
chmod +x ./identity/target/identity-1.0-SNAPSHOT.jar
chmod +x ./request/target/request-1.0-SNAPSHOT.jar

java -jar ./gateway/target/*.jar &
java -jar ./identity/target/*.jar &
java -jar ./request/target/*.jar &

#run angular
cd ./angular/
ng serve --open

