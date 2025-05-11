package com.ankush.Resource_sharing_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "task_history")
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id", nullable = false)
    private Tasks task;

    @Column(nullable = false)
    private String oldTaskName;

    @Column(nullable = false)
    private String newTaskName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus oldStatus;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus newStatus;

    private String oldTaskDescription;

    private String newTaskDescription;



    @Convert(converter = AttachmentConverter.class)
    @Column(name = "oldAttachments", columnDefinition = "TEXT")  // Store JSON as text
    private List<Attachment> oldAttachments;

    @Convert(converter = AttachmentConverter.class)
    @Column(name = "newAttachments", columnDefinition = "TEXT")  // Store JSON as text
    private List<Attachment> newAttachments;

    @Column(nullable = false)
    private String changedBy;

    @Column(nullable = false)
    private LocalDateTime changedAt;

    private String comment;

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Tasks getTask() {
        return task;
    }

    public void setTask(Tasks task) {
        this.task = task;
    }

    public String getOldTaskName() {
        return oldTaskName;
    }

    public void setOldTaskName(String oldTaskName) {
        this.oldTaskName = oldTaskName;
    }

    public String getNewTaskName() {
        return newTaskName;
    }

    public void setNewTaskName(String newTaskName) {
        this.newTaskName = newTaskName;
    }

    public TaskStatus getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(TaskStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    public TaskStatus getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(TaskStatus newStatus) {
        this.newStatus = newStatus;
    }

    public String getOldTaskDescription() {
        return oldTaskDescription;
    }

    public void setOldTaskDescription(String oldTaskDescription) {
        this.oldTaskDescription = oldTaskDescription;
    }

    public String getNewTaskDescription() {
        return newTaskDescription;
    }

    public void setNewTaskDescription(String newTaskDescription) {
        this.newTaskDescription = newTaskDescription;
    }

    public List<Attachment> getOldAttachments() {
        return oldAttachments;
    }

    public void setOldAttachments(List<Attachment> oldAttachments) {
        this.oldAttachments = oldAttachments;
    }

    public List<Attachment> getNewAttachments() {
        return newAttachments;
    }

    public void setNewAttachments(List<Attachment> newAttachments) {
        this.newAttachments = newAttachments;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
