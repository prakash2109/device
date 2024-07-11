package com.example.demo;

import jakarta.validation.constraints.Size;

public class Metadata {
    @Size(min = 1, message = "enter hostname for device")
    private String HostName;
    @Size(min = 1, message = "enter description for device")
    private String description;

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHostName() {
        return HostName;
    }

    public String getDescription() {
        return description;
    }

}