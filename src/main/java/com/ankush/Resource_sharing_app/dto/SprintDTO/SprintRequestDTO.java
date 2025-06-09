package com.ankush.Resource_sharing_app.dto.SprintDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SprintRequestDTO {

//    @NotNull(message = "Sprint id is required")
//    private int sprintId;

    @NotBlank(message = "Sprint name is required")
    private String sprintName;

    private int workStreamId;

    public int getWorkStreamId() {
        return workStreamId;
    }

    public void setWorkStreamId(int workStreamId) {
        this.workStreamId = workStreamId;
    }

    public @NotBlank(message = "Sprint name is required") String getSprintName() {
        return sprintName;
    }

    public void setSprintName(@NotBlank(message = "Sprint name is required") String sprintName) {
        this.sprintName = sprintName;
    }

//    @NotNull(message = "Sprint id is required")
//    public int getSprintId() {
//        return sprintId;
//    }
//
//    public void setSprintId(@NotNull(message = "Sprint id is required") int sprintId) {
//        this.sprintId = sprintId;
//    }
}
