package com.ankush.Resource_sharing_app.model.tasks;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int priorityId;

    @NotNull
    private String priorityName;

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public @NotNull String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(@NotNull String priorityName) {
        this.priorityName = priorityName;
    }
}

