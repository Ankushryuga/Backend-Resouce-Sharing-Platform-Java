package com.ankush.Resource_sharing_app.exception.UsersExceptions;

public class UserExistsByEmail extends RuntimeException {
    public UserExistsByEmail(String message) {
        super("User already exists with email: "+message);
    }
}
