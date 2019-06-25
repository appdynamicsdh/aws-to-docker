

package com.appdynamics.fargate.dto.docker;

import com.google.common.base.Optional;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Data
@Setter(AccessLevel.NONE)
@NoArgsConstructor
@AllArgsConstructor
public class DockerContainerFull {

    private  String id;


    private  String hostName;


    private  String hostId;


    private ContainerPropertiesDto containerPropertiesDto;

    private Optional<ImagePropertiesDto> imagePropertiesDto;

    private Map<String, String> k8sContainerTags;
}
