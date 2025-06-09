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

    private int statusId;

    private String taskDescription;

    private List<Attachment> attachments; // This is raw JSON string

    @NotNull(message = "Sprint is required")
    private int sprintId;

    private String type;

    private int resolutionId;

    private String assignee;

    private int priorityId;

    private String reporter;

    private LocalDate dueDate;

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @NotNull(message = "CreatedBy is required")
    private String createdBy;

    private LocalDate createdAt;

    public @NotBlank(message = "Task Name is required") String getTaskName() {
        return taskName;
    }

    public void setTaskName(@NotBlank(message = "Task Name is required") String taskName) {
        this.taskName = taskName;
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

    @NotNull(message = "Sprint is required")
    public int getSprintId() {
        return sprintId;
    }

    public void setSprintId(@NotNull(message = "Sprint is required") int sprintId) {
        this.sprintId = sprintId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(int resolutionId) {
        this.resolutionId = resolutionId;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public @NotNull(message = "CreatedBy is required") String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(@NotNull(message = "CreatedBy is required") String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
