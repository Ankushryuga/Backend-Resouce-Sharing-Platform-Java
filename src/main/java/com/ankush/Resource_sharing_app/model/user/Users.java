package com.ankush.Resource_sharing_app.model.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Users{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String username;


    private String email;

    @Convert(converter = UserSpecificFoldersConverter.class)
    @Column(name = "user_specific_folders", columnDefinition = "TEXT")
    private List<UserSpecificFolders> folder;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public @NotNull String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserSpecificFolders> getFolder() {
        return folder;
    }

    public void setFolder(List<UserSpecificFolders> folder) {
        this.folder = folder;
    }
}


