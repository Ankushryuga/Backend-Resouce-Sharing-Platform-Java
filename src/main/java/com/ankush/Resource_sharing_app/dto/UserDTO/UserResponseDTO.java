package com.ankush.Resource_sharing_app.dto.UserDTO;

import com.ankush.Resource_sharing_app.model.user.UserRoles;
import com.ankush.Resource_sharing_app.model.user.UserSpecificFolders;
import java.util.List;

public class UserResponseDTO {
    private Long userId;
    private String username;
    private String email;
    private UserRoles roleType;

    public UserRoles getRoleType() {
        return roleType;
    }

    public void setRoleType(UserRoles roleType) {
        this.roleType = roleType;
    }

    private List<UserSpecificFolders> folder;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
