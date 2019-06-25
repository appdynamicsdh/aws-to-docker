package com.appdynamics.fargate.dto.docker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Collections;
import java.util.List;
import java.util.Map;


//Docker Stats.

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class DockerStats {
    @JsonProperty("read")
    @NonNull private String timeStamp;
    @JsonProperty("networks")
    private Map<String, NetworkInfo> networksInfoMap = Collections.emptyMap();
    @JsonProperty("blkio_stats")
    private BlkIOObject blkIOObject;
    @JsonProperty("memory_stats")
    @NonNull private Memory memory;
    @JsonProperty("precpu_stats")
    @NonNull private Cpus preCpus;
    @JsonProperty("cpu_stats")
    @NonNull private Cpus cpus;



    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class NetworkInfo {
        @JsonProperty("rx_bytes")
        private long rxBytes;
        @JsonProperty("tx_bytes")
        private long txBytes;
        @JsonProperty("rx_packets")
        private long rxPackets;
        @JsonProperty("tx_packets")
        private long txPackets;
        @JsonProperty("rx_errors")
        private long rxErrors;
        @JsonProperty("tx_errors")
        private long txErrors;
        @JsonProperty("rx_dropped")
        private long rxDropped;
        @JsonProperty("tx_dropped")
        private long txDropped;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Memory {
        @JsonProperty("usage")
        private long memUsage;
        @JsonProperty("limit")
        private long memLimit;
        @JsonProperty("failcnt")
        private long failCount;
        @JsonProperty("stats")
        private StatsObject statsObject;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class StatsObject {
        @JsonProperty("cache")
        private long cache;
        @JsonProperty("rss")
        private long rss;
        @JsonProperty("pgmajfault")
        private long pageMaFault;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class BlkIOObject {
        @JsonProperty("io_service_bytes_recursive")
        private List<DiskInfo> bytesInfo;
        @JsonProperty("io_serviced_recursive")
        private List<DiskInfo> countInfo;
        @JsonProperty("io_queue_recursive")
        private List<DiskInfo> queueInfo;
        @JsonProperty("io_service_time_recursive")
        private List<DiskInfo> serviceTimeInfo;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    @VisibleForTesting
    public static class Cpus {
        @JsonProperty("cpu_usage")
        private CpuUsageStats cpuUsageStats;
        @JsonProperty("system_cpu_usage")
        private long systemCpuUsage;
        @JsonProperty("throttling_data")
        private Map<String, Long> throttlingData;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PUBLIC)
    @VisibleForTesting
    public static class CpuUsageStats {
        @JsonProperty("total_usage")
        private long cpuUsage;
        @JsonProperty("percpu_usage")
        private List<Long> perCpuUsage;
    }


    @Data
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class DiskInfo {
        @JsonProperty("major")
        private long major;
        @JsonProperty("minor")
        private long minor;
        @JsonProperty("value")
        private long value;
        @JsonProperty("op")
        private String op;
    }
}
