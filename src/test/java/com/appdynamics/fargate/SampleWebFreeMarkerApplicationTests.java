/*
 * Copyright 2012-2018 the original author or authors.
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

import java.util.List;

import com.appdynamics.fargate.dto.docker.ContainerPropertiesDto;
import com.appdynamics.fargate.dto.docker.DockerStats;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Basic integration tests for FreeMarker application.
 *
 * @author Phillip Webb
 * @author Andy Wilkinson
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SampleWebFreeMarkerApplicationTests {


    @Test
    public void testSingleContainerResponse() throws Exception{
       ObjectMapper mapper = new ObjectMapper();

        String userDataJSON =  MockAPIResponses.getDataForUrl(MockAPIResponses.CONTAINER_URL);

        System.out.println(userDataJSON);
        ContainerPropertiesDto userFromJSON = mapper.readValue(userDataJSON, ContainerPropertiesDto.class);
        System.out.println(userFromJSON);

    }

    @Test
    public void testMultipleContainersResponse() throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        String userDataJSON =  MockAPIResponses.getDataForUrl("/containers/json");

        System.out.println(userDataJSON);
        List userFromJSON = mapper.readValue(userDataJSON, List.class);
        System.out.println(userFromJSON);

    }

    @Test
    public void testSingleContainerStatsResponse() throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        String userDataJSON =  MockAPIResponses.getDataForUrl("/stats");

        System.out.println(userDataJSON);
        DockerStats userFromJSON = mapper.readValue(userDataJSON, DockerStats.class);
        System.out.println(userFromJSON);

    }



	/*@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testFreeMarkerTemplate() {
		ResponseEntity<String> entity = this.testRestTemplate.getForEntity("/",
				String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("Hello, Andy");
	}

	@Test
	public void testFreeMarkerErrorTemplate() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);

		ResponseEntity<String> responseEntity = this.testRestTemplate
				.exchange("/does-not-exist", HttpMethod.GET, requestEntity, String.class);

		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
		assertThat(responseEntity.getBody())
				.contains("Something went wrong: 404 Not Found");
	}*/

}
