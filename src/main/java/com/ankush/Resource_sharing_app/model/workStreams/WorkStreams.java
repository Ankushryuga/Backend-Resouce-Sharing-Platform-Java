package com.ankush.Resource_sharing_app.model.workStreams;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class WorkStreams{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int contentId;

    @NotNull
    private String contentName;

    @NotNull    //later will add array of manager, contributers, etc...
    private String owner;

    private List<userId> managers;

    private List<userId> reporters;

    private List<userId> contributers;

    private List<userId> testers;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    public int getContentId(){
        return contentId;
    }
    public void setContentId(int contentId){
        this.contentId=contentId;
    }  
    public @NotNull String getContentName(){
        return contentName;
    }
    public void setContentName(String contentName){
        this.contentName=contentName;
    }
    public @NotNull String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public LocalDate getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt){
        this.createdAt=createdAt;
    }
    public LocalDate updatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(LocalDate updatedAt){
        this.updatedAt=updatedAt;
    }
    public List<userId> getManagers(){
        return managers;
    }
    public void setManagers(List<userId> managers){
        this.managers=managers;
    }
    public List<userId> getReporters(){
        return reporters
    }
    public void setReporters(List<userId> reporters){
        this.reporters=reporters;
    }
    public List<userId> getContributers(){
        return contributers;
    }
    public void setContributers(List<userId> contributers){
        this.contributers=contributers;
    }
    public List<userId> getTesters(){
        return testers;
    }
    public void setTesters(List<userId> testers){
        this.testers=testers;
    }
}