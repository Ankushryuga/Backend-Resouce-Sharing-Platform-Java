package com.ankush.Resource_sharing_app.model.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Collections;
import java.util.List;

@Converter(autoApply = true)  // <-- THIS is the key
public class UserSpecificFoldersConverter implements AttributeConverter<List<UserSpecificFolders>, String> {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<UserSpecificFolders> folders) {
        try {
            return folders == null ? null : mapper.writeValueAsString(folders);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize folders", e);
        }
    }

    @Override
    public List<UserSpecificFolders> convertToEntityAttribute(String json) {
        try {
            if (json == null || json.isEmpty()) return Collections.emptyList();
            return mapper.readValue(json,
                    mapper.getTypeFactory().constructCollectionType(List.class, UserSpecificFolders.class));
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize folders", e);
        }
    }
}
