#!/usr/bin/env bash

fuser -k 4200/tcp
fuser -k 9090/tcp
fuser -k 9098/tcp
fuser -k 9099/tcp
fuser -k 8761/tcp
