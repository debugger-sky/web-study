#!/bin/bash

DEPLOY_PATH=/home/ec2-user/
APPLICATION_NAME=TESTAPP

echo "> 현재 실행중인 tomcat pid 확인"
CURRENT_PID=$(pgrep -f $APPLICATION_NAME)

if [ -z "$CURRENT_PID" ]
then
  echo "> 현재 구동중인 application 이 없으므로 종료하지 않습니다."
else
  echo "> kill -9 $CURRENT_PID"
  kill -9 "$CURRENT_PID"
  sleep 5
fi

# application 삭제
rm -rf "${DEPLOY_PATH}${APPLICATION_NAME}*"