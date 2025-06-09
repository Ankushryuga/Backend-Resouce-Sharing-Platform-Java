package com.ankush.Resource_sharing_app.exception.UsersExceptions;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String message) {
        super(message);
    }
}
