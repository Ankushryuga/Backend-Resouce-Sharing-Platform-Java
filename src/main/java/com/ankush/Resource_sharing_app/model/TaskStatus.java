package com.ankush.Resource_sharing_app.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskStatus{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int statusId;

    @NotNull
    private String statusName;


    @OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
    private List<Tasks> tasks=new ArrayList<>();

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public @NotNull String getStatusName() {
        return statusName;
    }

    public void setStatusName(@NotNull String statusName) {
        this.statusName = statusName;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
