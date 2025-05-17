package com.ankush.Resource_sharing_app.dto.TaskDTO;

//This file contains all the information for task request parameter for creating new taks

import com.ankush.Resource_sharing_app.model.Attachment;
import com.ankush.Resource_sharing_app.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public class TaskRequestDTO {
    @NotBlank(message = "Task Name is required")
    private String taskName;

    private TaskStatus status;

    private String taskDescription;

    private List<Attachment> attachments; // This is raw JSON string

    @NotNull(message = "CreatedBy is required")
    private String createdBy;

    @NotNull(message = "Created date is required")
    private LocalDate createdAt;

    public @NotBlank(message = "Task Name is required") String getTaskName() {
        return taskName;
    }

    public void setTaskName(@NotBlank(message = "Task Name is required") String taskName) {
        this.taskName = taskName;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public @NotNull(message = "CreatedBy is required") String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(@NotNull(message = "CreatedBy is required") String createdBy) {
        this.createdBy = createdBy;
    }

    public @NotNull(message = "Created date is required") LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NotNull(message = "Created date is required") LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
