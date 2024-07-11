package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class MetadataAttributeConverter implements AttributeConverter<Metadata, String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Metadata metadata) {
        if (metadata == null) {
            return null;
        } else {
            try {
                return objectMapper.writeValueAsString(metadata);
            } catch (JsonProcessingException jpe) {
                return null;
            }
        }
    }

    @Override
    public Metadata convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, Metadata.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}