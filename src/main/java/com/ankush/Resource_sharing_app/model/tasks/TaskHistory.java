package com.ankush.Resource_sharing_app.model.tasks;

import com.ankush.Resource_sharing_app.model.Attachment;
import com.ankush.Resource_sharing_app.model.AttachmentConverter;
//import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyId;

    private int taskId;

//    @ManyToOne
//    @JoinColumn(name="content_id")
//    private WorkStreams workStreams;

    private String taskName;
    private String changedTaskName;

    private String taskDescription;
    private String changedTaskDescription;

    @Convert(converter = AttachmentConverter.class)
    @Column(name = "attachments", columnDefinition = "TEXT")
    private List<Attachment> attachments;

    @Convert(converter = AttachmentConverter.class)
    @Column(name = "changedAttachments", columnDefinition = "TEXT")
    private List<Attachment> changedAttachments;

    private String type;
    private String changedType;

    private int priorityId;
    private int changedPriorityId;

    private int statusId;
    private int changedStatus;

    private int resolutionId;
    private int changedResolutionId;

    private String reporter;
    private String changedReporter;

    private int watchers;
    private int changedWatchers;

    private LocalDate dueDate;
    private LocalDate changedDueDate;

    private LocalDate updatedAt;

    // Getters and Setters

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
//
//    public WorkStreams getWorkStreams() {
//        return workStreams;
//    }
//
//    public void setWorkStreams(WorkStreams workStreams) {
//        this.workStreams = workStreams;
//    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getChangedTaskName() {
        return changedTaskName;
    }

    public void setChangedTaskName(String changedTaskName) {
        this.changedTaskName = changedTaskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getChangedTaskDescription() {
        return changedTaskDescription;
    }

    public void setChangedTaskDescription(String changedTaskDescription) {
        this.changedTaskDescription = changedTaskDescription;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Attachment> getChangedAttachments() {
        return changedAttachments;
    }

    public void setChangedAttachments(List<Attachment> changedAttachments) {
        this.changedAttachments = changedAttachments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChangedType() {
        return changedType;
    }

    public void setChangedType(String changedType) {
        this.changedType = changedType;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public int getChangedPriorityId() {
        return changedPriorityId;
    }

    public void setChangedPriorityId(int changedPriorityId) {
        this.changedPriorityId = changedPriorityId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getChangedStatus() {
        return changedStatus;
    }

    public void setChangedStatus(int changedStatus) {
        this.changedStatus = changedStatus;
    }

    public int getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(int resolutionId) {
        this.resolutionId = resolutionId;
    }

    public int getChangedResolutionId() {
        return changedResolutionId;
    }

    public void setChangedResolutionId(int changedResolutionId) {
        this.changedResolutionId = changedResolutionId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getChangedReporter() {
        return changedReporter;
    }

    public void setChangedReporter(String changedReporter) {
        this.changedReporter = changedReporter;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public int getChangedWatchers() {
        return changedWatchers;
    }

    public void setChangedWatchers(int changedWatchers) {
        this.changedWatchers = changedWatchers;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getChangedDueDate() {
        return changedDueDate;
    }

    public void setChangedDueDate(LocalDate changedDueDate) {
        this.changedDueDate = changedDueDate;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
