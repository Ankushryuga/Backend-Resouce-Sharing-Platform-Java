package com.ankush.Resource_sharing_app.model.tasks;

import com.ankush.Resource_sharing_app.model.Tasks;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskResolution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resolutionId;

    @NotNull
    private String resolutionName;

    @OneToMany(mappedBy = "resolution", cascade = CascadeType.ALL)
    private List<Tasks> tasks=new ArrayList<>();


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

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}

