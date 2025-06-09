package com.ankush.Resource_sharing_app.dto.SprintDTO;

public class SprintResponseDTO {
    private int sprintId;
    private String sprintName;
    private int workStreamId;


    public int getSprintId() {
        return sprintId;
    }

    public void setSprintId(int sprintId) {
        this.sprintId = sprintId;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public int getWorkStreamId() {
        return workStreamId;
    }

    public void setWorkStreamId(int workStreamId) {
        this.workStreamId = workStreamId;
    }
}
