package com.ankush.Resource_sharing_app.exception.UsersExceptions;

public class UserExistsByName extends RuntimeException {
    public UserExistsByName(String message) {
        super("User already exists with the name: "+message);
    }
}
