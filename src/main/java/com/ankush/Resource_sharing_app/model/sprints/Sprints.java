package com.ankush.Resource_sharing_app.model.sprints;

import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Sprints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sprintId;

    @ManyToOne
    @JoinColumn(name = "workstream_id")
    private WorkStreams workStreams;

    private String sprintName;

    private LocalDate startDate;

    private LocalDate endDate;

    private String createdBy;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /***
     * Will add sprint descriptions:
     * @return
     */

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public WorkStreams getWorkStreams() {
        return workStreams;
    }

    public void setWorkStreams(WorkStreams workStreams) {
        this.workStreams = workStreams;
    }

    public int getSprintId() {
        return sprintId;
    }

    public void setSprintId(int sprintId) {
        this.sprintId = sprintId;
    }
}
