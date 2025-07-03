package com.ankush.Resource_sharing_app.dto.SprintDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class SprintRequestDTO {

//    @NotNull(message = "Sprint id is required")
//    private int sprintId;

    @NotBlank(message = "Sprint name is required")
    private String sprintName;

    private int workStreamId;

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
