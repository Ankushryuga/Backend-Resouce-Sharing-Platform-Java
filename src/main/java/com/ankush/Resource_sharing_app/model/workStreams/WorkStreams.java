package com.ankush.Resource_sharing_app.model.workStreams;

import com.ankush.Resource_sharing_app.model.Tasks;
import com.ankush.Resource_sharing_app.model.sprints.Sprints;
import com.ankush.Resource_sharing_app.model.user.Users;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/***
 * In future, will add department based on department, UI and data must come for digital, marketing etc..
 *
 */
@Entity
public class WorkStreams{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="workstream_id")
    private int workStreamId;

    @NotNull
    private String contentName;

    private String contentDescription;

    @Column(nullable = false)
    private Boolean active=true;    //default

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @NotNull    //later will add array of manager, contributers, etc...
    private String owner;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "workstream_managers", joinColumns = @JoinColumn(name="workstream_id"), inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<Users> managers=new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="workstream_reporters", joinColumns = @JoinColumn(name="workstream_id"), inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<Users> reporters=new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="workstream_contributors", joinColumns = @JoinColumn(name="workstream_id"), inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<Users> contributers=new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="workstream_testers", joinColumns = @JoinColumn(name = "workstream_id"), inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<Users> testers=new ArrayList<>();

    @OneToMany(mappedBy = "workStreams", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sprints> tasks=new ArrayList<>();


    @OneToMany(mappedBy = "workStreams", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sprints> sprints=new ArrayList<>();

    private LocalDate createdAt;

    private LocalDate updatedAt;


    public int getWorkStreamId() {
        return workStreamId;
    }

    public void setWorkStreamId(int workStreamId) {
        this.workStreamId = workStreamId;
    }

    public @NotNull String getContentName() {
        return contentName;
    }

    public void setContentName(@NotNull String contentName) {
        this.contentName = contentName;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public @NotNull String getOwner() {
        return owner;
    }

    public void setOwner(@NotNull String owner) {
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

    public List<Sprints> getTasks() {
        return tasks;
    }

    public void setTasks(List<Sprints> tasks) {
        this.tasks = tasks;
    }

    public List<Sprints> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprints> sprints) {
        this.sprints = sprints;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}