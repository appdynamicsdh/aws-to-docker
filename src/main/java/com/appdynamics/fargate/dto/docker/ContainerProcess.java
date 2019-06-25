package com.appdynamics.fargate.dto.docker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Builder
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class ContainerProcess {
    private final String pid;
    private final String pctCpu;
    private final String command;
}
