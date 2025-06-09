package com.ankush.Resource_sharing_app.dto.WorkStreamsDTO;

import com.ankush.Resource_sharing_app.dto.SprintDTO.SprintResponseDTO;
import com.ankush.Resource_sharing_app.dto.UserDTO.UserResponseDTO;
import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.user.Users;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class WorkStreamsResponseDTO {

    private int workStreamId;
    private String contentName;
    private String contentDescription;
    private String owner;
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private List<UserResponseDTO> managers;

    private List<UserResponseDTO> reporters;

    private List<UserResponseDTO> contributers;

    private List<UserResponseDTO> testers;
//
    private List<Sprints> sprints;


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

    public List<UserResponseDTO> getManagers() {
        return managers;
    }

    public void setManagers(List<UserResponseDTO> managers) {
        this.managers = managers;
    }

    public List<UserResponseDTO> getReporters() {
        return reporters;
    }

    public void setReporters(List<UserResponseDTO> reporters) {
        this.reporters = reporters;
    }

    public List<UserResponseDTO> getContributers() {
        return contributers;
    }

    public void setContributers(List<UserResponseDTO> contributers) {
        this.contributers = contributers;
    }

    public List<UserResponseDTO> getTesters() {
        return testers;
    }

    public void setTesters(List<UserResponseDTO> testers) {
        this.testers = testers;
    }

    public List<Sprints> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprints> sprints) {
        this.sprints = sprints;
    }
}
