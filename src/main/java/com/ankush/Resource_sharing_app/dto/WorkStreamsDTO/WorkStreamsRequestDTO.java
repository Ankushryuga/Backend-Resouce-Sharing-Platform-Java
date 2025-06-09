package com.ankush.Resource_sharing_app.dto.WorkStreamsDTO;

import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.user.Users;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.apache.catalina.User;

import java.util.List;
import java.util.UUID;

public class WorkStreamsRequestDTO {

    @NotBlank(message = "Workstream name is required")
    @Size(max=100, message = "Workstream name cannot exceed 100 characters")
    private String contentName;

    private String contentDescription;

    @NotBlank(message = "Workstream owner is required")
    private String owner;

    private List<Long> managers;

    private List<Long> reporters;

    private List<Long> contributers;

    private List<Long> testers;

    private List<Integer> sprints;

    public @NotBlank(message = "Workstream name is required") @Size(max = 100, message = "Workstream name cannot exceed 100 characters") String getContentName() {
        return contentName;
    }

    public void setContentName(@NotBlank(message = "Workstream name is required") @Size(max = 100, message = "Workstream name cannot exceed 100 characters") String contentName) {
        this.contentName = contentName;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public @NotBlank(message = "Workstream owner is required") String getOwner() {
        return owner;
    }

    public void setOwner(@NotBlank(message = "Workstream owner is required") String owner) {
        this.owner = owner;
    }

    public List<Long> getManagers() {
        return managers;
    }

    public void setManagers(List<Long> managers) {
        this.managers = managers;
    }

    public List<Long> getReporters() {
        return reporters;
    }

    public void setReporters(List<Long> reporters) {
        this.reporters = reporters;
    }

    public List<Long> getContributers() {
        return contributers;
    }

    public void setContributers(List<Long> contributers) {
        this.contributers = contributers;
    }

    public List<Long> getTesters() {
        return testers;
    }

    public void setTesters(List<Long> testers) {
        this.testers = testers;
    }

    public List<Integer> getSprints() {
        return sprints;
    }

    public void setSprints(List<Integer> sprints) {
        this.sprints = sprints;
    }
}

