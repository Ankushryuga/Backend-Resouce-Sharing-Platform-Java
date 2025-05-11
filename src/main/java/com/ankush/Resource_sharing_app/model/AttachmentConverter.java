package com.ankush.Resource_sharing_app.model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Collections;
import java.util.List;

@Converter
public class AttachmentConverter implements AttributeConverter<List<Attachment>, String> {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Attachment> attachments) {
        try {
            return attachments == null ? null : mapper.writeValueAsString(attachments);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize attachments", e);
        }
    }

    @Override
    public List<Attachment> convertToEntityAttribute(String json) {
        try {
            if (json == null || json.isEmpty()) return Collections.emptyList();
            return mapper.readValue(json,
                    mapper.getTypeFactory().constructCollectionType(List.class, Attachment.class));
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize attachments", e);
        }
    }
}
