package com.ankush.Resource_sharing_app.model;

import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.tasks.Priority;
import com.ankush.Resource_sharing_app.model.tasks.TaskResolution;
import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JoinColumn(name="sprint_id")
    @JsonBackReference
    private Sprints sprints;

    @NotNull
    private String taskName;

    @ManyToOne
    @JoinColumn(name="status_id")
    private TaskStatus status;

    private String taskDescription;

    @Convert(converter = AttachmentConverter.class)
    @Column(name = "attachments", columnDefinition = "TEXT")  // Store JSON as text
    private List<Attachment> attachments; // This is raw JSON string

    private String type;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;

//    private int resolutionId;

    @ManyToOne
    @JoinColumn(name="resolution_id")
    private TaskResolution resolution;

    private String assignee;

    private String reporter;

    private LocalDate dueDate;

    private String createdBy;

    private String updatedBy;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    // Getters and setters for other fields


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public Sprints getSprints() {
        return sprints;
    }

    public void setSprints(Sprints sprints) {
        this.sprints = sprints;
    }

    public @NotNull String getTaskName() {
        return taskName;
    }

    public void setTaskName(@NotNull String taskName) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
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
}
