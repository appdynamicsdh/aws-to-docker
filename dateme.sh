#!/bin/bash
 
startTime=$(date +%s%3N)
 
 
#base 64 auth key
login="user1@customer1:password"
 
#controller info
host=xyz
applicationID=99
port=80
 
#authenticate with the controller so we can invoke the REST API
curl --verbose -sI -c /tmp/session.dat --user ${login} -X GET http://${host}:${port}/auth?action=login
 
PARAMS="events?eventtype=BUILD&customeventtype=JENKINS&summary=application-deploy-v1.0.$BUILD_NUMBER&severity=INFO&tier=docker-data-services"
  
#send an event noting the new build / deployment
curl -s -b /tmp/session.dat --max-time 120 --data "${PARAMS}" http://${host}:${port}/controller/rest/applications/${applicationID}/events
echo
echo
 
rm /tmp/session.dat 

##Run a test 
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
	  --user ${login} \
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

RESULT=`curl --max-time 120 --verbose --user "user1@customer1:welcome" -X GET  http://192.168.86.57:32774/controller/rest/applications/6/problems/healthrule-violations?time-range-type=BETWEEN_TIMES\&start-time=${startTime}\&end-time=${endTime}`

if [ "$RESULT" = "<policy-violations></policy-violations>" ]
then
      echo "$RESULT no violations"
	  exit 0
else
      echo "$RESULT contains violations"
	  exit 1
fi
