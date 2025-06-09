package com.ankush.Resource_sharing_app.dto.UserDTO;

import com.ankush.Resource_sharing_app.model.user.UserRoles;
import com.ankush.Resource_sharing_app.model.user.UserSpecificFolders;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Role type (ADMIN, MANAGER, MEMBER) is required")
    @Enumerated(EnumType.STRING)
    private UserRoles roleType;

    public @NotNull(message = "Role type (ADMIN, MANAGER, MEMBER) is required") UserRoles getRoleType() {
        return roleType;
    }

    public void setRoleType(@NotNull(message = "Role type (ADMIN, MANAGER, MEMBER) is required") UserRoles roleType) {
        this.roleType = roleType;
    }

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
