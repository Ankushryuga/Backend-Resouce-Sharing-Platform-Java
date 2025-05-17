package com.ankush.Resource_sharing_app.dto.UserDTO;

import com.ankush.Resource_sharing_app.model.user.UserSpecificFolders;
import com.ankush.Resource_sharing_app.model.user.UserSpecificFoldersConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

/**
 * This file contains all the information for User Request DTO.
 */

public class UserRequestDTO {

    @NotBlank(message = "username is required")
    @Size(max=100, message = "username cannot exceed 100 characters")
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    private List<UserSpecificFolders> folder;

    public @NotBlank(message = "username is required") @Size(max = 100, message = "username cannot exceed 100 characters") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "username is required") @Size(max = 100, message = "username cannot exceed 100 characters") String username) {
        this.username = username;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public List<UserSpecificFolders> getFolder() {
        return folder;
    }

    public void setFolder(List<UserSpecificFolders> folder) {
        this.folder = folder;
    }
}
