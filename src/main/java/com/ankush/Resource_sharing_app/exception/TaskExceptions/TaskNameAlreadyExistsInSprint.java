package com.ankush.Resource_sharing_app.exception.TaskExceptions;

public class TaskNameAlreadyExistsInSprint extends RuntimeException {
    public TaskNameAlreadyExistsInSprint(String message) {
        super(message);
    }
}
