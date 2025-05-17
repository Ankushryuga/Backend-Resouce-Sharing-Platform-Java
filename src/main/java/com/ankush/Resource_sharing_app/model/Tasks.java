package com.ankush.Resource_sharing_app.model;

import com.ankush.Resource_sharing_app.model.tasks.TaskResolution;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
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

    @ManyToOne
    @JoinColumn(name="workstream_id")
    private WorkStreams workStreams;

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

//    private int resolutionId;

    @ManyToOne
    @JoinColumn(name="resolution_id")
    private TaskResolution resolution;

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

    public WorkStreams getWorkStreams() {
        return workStreams;
    }

    public void setWorkStreams(WorkStreams workStreams) {
        this.workStreams = workStreams;
    }

    public @NotNull String getTaskName() {
        return taskName;
    }

    public void setTaskName(@NotNull String taskName) {
        this.taskName = taskName;
    }

    @NotNull
    public int getStatus() {
        return status;
    }

    public void setStatus(@NotNull int status) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public TaskResolution getResolution() {
        return resolution;
    }

    public void setResolution(TaskResolution resolution) {
        this.resolution = resolution;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Getters and setters for other fields
}
