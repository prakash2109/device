package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;

public class InterfacesConverter implements AttributeConverter<Interfaces, String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Interfaces interfaces) {

        if (interfaces == null){
            return null;
        } else {
            try {
                return objectMapper.writeValueAsString(interfaces);
            } catch (JsonProcessingException jpe) {
                return null;
            }
        }
    }

    @Override
    public Interfaces convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, Interfaces.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
