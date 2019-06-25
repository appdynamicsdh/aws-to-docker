package com.appdynamics.fargate.dto.docker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ServerDto {
    @JsonProperty("Architecture")
    private String architecture;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ID")
    private String id;
}
