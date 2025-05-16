package com.ankush.Resource_sharing_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @NotNull
    private String taskName;

    @NotNull
    // @Enumerated(EnumType.STRING)
    @Column(name = "task_status")
    private int status;
    // @org.hibernate.annotations.ColumnDefault("'NEW'")
    // private TaskStatus status=TaskStatus.NEW;

    private String taskDescription;

    @Convert(converter = AttachmentConverter.class)
    @Column(name = "attachments", columnDefinition = "TEXT")  // Store JSON as text
    private List<Attachment> attachments; // This is raw JSON string

    private String type;

    private int priorityId; 

    private int resolutionId;

    private String assignee;

    private String reporter;

    private int statusId;

    private LocalDate dueDate;

    private String createdBy;

    private String updatedBy;

    private LocalDate createdAt;

    private LocalDate updatedAt;


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public @NotNull String getTaskName() {
        return taskName;
    }

    public void setTaskName(@NotNull String taskName) {
        this.taskName = taskName;
    }

    // public @NotNull TaskStatus getStatus() {
    //     return status;
    // }
    public @NotNull int getStatus(){
        return status;
    }

    // public void setStatus(@NotNull TaskStatus status) {
    //     this.status = status;
    // }
    public void setStatus(@NotNull int status){
        this.status=status;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

// Getters and setters for other fields
}
