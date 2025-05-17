package com.ankush.Resource_sharing_app.model.tasks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class TaskResolution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resolutionId;

    @NotNull
    private String resolutionName;

    public int getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(int resolutionId) {
        this.resolutionId = resolutionId;
    }

    public @NotNull String getResolutionName() {
        return resolutionName;
    }

    public void setResolutionName(@NotNull String resolutionName) {
        this.resolutionName = resolutionName;
    }
}

