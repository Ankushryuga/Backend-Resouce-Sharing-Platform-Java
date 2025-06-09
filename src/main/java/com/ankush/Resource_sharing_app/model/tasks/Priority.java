package com.ankush.Resource_sharing_app.model.tasks;

import com.ankush.Resource_sharing_app.model.Tasks;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int priorityId;

    @NotNull
    private String priorityName;


    @OneToMany(mappedBy = "priority", cascade = CascadeType.ALL)
    private List<Tasks> tasks=new ArrayList<>();

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

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}

