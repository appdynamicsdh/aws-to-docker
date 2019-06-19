#!/bin/bash
 
## The following is a complete script to programmatically start a JMeter load test through the command-line, and then create a custom time range in AppDynamics.
 
#start time of our script (ms past epoch)
startTime=$(date +%s%3N)
 
####
##
## We may want to extend the custom time range to just before / after the test starts and we can do it like this if needed.
##
####
#startTime=$(($startTime - 240000))
 
#base 64 auth key
b64AuthKey="user1@customer1:welcome"
 
#controller info
host=192.168.86.57
applicationID=6
port=32774
 
#authenticate with the controller so we can invoke the REST API
curl --verbose -sI -c /tmp/session.dat --user ${b64AuthKey} -X GET http://${host}:${port}/auth?action=login
 
PARAMS="events?eventtype=BUILD&customeventtype=JENKINS&summary=application-deploy-v1.0.$BUILD_NUMBER&severity=INFO&tier=docker-data-services"
  
#send an event noting the new build / deployment
curl -s -b /tmp/session.dat --data "${PARAMS}" http://${host}:${port}/controller/rest/applications/${applicationID}/events
echo
echo
 
rm /tmp/session.dat 
############
#
# Programmatically push a new custom time range into the controller
#
############
 

#!/bin/bash 
COUNTER=0
while [  $COUNTER -lt 120 ]; do
	curl http://192.168.86.57:4000
	sleep 1; 
	let COUNTER=COUNTER+1 
done


 
#end time in epoch seconds
endTime=$(date +%s%3N)
 
#BUILD_NUMBER is an environment variable made available within a JENKINS JOB
timeRangeName="application-deploy-v1.0.$BUILD_NUMBER"
 
echo "Custom Time Range ${timeRangeName} - Start=${startTime}, STOP=${endTime}"
 
echo "Logging into controller..."
 
curl --verbose -sI -c /tmp/session.dat \
	  --user ${b64AuthKey} \
	    -X GET http://${host}:${port}/controller/auth?action=login
 
PARAMS="{\"name\":\"$timeRangeName\",\"description\":\"\",\"shared\":true,\"timeRange\":{\"type\":\"BETWEEN_TIMES\",\"durationInMinutes\":0,\"startTime\":${startTime},\"endTime\":${endTime}}}"

XCSRFTOKEN=$(grep "X-CSRF-TOKEN" /tmp/session.dat | awk 'NF>1{print $NF}')

curl --verbose -s -b /tmp/session.dat \
	--header "X-CSRF-TOKEN: ${XCSRFTOKEN}" \
	  --header "Content-Type: application/json;charset=utf-8" \
	      --header "Accept-Encoding: gzip, deflate" \
	        --header "Accept: application/json, text/plain" \
		  --data "${PARAMS}" \
		    http://${host}:${port}/controller/restui/user/createCustomRange
			

sleep 120

RESULT=`curl --verbose --user "user1@customer1:welcome" -X GET  http://192.168.86.57:32774/controller/rest/applications/6/problems/healthrule-violations?time-range-type=BETWEEN_TIMES\&start-time=${startTime}\&end-time=${endTime}`

if [ "$RESULT" = "<policy-violations></policy-violations>" ]
then
      echo "$RESULT no violations"
	  exit 0
else
      echo "$RESULT contains violations"
	  exit 1
fi
