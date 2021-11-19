#!/bin/bash

DEPLOY_PATH=/home/ec2-user/
APPLICATION_NAME=TESTAPP.jar

nohup java -jar ${DEPLOY_PATH}${APPLICATION_NAME} &