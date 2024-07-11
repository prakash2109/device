package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//@Entity
public class matadata {
    @Size(min = 1, message = "enter hostname for device")
    private String HostName;
    @Size(min = 1, message = "enter description for device")
    private String description;

    public matadata(String hostName, String description) {
        HostName = hostName;
        this.description = description;
    }

    public matadata() {

    }

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
