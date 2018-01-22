#!/bin/bash
ng build --prod
docker build -t angular:prod .
docker run -p 8080 angular:prod
