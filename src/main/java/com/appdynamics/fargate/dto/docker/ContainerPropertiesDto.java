//maps to http://13.58.169.65:8080/containers/json

//maps to http://13.58.169.65:8080/containers/a4b11360569fef1a3552a7644bcae852cfdd424a829662752fca83b90e71b23f/json

package com.appdynamics.fargate.dto.docker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Collections;
import java.util.List;
import java.util.Map;


@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class ContainerPropertiesDto {

    @JsonProperty("Id")
    @NonNull private String containerId;

    @JsonProperty("Name")
    @NonNull private String name;

    @JsonProperty("HostConfig")
    private HostConfig hostConfig;
    @JsonProperty("Config")
    private Config config;
    @JsonProperty("Created")
    @NonNull private String createdAt;
    @JsonProperty("Image")
    @NonNull private String imageId;
    @JsonProperty("State")
    private State state;
    @JsonProperty("Mounts")
    @NonNull private List<Mount> mounts;

    @JsonProperty("NetworkSettings")
    @NonNull private NetworkSettings networkSettings;

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class HostConfig {
        @JsonProperty("CpuShares")
        private long cpuShares;
        @JsonProperty("CpuQuota")
        private long cpuQuota;
        @JsonProperty("CpuPeriod")
        private long cpuPeriod;
        @JsonProperty("NanoCpus")
        private long nanoCpus;
        @JsonProperty("CpusetCpus")
        private String cpuSet;
        @JsonProperty("Memory")
        private long memoryLimit;
        @JsonProperty("MemorySwap")
        private long memorySwap;
        @JsonProperty("MemoryReservation")
        private long memoryReservation;

        @JsonProperty("NetworkMode")
        private String networkMode;
    }

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Config {

        @JsonProperty("Image")
        private String imageName;

        @JsonProperty("Hostname")
        private String hostName;

        @JsonProperty("Labels")
        private Map<String, String> labels = Collections.emptyMap();
    }

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Mount {
        @JsonProperty("Name")
        private String name;
        @JsonProperty("Type")
        private String type;
        @JsonProperty("Source")
        private String source;
        @JsonProperty("Destination")
        private String destination;
    }

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class State {
        @JsonProperty("StartedAt")
        private String startedAt;

        @JsonProperty("Pid")
        @NonNull private String containerPid;
    }

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class NetworkSettings {
        @JsonProperty("Ports")
        private Map<String, List<HostPort>> containerPortToHostPort;
    }

    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class HostPort {
        @JsonProperty("HostPort")
        private String hostPort;
    }
}