package com.appdynamics.fargate.dto.amazon;

class Limits {
    private float CPU;
    private float Memory;


    // Getter Methods

    public float getCPU() {
        return CPU;
    }

    public float getMemory() {
        return Memory;
    }

    // Setter Methods

    public void setCPU(float CPU) {
        this.CPU = CPU;
    }

    public void setMemory(float Memory) {
        this.Memory = Memory;
    }
}
