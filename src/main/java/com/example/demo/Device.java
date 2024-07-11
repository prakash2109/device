package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity(name="devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;

    @Size(min=1, message = "enter a valid name for device")
    private String name;

    @Convert(converter = InterfacesConverter.class)
    @Column(columnDefinition = "json")
    private Interfaces interfaces;


    @Convert(converter = MetadataAttributeConverter.class)
    @Column(columnDefinition = "json")
    private Metadata metadata;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Interfaces getInterfaces() {
        return interfaces;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInterfaces(Interfaces interfaces) {
        this.interfaces = interfaces;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "device1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", interfaces=" + interfaces +
                ", metadata=" + metadata +
                '}';
    }
}
