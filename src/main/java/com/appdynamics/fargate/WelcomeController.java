/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appdynamics.fargate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/*
APPDYNAMICS_DOCKER_ENGINE_URL

[ec2-user@ip-172-31-14-4 machine-agent]$ ./jre/bin/java
-Dappdynamics.docker.enabled=true -Dappdynamics.docker.engine.url=http://localhost  -jar machineagent.jar



  while locating com.appdynamics.agent.sim.registration.RegistrationTask
Caused by: feign.RetryableException: Connection refused (Connection refused) executing GET http://localhost/info
        at feign.FeignException.errorExecuting(FeignException.java:67)
        at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:102)
        at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
        at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
        at com.sun.proxy.$Proxy93.getServerInfo(Unknown Source)


 */


@RestController
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/info")
	public String info() {

		return MockAPIResponses.getDataForUrl("/info");
	}

	@GetMapping("/containers/json")
	public String containersJson() {
		return MockAPIResponses.getDataForUrl("/containers/json");
	}

	@GetMapping("/containers/{containerId}/json")
	public String containerJson() {
		return MockAPIResponses.getDataForUrl(MockAPIResponses.CONTAINER_URL);
	}

	@GetMapping("/containers/{containerId}/top")
	public String containers(@PathVariable String containerId) {
		return MockAPIResponses.getDataForUrl("/containers/"+ MockAPIResponses.DEFAULT_CONTAINER_ID+"/top?ps_args=aux");
	}
	@GetMapping("/images/{containerId}/json")
	public String images(@PathVariable String containerId){
		return MockAPIResponses.getDataForUrl("/images/"+ MockAPIResponses.DEFAULT_CONTAINER_ID+"/json");
	}

}
