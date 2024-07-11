package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity(name="devices")
public class device1 {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;

    @Size(min=1, message = "enter a valid name for device")
    private String name;

    @Convert(converter = InterfacesConverter.class)
    @Column(columnDefinition = "json")
    private Interfaces interfaces;


    @Convert(converter = MatadataAttributeConverter.class)
    @Column(columnDefinition = "json")
    private matadata matadata;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Interfaces getInterfaces() {
        return interfaces;
    }

    public com.example.demo.matadata getMatadata() {
        return matadata;
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

    public void setMatadata(com.example.demo.matadata matadata) {
        this.matadata = matadata;
    }

    @Override
    public String toString() {
        return "device1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", interfaces=" + interfaces +
                ", matadata=" + matadata +
                '}';
    }
}
