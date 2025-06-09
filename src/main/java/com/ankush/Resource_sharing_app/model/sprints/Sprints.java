package com.ankush.Resource_sharing_app.model.sprints;

import com.ankush.Resource_sharing_app.model.workStreams.WorkStreams;
import jakarta.persistence.*;

@Entity
public class Sprints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sprintId;

    @ManyToOne
    @JoinColumn(name = "workstream_id")
    private WorkStreams workStreams;

    private String sprintName;


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
