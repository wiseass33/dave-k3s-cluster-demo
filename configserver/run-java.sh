#!/bin/sh
echo $PATH
export TZ="America/New_York"
java -Djava.net.preferIPv4Stack=true -jar /app/configserver.jar