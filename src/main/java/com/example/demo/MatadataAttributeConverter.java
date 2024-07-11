package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class MatadataAttributeConverter implements AttributeConverter<matadata, String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(matadata matadata) {
        if (matadata == null) {
            return null;
        } else {
            try {
                return objectMapper.writeValueAsString(matadata);
            } catch (JsonProcessingException jpe) {
                return null;
            }
        }
    }

    @Override
    public matadata convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, matadata.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}