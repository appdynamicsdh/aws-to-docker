package com.appdynamics.fargate.dto.docker;

import com.google.common.base.Optional;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DockerDisks {
    private Optional<Long> readCount = Optional.absent();
    private Optional<Long> writeCount = Optional.absent();
    private Optional<Long> readBytes = Optional.absent();
    private Optional<Long> writeBytes = Optional.absent();
    private Optional<Long> queueSize = Optional.absent();
    private Optional<Long> serviceTime = Optional.absent();
}
