package com.ankush.Resource_sharing_app.dto.WorkStreamsDTO;

import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.model.user.Users;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class WorkStreamsResponseDTO {

    private int workStreamId;
    private String contentName;
    private String contentDescription;
    private String owner;

    private List<Users> managers;

    private List<Users> reporters;

    private List<Users> contributers;

    private List<Users> testers;

    private List<Tasks> tasks;

    public int getWorkStreamId() {
        return workStreamId;
    }

    public void setWorkStreamId(int workStreamId) {
        this.workStreamId = workStreamId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Users> getManagers() {
        return managers;
    }

    public void setManagers(List<Users> managers) {
        this.managers = managers;
    }

    public List<Users> getReporters() {
        return reporters;
    }

    public void setReporters(List<Users> reporters) {
        this.reporters = reporters;
    }

    public List<Users> getContributers() {
        return contributers;
    }

    public void setContributers(List<Users> contributers) {
        this.contributers = contributers;
    }

    public List<Users> getTesters() {
        return testers;
    }

    public void setTesters(List<Users> testers) {
        this.testers = testers;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
