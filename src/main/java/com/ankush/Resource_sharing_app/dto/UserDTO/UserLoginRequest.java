package com.ankush.Resource_sharing_app.dto.UserDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserLoginRequest {
    @NotBlank(message = "username or email is required")
    @NotNull
    private String userrnameOrEmail;

//    private String userPassword;

    public @NotBlank(message = "username or email is required") @NotNull String getUserrnameOrEmail() {
        return userrnameOrEmail;
    }

    public void setUserrnameOrEmail(@NotBlank(message = "username or email is required") @NotNull String userrnameOrEmail) {
        this.userrnameOrEmail = userrnameOrEmail;
    }
}
