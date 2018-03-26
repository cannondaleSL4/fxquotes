#!/usr/bin/env bash

#package for entity module
cd ./entity
mvn package

#make and run gateway module
cd ../gateway/
mvn spring-boot:run

#make and run identity module
cd ../identity/
mvn spring-boot:run

#make and run request module
cd ../request
mvn spring-boot:run

#run angular
cd ../angular/
fuser -k 4200/tcp
ng serve --open

