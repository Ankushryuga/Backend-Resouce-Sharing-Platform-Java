package com.ankush.Resource_sharing_app.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class TaskStatus{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int statusId;

    @NotNull
    private String statusName;

    public void setStatusId(int statusId){
        this.statusId=statusId;
    }
    public int getStatusId(){
        return statusId;
    }
    public void setStatusName(String statusName){
        this.statusName=statusName;
    }
    public String getStatusName(){
        return statusName;
    }
}
