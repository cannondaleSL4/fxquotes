#!/usr/bin/env bash

#package for entity module
cd ./entity
mvn package

#make and run gateway module
cd ../gateway/
mvn spring-boot:run

