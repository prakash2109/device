package com.example.demo;

import jakarta.validation.constraints.Size;

public class Interfaces {

    @Size(min = 1, message = "enter name for interface")
    private String name;
    @Size(min = 1, message = "enter description for interface")
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
