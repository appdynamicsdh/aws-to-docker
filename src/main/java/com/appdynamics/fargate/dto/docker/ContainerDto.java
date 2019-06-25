package com.appdynamics.fargate.dto.docker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class ContainerDto {
    @JsonProperty("Names")
    private List<String> names;
    @JsonProperty("Image")
    private String image;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Id")
    private String id;
}