package com.appdynamics.fargate.dto.docker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class ImagePropertiesDto {

    @JsonProperty("Os")
    @NonNull private String osName;


    @JsonProperty("Architecture")
    @NonNull private String architecture;

}